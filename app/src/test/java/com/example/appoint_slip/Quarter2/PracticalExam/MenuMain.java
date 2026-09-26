package com.example.appoint_slip.Quarter2.PracticalExam;

import java.util.Scanner;

public class MenuMain {
    public void start(Scanner scanner) {
        boolean picking = true;

        do{

            System.out.println();
            System.out.println("========================================");
            System.out.println("       STAY SLIP REQUEST SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Schedule Process");
            System.out.println("2. Subject Process");
            System.out.println("3. SBMO Approval");
            System.out.println("4. Teacher Approval");
            System.out.println("5. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                ScheduleProcess scheduling = new ScheduleProcess();
                ScheduleProcess.Scheduling(scanner);
            } else if (choice.equals("2")) {
                subjectProcess subjectAssignation = new subjectProcess();
                subjectProcess.subjectAssignation(scanner);
                System.out.println(scanner);
            } else if (choice.equals("3")) {
                SbmoApproval sbmoFeature = new SbmoApproval();
                SbmoApproval.sbmoFeature(scanner);
            } else if (choice.equals("4")) {
                teacherApproval teacherFeature = new teacherApproval();
                teacherApproval.teacherFeature(scanner);
            } else if (choice.equals("5")) {
                System.out.println("Exiitng, GOODBYE!");
                break;
            }
            else{
                System.out.println("PLEASE ENTER A VALID CHOICE");
            }
        }while(picking);
    }
}