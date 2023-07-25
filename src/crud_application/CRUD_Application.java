package crud_application;
import com.db.DB;
import com.login.LoginFrame;

public class CRUD_Application {

    public static void main(String[] args) {
        LoginFrame loginObj = new LoginFrame();
        loginObj.show();
        
        DB.loadConnection();
    }
    
}
