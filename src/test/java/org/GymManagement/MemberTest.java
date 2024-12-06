package org.GymManagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void testGetDetails() {
        Member member = new Member("Alice", 25, "Monthly", 30);
        String expected = "Name: Alice, Age: 25, Membership: Monthly, Remaining Days: 30";
        assertEquals(expected, member.getDetails());
    }

    @Test
    void testChangeDays() {
        Member member = new Member("Bob", 30, "Annual", 365);
        member.changeDays(180);
        assertEquals(180, member.getRemainingDays());
    }

    @Test
    void testChangeMembershipType() {
        Member member = new Member("Carol", 22, "Monthly", 30);
        member.changeMembershipType("Annual");
        assertEquals("Annual", member.getDetails().split(", ")[2].split(": ")[1]);
    }
}