package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab {
    private Place place;
    private Slot timeSlot;
    private int maxCapacity;
    private LinkedList<TA> leadingTAs;
    private ArrayList<Student> permanentStudents;
    private ArrayList<Student> tempStudents;

    public Lab(Place place, Slot slot, TA ta1, TA ta2) {
        this.place = place;
        this.timeSlot = slot;
        this.maxCapacity = this.place.getMaxCapacity();

        this.leadingTAs = new LinkedList<TA>();
        this.leadingTAs.add(ta1);
        this.leadingTAs.add(ta2);

        this.permanentStudents = new ArrayList<Student>();
        this.tempStudents = new ArrayList<Student>();
    }

    public void addTA(TA newTA) {
        this.leadingTAs.add(newTA);
    }

    public int currentCapacity() {
        int capacity = 0;
        for (Student student: permanentStudents) {
            if (!student.hasTempLab()) {
                ++capacity;
            }
        }
        capacity = capacity + tempStudents.size();
        return capacity;
    }

    public boolean isFull() {
        return this.currentCapacity() == this.maxCapacity;
    }

    public void addStudent(Student newStudent) {
        if (!this.permanentStudents.contains(newStudent)) {
            this.permanentStudents.add(newStudent);
        }
    }

    public void removeStudent(Student student) {
        this.permanentStudents.remove(student);
    }

    public void addTempStudent(Student newStudent) {
        if (!this.tempStudents.contains(newStudent)) {
            this.tempStudents.add(newStudent);
        }
    }

    public void removeTempStudent(Student student) {
        this.tempStudents.remove(student);
    }
}
