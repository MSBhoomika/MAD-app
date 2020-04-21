package com.example.revalform;

import com.google.firebase.firestore.Exclude;

import java.util.ArrayList;
import java.util.HashMap;

public class RevalData {
    private String documentId;
    private String usn;
    private String name;
    private String examtype;
    private HashMap<String,String> courses;
    private int numOfCourses;
    private int totalfees;
    private String date;

    public RevalData() {
        //public no-arg constructor needed
    }

    @Exclude
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public RevalData(String usn, String name, String examtype, int num, HashMap<String,String> courses, int totalfees, String date) {
        this.usn = usn;
        this.name = name;
        this.examtype=examtype;
        this.numOfCourses=num;
        this.courses=courses;
        this.totalfees=totalfees;
        this.date=date;
    }

    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public HashMap<String,String> getCourses(){
        return courses;
    }

    public int getNumOfCourses(){
        return numOfCourses;
    }

    public String getExamtype(){
        return examtype;
    }

    public int getTotalfees(){
        return totalfees;
    }

    public String getDate(){
        return date;
    }
}
