package org.example;

import java.util.Date;

public class Campaign {

    public String name;
    public Date startDate;
    public Date endDate;
    public int goal;

    public Campaign(String name, Date startDate, Date endDate, int goal) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }
}
