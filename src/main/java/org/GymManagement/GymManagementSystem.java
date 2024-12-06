package org.GymManagement;

import java.util.*;
public class GymManagementSystem {
    public static void main(String[] args) {
        Gym gym = new Gym();
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1 -> addProcess(gym,sc);
                case 2 -> removeProcess(gym,sc);
                case 3 -> gym.displayMembers();
                case 4 -> renewProcess(gym,sc);
                case 5 -> attendGymProcess(gym,sc);
                case 6 -> running = false;
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
        System.out.println("Exiting....");
    }

    private static void displayMenu() {
        System.out.println("\nGym Management System");
        System.out.println("1. Add Member");
        System.out.println("2. Remove Member");
        System.out.println("3. Display Members");
        System.out.println("4. Renew Membership");
        System.out.println("5. Attend Gym");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addProcess(Gym gym, Scanner sc)
    {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter membership type (Monthly/Annual): ");
        String membershipType = sc.nextLine();
        gym.addMember(name, age, membershipType);
    }

    private static void removeProcess(Gym gym, Scanner sc)
    {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        gym.removeMember(name);
    }

    private static void renewProcess(Gym gym, Scanner sc)
    {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter new membership type (Monthly/Annual): ");
        String newType = sc.nextLine();
        gym.renewMembership(name, newType); // Implement this in the Gym class
    }

    private static void attendGymProcess(Gym gym,Scanner sc)
    {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter days to deduct: ");
        int days = sc.nextInt();
        gym.attendGym(name, days); // Implement this in the Gym class
    }
}
