//
//package com.home;
//
//public class HomeFieldsGetSet {
////    private int id;
//    private int IndexNo;
//    private String Subject;
//    private String Grade;
//
//    public HomeFieldsGetSet( int IndexNo, String Subject, String Grade) {
////        this.id = id;
//        this.IndexNo = IndexNo;
//        this.Subject = Subject;
//        this.Grade = Grade;
//    }
////
////    public int getId() {
////        return id;
////    }
////
////    public void setId(int id) {
////        this.id = id;
////    }
////
////    
//    
//    public int getIndexNo() {
//        return IndexNo;
//    }
//
//    public void setIndexNo(int IndexNumber) {
//        this.IndexNo = IndexNumber;
//    }
//
//    public String getSubject() {
//        return Subject;
//    }
//
//    public void setSubject(String Subject) {
//        this.Subject = Subject;
//    }
//
//    public String getGrade() {
//        return Grade;
//    }
//
//    public void setGrade(String Grade) {
//        this.Grade = Grade;
//    }
//    
//}
//
package com.home;

public class HomeFieldsGetSet {
    private int IndexNo;
    private String Subject;
    private String Grade;

    public HomeFieldsGetSet(int IndexNo, String Subject, String Grade) {
        this.IndexNo = IndexNo;
        this.Subject = Subject;
        this.Grade = Grade;
    }

    public int getIndexNo() {
        return IndexNo;
    }

    public void setIndexNo(int IndexNo) {
        this.IndexNo = IndexNo;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
}

