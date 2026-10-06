package com.example.appoint_slip.Quarter2.PracticalExam;

import android.util.Log;

import java.util.Scanner;

// main menu, picks which feature to run
public class MenuMain {
    public void start(Scanner scanner) {
        boolean picking = true;

        do {
            System.out.println();
            System.out.println("========================================");
            System.out.println("       STAY SLIP REQUEST SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Log in Page");
            System.out.println("2. Schedule Process");
            System.out.println("3. Subject Process");
            System.out.println("4. SBMO Approval");
            System.out.println("5. Teacher Approval");
            System.out.println("6. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            // go to the feature that matches the choice
            if (choice.equals("1")) {
                LoginPage.LoggingIn(scanner);
            } else if (choice.equals("2")) {
                ScheduleProcess.Scheduling(scanner);
            } else if (choice.equals("3")) {
                subjectProcess.subjectAssignation(scanner);
            } else if (choice.equals("4")) {
                SbmoApproval.sbmoFeature(scanner);
            } else if (choice.equals("5")) {
                teacherApproval.teacherFeature(scanner);
            } else if (choice.equals("6")) {
                System.out.println("Exiting, GOODBYE!");
                picking = false;
            } else {
                System.out.println("PLEASE ENTER A VALID CHOICE");
            }
        } while (picking);
    }
}
