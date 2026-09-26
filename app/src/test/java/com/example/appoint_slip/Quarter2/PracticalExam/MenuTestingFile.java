package com.example.appoint_slip.Quarter2.PracticalExam; // TODO: Change this to your actual package name

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MenuTestingFile {
    @Test
    public void run() {
        StringBuilder simulatedInput = new StringBuilder();
        simulatedInput.append("1\n");
        simulatedInput.append("2:30 PM - 4:30 PM\n");
        simulatedInput.append("2\n");
        simulatedInput.append("RDL\n");
        simulatedInput.append("3\n");
        simulatedInput.append("12345-ID\n");
        simulatedInput.append("approve\n");
        simulatedInput.append("4\n");
        simulatedInput.append("12345-TEACHER ID\n");
        simulatedInput.append("approve\n");
        simulatedInput.append("5\n");

        ByteArrayInputStream automaticInput = new ByteArrayInputStream(simulatedInput.toString().getBytes());

        Scanner allScanner = new Scanner(automaticInput);

        MenuMain start = new MenuMain();

        start.start(allScanner);


    }
}