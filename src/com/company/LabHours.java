package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class LabHours {
    private Place location;
    private Slot timeSlot;
    private LinkedList<TA> leadingTAs;
    private ArrayList<Student> permanentStudents;
    private ArrayList<Student> tempStudents;
    private int MaxCapacity = 15;

    public int currentCapacity() {
        return this.permanentStudents.size() + this.tempStudents.size();
    }

    public boolean isFull() {
        return this.currentCapacity() < this.MaxCapacity;
    }
}
