package org.GymManagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GymTest {
    @Test
    void testAddMember() {
        Gym gym = new Gym();
        gym.addMember("Alice", 25, "Monthly");
        assertEquals(1, gym.members.size());
        assertNotNull(gym.members.get("alice"));
    }

    @Test
    void testRemoveMember() {
        Gym gym = new Gym();
        gym.addMember("Bob", 30, "Annual");
        gym.removeMember("Bob");
        assertNull(gym.members.get("bob"));
    }

    @Test
    void testRenewMembership() {
        Gym gym = new Gym();
        gym.addMember("Carol", 22, "Monthly");
        gym.renewMembership("Carol", "Annual");
        Member member = gym.members.get("carol");
        //assertEquals("Annual", member.getDetails().split(", ")[2].split(": ")[1]);
        assertEquals(395, member.getRemainingDays()); // 30 (existing) + 365 (new)
    }

    @Test
    void testAttendGym() {
        Gym gym = new Gym();
        gym.addMember("Dave", 35, "Monthly");
        gym.attendGym("Dave", 5);
        Member member = gym.members.get("dave");
        assertEquals(25, member.getRemainingDays());
    }

    @Test
    void testAttendGymInvalid() {
        Gym gym = new Gym();
        gym.addMember("Eve", 40, "Monthly");
        gym.attendGym("Eve", 35);
        assertEquals(30, gym.members.get("eve").getRemainingDays()); // Should not deduct invalid days
    }
}