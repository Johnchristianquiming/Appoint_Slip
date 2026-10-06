package com.example.appoint_slip.Quarter2.PracticalExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// subject feature, picks a subject for the stay slip
public class subjectProcess {
    public static void subjectAssignation(Scanner subjectAssign) {
        boolean isSubjectAssigning = true;
        // all the subjects we can choose from
        List<String> allListedSubjects = Arrays.asList(
                "CLED",
                "EAPP",
                "IPHP",
                "RDL",
                "Comp. Prog",
                "FPL",
                "Animation"

        );

        while (isSubjectAssigning) {
            System.out.println("Subjects for stay slip " + String.join(", ", allListedSubjects));

            System.out.println("Please select subject: ");
            String subjectInput = subjectAssign.nextLine().trim();

            // check if the subject is on the list
            boolean subjectIsTaken = false;
            for (String slot : allListedSubjects) {
                if (slot.equalsIgnoreCase(subjectInput)) {
                    subjectIsTaken = true;
                    break;
                }
            }
            if (!subjectIsTaken) {
                // not listed, ask again
                System.out.println("Invalid selection. Please enter a listed subject.\n");
            } else {
                System.out.println("Subject successfully listed: " + subjectInput);
                isSubjectAssigning = false;
            }
        }
    }
}
