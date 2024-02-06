package com.CodingRK;

import java.util.*;

public class EmployeeSystem {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addEmployee(employees, scanner);
                    break;
                case 2:
                    viewAllEmployees(employees);
                    break;
                case 3:
                    System.out.println("Exiting Employee Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee(ArrayList<String> employees, Scanner scanner) {
        System.out.print("Enter employee details (ID Name Position Age Salary Address): ");
        String employeeDetails = scanner.nextLine();
        employees.add(employeeDetails);
        System.out.println("Employee added successfully!");
    }

    private static void viewAllEmployees(ArrayList<String> employees) {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("\nEmployee List:");
            for (String employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
