import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.mockito.Mockito;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BalNGTest {

    private Bal bal;
    private FieldsGetSet fieldsGetSet;

    @BeforeMethod
    public void setUp() {
        bal = new Bal();
        fieldsGetSet = new FieldsGetSet("John Doe", "john@example.com", "password");
    }

    @Test
    public void testInsertDataSignup() throws Exception {
        // Mock the necessary objects
        DB.con = Mockito.mock(Connection.class);
        PreparedStatement preparedStatement = Mockito.mock(PreparedStatement.class);

        // Set up the Bal object
        bal.setMockedPreparedStatement(preparedStatement);

        try {
            // Set the expectations
            Mockito.doNothing().when(preparedStatement).setString(Mockito.anyInt(), Mockito.anyString());
            Mockito.doNothing().when(preparedStatement).executeUpdate();

            // Invoke the method
            bal.insertDataSignup(fieldsGetSet);

            // Verify the method calls
            Mockito.verify(preparedStatement).setString(1, fieldsGetSet.getFullName());
            Mockito.verify(preparedStatement).setString(2, fieldsGetSet.getEmail());
            Mockito.verify(preparedStatement).setString(3, fieldsGetSet.getPassword());
            Mockito.verify(preparedStatement).executeUpdate();
        } catch (Exception e) {
            Assert.fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testCheckLogin_ValidCredentials() throws Exception {
        // Mock the necessary objects
        DB.con = Mockito.mock(Connection.class);
        Statement statement = Mockito.mock(Statement.class);
        ResultSet resultSet = Mockito.mock(ResultSet.class);

        // Set up the Bal object
        bal.setMockedStatement(statement);

        try {
            // Set the expectations
            Mockito.when(statement.executeQuery(Mockito.anyString())).thenReturn(resultSet);
            Mockito.when(resultSet.next()).thenReturn(true);

            // Invoke the method
            boolean result = bal.checkLogin(fieldsGetSet.getEmail(), fieldsGetSet.getPassword());

            // Verify the method calls
            Mockito.verify(statement).executeQuery(Mockito.anyString());
            Mockito.verify(resultSet).next();

            // Assert the result
            Assert.assertTrue(result);
        } catch (Exception e) {
            Assert.fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testCheckLogin_InvalidCredentials() throws Exception {
        // Mock the necessary objects
        DB.con = Mockito.mock(Connection.class);
        Statement statement = Mockito.mock(Statement.class);
        ResultSet resultSet = Mockito.mock(ResultSet.class);

        // Set up the Bal object
        bal.setMockedStatement(statement);

        try {
            // Set the expectations
            Mockito.when(statement.executeQuery(Mockito.anyString())).thenReturn(resultSet);
            Mockito.when(resultSet.next()).thenReturn(false);

            // Invoke the method
            boolean result = bal.checkLogin(fieldsGetSet.getEmail(), fieldsGetSet.getPassword());

            // Verify the method calls
            Mockito.verify(statement).executeQuery(Mockito.anyString());
            Mockito.verify(resultSet).next();

            // Assert the result
            Assert.assertFalse(result);
        } catch (Exception e) {
            Assert.fail("Exception occurred: " + e.getMessage());
        }
    }
}
