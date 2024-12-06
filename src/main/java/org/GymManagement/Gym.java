package org.GymManagement;

import java.util.*;
public class Gym {
    public Map<String, Member> members = new HashMap<>();

    // Adds a new member to the gym
    public void addMember(String name, int age, String membershipType) {
        name=name.toLowerCase();
        int initialDays = membershipType.equalsIgnoreCase("Monthly") ? 30 : 365;
        members.put(name.toLowerCase(), new Member(name, age, membershipType, initialDays));
    }

    // Removes a member from the gym
    public void removeMember(String name) {
        members.remove(name.toLowerCase());
    }

    // Displays all gym members
    public void displayMembers() {
        System.out.println("Current Members:");
        for (Member member : members.values()) {
            System.out.println(member.getDetails());
        }
    }

    // TODO: Implement this method to renew a member's membership
    public void renewMembership(String name, String newMembershipType) {
        name=name.toLowerCase();
        if(!members.containsKey(name))
        {
            System.out.println("Member does not exists");
            return;
        }
        int extraDays = newMembershipType.equalsIgnoreCase("Monthly") ? 30 : 365;
        Member m=members.get(name);
        m.changeDays(extraDays+m.getRemainingDays());
        m.changeMembershipType(newMembershipType);
        // Check if the member exists
        // Update the membership type and reset the remaining days
    }

    // TODO: Implement this method to deduct days for a member's attendance
    public void attendGym(String name, int days) {
        // Check if the member exists
        // Deduct the specified days from their remaining days
        name=name.toLowerCase();
        if(!members.containsKey(name))
        {
            System.out.println("Member does not exists");
            return;
        }
        Member m=members.get(name);
        int d=m.getRemainingDays()-days;
        if(d<0)
        {
            System.out.println("Invalid");
        }
        else
        {
            m.changeDays(d);
        }
    }
}
