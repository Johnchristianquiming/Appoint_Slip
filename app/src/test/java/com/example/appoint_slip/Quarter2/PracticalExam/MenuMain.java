package com.example.appoint_slip.Quarter2.PracticalExam;

import java.util.Scanner;

public class MenuMain {

    // Main system == 5
    public static void start(Scanner scanner) {

        boolean isRunning = true;

        while (isRunning) {

            System.out.println();
            System.out.println("========================================");
            System.out.println("       STAY SLIP REQUEST SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Stay Slip Request");
            System.out.println("2. Reason For Staying");
            System.out.println("3. SBMO Approval");
            System.out.println("4. Teacher Approval");
            System.out.println("5. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            System.out.println(choice);

            // Menu selection

            switch (choice) {
                case 1:
                    subjectProcess.subjectAssignation(scanner);
                    break;
                case 2:
                    // TODO: Add code for choice 2
                    break;
                case 3:
                    // TODO: Add code for choice 3
                    break;
                case 4:
                    // TODO: Add code for choice 4
                    break;
                case 5:
                    System.out.println("Exiting Stay Slip Request System...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("System closed.");

    }
}