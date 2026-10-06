package com.example.appoint_slip.Quarter2.PracticalExam;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

// schedule feature, asks for a slot and checks if its still free
public class ScheduleProcess {
    public static void Scheduling(Scanner scheduling) {
        boolean isScheduling = true;

        // slots that are already taken
        List<String> takenSchedules = Arrays.asList(
                "10:45 AM - 2:30 PM",
                "8:00 AM - 9:30 AM",
                "1:00 PM - 2:00 PM"
        );

        while (isScheduling) {
            System.out.println("Taken time slots are: " + String.join(", ", takenSchedules));

            System.out.println("Avail a Schedule: ");
            String scheduleInput = scheduling.nextLine().trim();

            // compare input against the taken slots
            boolean isScheduleTaken = false;
            for (String slot : takenSchedules) {
                if (slot.equalsIgnoreCase(scheduleInput)) {
                    isScheduleTaken = true;
                    break;
                }
            }

            if (isScheduleTaken) {
                // already booked, ask again
                System.out.println("Please enter an available schedule first.\n");
            } else {
                // slot is free so we book it
                System.out.println("Schedule successfully booked: " + scheduleInput);
                isScheduling = false;
            }
        }
    }
}
