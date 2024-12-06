package org.GymManagement;

import java.util.*;
public class Member {
    private String name;
    private int age;
    private String membershipType; // "Monthly" or "Annual"
    private int remainingDays;

    public Member(String name, int age, String membershipType, int remainingDays) {
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.remainingDays = remainingDays;
    }

    public String getName() {
        return name;
    }

    public int getRemainingDays() {
        return remainingDays;
    }

    public void changeDays(int days) {
        this.remainingDays = days;
    }

    public void changeMembershipType(String type)
    {
        this.membershipType=type;
    }

    public String getDetails() {
        return "Name: " + name + ", Age: " + age + ", Membership: " + membershipType + ", Remaining Days: " + remainingDays;
    }
}

