package com.patika.model;

import javax.persistence.Entity;

@Entity
public class VisitingResearcher extends Instructor{
    private int hourlySalary;

    public VisitingResearcher(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher() {
    }

    public VisitingResearcher(String name, String address, String phoneNumber, int hourlySalary) {
        super(name, address, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hourlySalary=" + hourlySalary +
                '}';
    }
}
