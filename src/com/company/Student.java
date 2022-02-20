package com.company;

public class Student {
    private String fullName;
    private String login;
    //private Course prevCourse;
    private Lab regularHours;
    private Lab tempHours;

    public Student(String fullName, String login) {
        this.fullName = fullName;
        this.login = login;
        this.regularHours = null;
        this.tempHours = null;
    }

    public void registerLab(Lab requestLab) {
        if (requestLab.isFull()) {
            throw new IllegalArgumentException("Lab is already full");
        } else {
            this.regularHours = requestLab;
        }
    }

    public void permLabChange(Lab requestLab) {
        if (requestLab.isFull()) {
            throw new IllegalArgumentException("Lab is already full");
        } else {
            this.regularHours.removeStudent(this);
            this.regularHours = requestLab;
            this.regularHours.addStudent(this);
        }
    }

    public void requestTempLab(Lab requestLab) {
        if (requestLab.isFull()) {
            throw new IllegalArgumentException("Lab is already full");
        } else {
            this.resetTempLab();

            requestLab.addTempStudent(this);
            this.tempHours = requestLab;
        }
    }

    //Whenever a week of labs end, we would need to reset the tempHours so
    // that the student isn't registered for the same hours next week.
    public void resetTempLab() {
        if (this.tempHours != null) {
            this.tempHours.removeTempStudent(this);
            this.tempHours = null;
        }
    }

    public boolean hasTempLab() {
        return this.tempHours != null;
    }

    @Override
    public String toString() {
        return "Name: " + this.fullName + ". Login: " + this.login;
    }
}
