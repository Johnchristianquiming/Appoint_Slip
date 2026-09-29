package com.example.appoint_slip.Quarter2.PracticalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginPage {
    public static void LoggingIn(Scanner LoggingIn) {

        List<String> credentials = new ArrayList<>();
        credentials.add("Admin");
        credentials.add("1234567");

        String inputName = "";
        String inputPassword = "";

        while (true) {
            System.out.print("Enter your name: ");
            inputName = LoggingIn.nextLine();

            if (inputName.equals(credentials.get(0))) {
                break;
            } else {
                System.out.println("[Incorrect name! Please try again.");
            }
        }

        while (true) {
            System.out.print("Enter your password: ");
            inputPassword = LoggingIn.nextLine();

            if (inputPassword.equals(credentials.get(1))) {
                break;
            } else {
                System.out.println("[Incorrect password! Please try again.");
            }
        }
        System.out.println("Access granted! Welcome, " + credentials.get(0) + ".");
    }
}