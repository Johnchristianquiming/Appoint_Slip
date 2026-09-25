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
            if (choice == 1) {

                subjectProcess.subjectAssignation(scanner);

            } else if (choice == 2) {



            } else if (choice == 3) {



            } else if (choice == 4) {



            } else if (choice == 5) {

                System.out.println("Exiting Stay Slip Request System...");
                isRunning = false;

            } else {

                System.out.println("Invalid choice. Please try again.");
            }
        }
        isRunning = false;
        System.out.println("System closed.");

    }
}