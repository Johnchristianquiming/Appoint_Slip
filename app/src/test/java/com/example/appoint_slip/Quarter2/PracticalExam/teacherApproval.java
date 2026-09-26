package com.example.appoint_slip.Quarter2.PracticalExam;

import java.util.Scanner;

public class teacherApproval {
    public static void teacherFeature(Scanner scanner) {
        boolean validTeacherDecision = true;

        System.out.println("--- TEACHER APPROVAL ---");

        while (validTeacherDecision) {
            System.out.println("Enter your ID: ");
            String yourID = scanner.nextLine().trim();
            System.out.println("Enter TEACHER decision (Approve / Reject): ");
            String TeacherDecision = scanner.nextLine().trim().toLowerCase();

            System.out.println("\n--- Process TEACHER Review ---");

            if (TeacherDecision.equals("approve") || TeacherDecision.equals("a")) {
                System.out.println("REASON APPROVED");
                System.out.println("Student ID: " + yourID);
                System.out.println("Stay slip approved by TEACHER");
                validTeacherDecision = false;
            } else if (TeacherDecision.equals("reject") || TeacherDecision.equals("r")) {
                System.out.println("REASON REJECTED");
                System.out.println("Student ID " + yourID);
                System.out.println("Stay slip rejected by TEACHER");
                validTeacherDecision = false;
            } else {
                System.out.println("INVALID! Enter 'Approve' or 'Reject'.");
                System.out.println("Try again.");
            }
        }
    }
}