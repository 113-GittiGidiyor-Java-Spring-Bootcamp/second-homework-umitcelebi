package com.patika.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class PermanentInstructor extends Instructor{
    private int fixedSalary;

    public PermanentInstructor() {
    }

    public PermanentInstructor(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor(String name, String address, String phoneNumber, int fixedSalary) {
        super(name, address, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "PermanentInstructor{" +
                "fixedSalary=" + fixedSalary +
                '}';
    }
}
