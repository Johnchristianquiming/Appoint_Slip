package com.example.appoint_slip.Quarter2.PracticalExam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

// runs the whole menu using fake input so we dont have to type everything
public class MenuTestingFile {
    @Test
    public void run() {
        // each line is one thing the user "types" in order
        StringBuilder simulatedInput = new StringBuilder();
        simulatedInput.append("1\n");          // log in page
        simulatedInput.append("Admin\n");      // username
        simulatedInput.append("1234567\n");    // password
        simulatedInput.append("2\n");          // schedule process
        simulatedInput.append("2:30 PM - 4:30 PM\n"); // schedule to avail
        simulatedInput.append("3\n");          // subject process
        simulatedInput.append("RDL\n");        // subject to pick
        simulatedInput.append("4\n");          // sbmo approval
        simulatedInput.append("12345-ID\n");   // student id
        simulatedInput.append("approve\n");    // sbmo decision
        simulatedInput.append("5\n");          // teacher approval
        simulatedInput.append("12345-TEACHER ID\n"); // teacher id
        simulatedInput.append("approve\n");    // teacher decision
        simulatedInput.append("6\n");          // exit



        // turn the fake input into something the scanner can read
        ByteArrayInputStream automaticInput = new ByteArrayInputStream(simulatedInput.toString().getBytes());

        Scanner allScanner = new Scanner(automaticInput);

        MenuMain start = new MenuMain();

        start.start(allScanner);


    }
}
