package com.example.appoint_slip.Quarter2.PracticalExam;

import java.util.Scanner;

import java.util.Scanner;

// sbmo feature, approves or rejects the stay slip
public class SbmoApproval {
    public static void sbmoFeature(Scanner scanner) {
        boolean validDecision = true;

        System.out.println("--- SBMO APPROVAL ---");

        // keeps asking until a valid decision is entered
        while (validDecision) {
            System.out.println("Enter your ID: ");
            String yourID = scanner.nextLine().trim();
            System.out.println("Enter SBMO decision (Approve or Reject): ");
            String SBMODecision = scanner.nextLine().trim().toLowerCase();

            System.out.println("\n--- Process SBMO Review ---");

            if (SBMODecision.equals("approve") || SBMODecision.equals("a")) {
                System.out.println("REASON APPROVED");
                System.out.println("Student ID: " + yourID);
                System.out.println("Stay slip approved by SBMO");
                validDecision = false;
            } else if (SBMODecision.equals("reject") || SBMODecision.equals("r")) {
                System.out.println("REASON REJECTED");
                System.out.println("Student ID " + yourID);
                System.out.println("Stay slip rejected by SBMO");
                validDecision = false;
            } else {
                // wrong input, type it again
                System.out.println("INVALID! Enter 'Approve' or 'Reject'.");
                System.out.println("Try again.");
            }
        }
    }
}
