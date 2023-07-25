//package com.home;
//
//import com.home.HomeBal;
//import com.home.HomeFieldsGetSet;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class HomeBalNGTest {
//    private HomeBal homeBal;
//
//    @BeforeMethod
//    public void setUp() {
//        // Initialize the HomeBal object
//        homeBal = new HomeBal();
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        // Clean up any resources if needed
//    }
//
//    @Test
//    public void testLoadData() {
//        // Test the loadData method
//        List<HomeFieldsGetSet> list = homeBal.loadData();
//        Assert.assertNotNull(list);
//        Assert.assertFalse(list.isEmpty());
//    }
//
//    @Test
//    public void testInsert() {// Test the insert method
//        int initialSize = homeBal.loadData().size();
//
//        HomeFieldsGetSet homeFieldsGetSet = new HomeFieldsGetSet(0, "Maths", "A");
//        homeBal.insert(homeFieldsGetSet);
//
//        List<HomeFieldsGetSet> list = homeBal.loadData();
//        Assert.assertEquals(list.size(), initialSize + 1);
//
//        // Find the inserted record
//        boolean found = false;
//        for (HomeFieldsGetSet fieldsGetSet : list) {
//            if (fieldsGetSet.getSubject().equals("Maths") && fieldsGetSet.getGrade().equals("A")) {
//                found = true;
//                break;
//            }
//        }
//
//        // Assert that the inserted record is found
//        Assert.assertTrue(found);
//    }
//
//    @Test
//    public void testUpdateData() {
//        // Test the updateData method
//        List<HomeFieldsGetSet> list = homeBal.loadData();
//        int initialSize = list.size();
//
//        // Assuming there is at least one record in the database
//        HomeFieldsGetSet fieldsGetSet = list.get(0);
//
//        // Modify the data
//        fieldsGetSet.setSubject("Physics");
//        fieldsGetSet.setGrade("B");
//        homeBal.updateData(fieldsGetSet);
//
//        List<HomeFieldsGetSet> updatedList = homeBal.loadData();
//        Assert.assertEquals(updatedList.size(), initialSize);
//
//        // Find the updated record
//        boolean found = false;
//        for (HomeFieldsGetSet updatedFieldsGetSet : updatedList) {
//            if (updatedFieldsGetSet.getIndexNo() == fieldsGetSet.getIndexNo()
//                    && updatedFieldsGetSet.getSubject().equals("Physics")
//                    && updatedFieldsGetSet.getGrade().equals("B")) {
//                found = true;
//                break;
//            }
//        }
//
//        // Assert that the updated record is found
//        Assert.assertTrue(found);
//    }
//
//    @Test
//    public void testDeleteRecord() {
//        int indexNo = 1; 
//        homeBal.deleteRecord(indexNo);
//
//        
//        List<HomeFieldsGetSet> list = homeBal.loadData();
//
//        
//        boolean found = false;
//        for (HomeFieldsGetSet fieldsGetSet : list) {
//            if (fieldsGetSet.getIndexNo() == indexNo) {
//                found = true;
//                break;
//            }
//        }
//
//        // Assert that the deleted record is not found
//        Assert.assertFalse(found);
//    }
//}
import com.home.HomeBal;
import com.home.HomeFieldsGetSet;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeBalNGTest {
    private HomeBal homeBal;
    private int testRecordIndex;

    @BeforeMethod
    public void setUp() {
        // Initialize the HomeBal object
        homeBal = new HomeBal();
        testRecordIndex = -1; // Initialize to an invalid index
    }

    @AfterMethod
    public void tearDown() {
        // Clean up any resources if needed
        if (testRecordIndex != -1) {
            // Delete the test record after each test method
            homeBal.deleteRecord(testRecordIndex);
        }
    }

    @Test
    public void testLoadData() {
        List<HomeFieldsGetSet> list = homeBal.loadData();
        Assert.assertNotNull(list);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testInsert() {
        int initialSize = homeBal.loadData().size();

        HomeFieldsGetSet homeFieldsGetSet = new HomeFieldsGetSet(0, "Maths", "A");
        homeBal.insert(homeFieldsGetSet);

        List<HomeFieldsGetSet> list = homeBal.loadData();
        Assert.assertEquals(list.size(), initialSize + 1);

        boolean found = false;
        for (HomeFieldsGetSet fieldsGetSet : list) {
            if (fieldsGetSet.getSubject().equals("Maths") && fieldsGetSet.getGrade().equals("A")) {
                testRecordIndex = fieldsGetSet.getIndexNo(); 
                found = true;
                break;
            }
        }

      
        Assert.assertTrue(found);
    }

    @Test
    public void testUpdateData() {
        List<HomeFieldsGetSet> list = homeBal.loadData();

        HomeFieldsGetSet fieldsGetSet = list.get(0);

        fieldsGetSet.setSubject("Physics");
        fieldsGetSet.setGrade("B");
        homeBal.updateData(fieldsGetSet);

        HomeFieldsGetSet updatedFieldsGetSet = homeBal.returnAllDataToTextFields(fieldsGetSet.getIndexNo());
        Assert.assertNotNull(updatedFieldsGetSet);
        Assert.assertEquals(updatedFieldsGetSet.getSubject(), "Physics");
        Assert.assertEquals(updatedFieldsGetSet.getGrade(), "B");
    }

    // ...
}

