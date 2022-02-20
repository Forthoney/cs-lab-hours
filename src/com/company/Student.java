package com.company;

public class Student {
    private String fullName;
    private String login;
    //private Course prevCourse;
    private LabHours regularHours;
    private LabHours tempHours;

    public Student(String fullName, String login) {
        this.fullName = fullName;
        this.login = login;
        this.regularHours = null;
        this.tempHours = null;
    }

    public Student(String fullName, String login, LabHours signUp) {
        this.fullName = fullName;
        this.login = login;
        this.regularHours = signUp;
        this.tempHours = null;
    }

    public void tempLabRequest(LabHours requestLab) {
        if (requestLab.isFull()) {
            throw new IllegalArgumentException("The Lab is already full");
        } else {
            this.tempHours = requestLab;
        }
    }
}
