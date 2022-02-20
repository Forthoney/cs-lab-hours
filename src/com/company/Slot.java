package com.company;

import java.time.DayOfWeek;

public class Slot {
    private DayOfWeek day;
    private int beginTime; //four digit form e.g. 1400, 1330, 0720
    private int endTime;

    public Slot(DayOfWeek day, int beginTime) {
        this.day = day;
        this.beginTime = beginTime;
        this.endTime = this.beginTime + 200;
    }

    public Slot(DayOfWeek day, int beginTime, int endTime) {
        this.day = day;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }
}
