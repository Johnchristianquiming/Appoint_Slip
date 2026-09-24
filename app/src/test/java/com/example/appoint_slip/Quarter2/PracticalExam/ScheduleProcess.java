package com.example.appoint_slip.Quarter2.PracticalExam;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class ScheduleProcess {
    public static void Scheduling(Scanner scheduling) {
        boolean isScheduling = true;
        Scanner scanner = new Scanner(System.in);
        ScheduleProcess.Scheduling(scanner);

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

}}
