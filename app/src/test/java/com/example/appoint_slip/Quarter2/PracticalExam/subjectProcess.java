package com.example.appoint_slip.Quarter2.PracticalExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class subjectProcess {
    public static void subjectAssignation(Scanner subjectAssign) {
        boolean isSubjectAssigning = true;
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

            boolean subjectIsTaken = false;
            for (String slot : allListedSubjects) {
                if (slot.equalsIgnoreCase(subjectInput)) {
                    subjectIsTaken = true;
                    break;
                }
            }
            if (subjectIsTaken) {
                System.out.println("Please enter the listed subject.\n");
            } else {
                System.out.println("Subject successfully listed" + subjectInput);
                isSubjectAssigning = false;
            }
        }
    }
}