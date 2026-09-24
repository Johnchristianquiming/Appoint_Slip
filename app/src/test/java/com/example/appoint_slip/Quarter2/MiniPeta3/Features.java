package com.example.appoint_slip.Quarter2.MiniPeta3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class Features {
    public static void Scheduling(Scanner scheduling) {
        boolean isScheduling = true;

        List<String> takenSchedules = Arrays.asList(
                "10:45 AM - 2:30 PM",
                "8:00 AM - 9:30 AM",
                "1:00 PM - 2:00 PM"
        );

        while (isScheduling) {
            System.out.println("Taken time slots are: " + String.join(", ", takenSchedules));

            System.out.print("Avail a Schedule: ");
            String scheduleInput = scheduling.nextLine().trim();

            boolean isScheduleTaken = false;
            for (String slot : takenSchedules) {
                if (slot.equalsIgnoreCase(scheduleInput)) {
                    isScheduleTaken = true;
                    break;
                }
            }

            if (isScheduleTaken) {
                System.out.println("Please enter an available schedule first.\n");
            } else {
                System.out.println("Schedule successfully booked: " + scheduleInput);
                isScheduling = false;
            }
        }
    } public void subjectAssignation(Scanner subjectAssign) {
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
            System.out.println("Subjects for stay slip" + String.join(", ", allListedSubjects));

            System.out.println("Please select subject:");
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
