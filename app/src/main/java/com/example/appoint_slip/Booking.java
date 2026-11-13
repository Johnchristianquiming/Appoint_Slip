package com.example.appoint_slip;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashSet;
import java.util.Set;

public class Booking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.booking);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView tvSubject = findViewById(R.id.tvSelectedSubject);
        TextView tvInstructor = findViewById(R.id.tvSelectedInstructor);
        RadioGroup rgStayType = findViewById(R.id.rgStayType);
        EditText etDate = findViewById(R.id.etDate);
        EditText etTimeRange = findViewById(R.id.etTimeRange);
        EditText etPurpose = findViewById(R.id.etPurpose);
        Button btnSubmit = findViewById(R.id.btnSubmitSlip);
        Button btnCancel = findViewById(R.id.btnCancelSlip);

        String subject = getIntent().getStringExtra("SUBJECT_NAME");
        String instructor = getIntent().getStringExtra("INSTRUCTOR_NAME");

        if (subject != null) tvSubject.setText(subject);
        if (instructor != null) tvInstructor.setText("Instructor: " + instructor);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = etDate.getText().toString().trim();
                String time = etTimeRange.getText().toString().trim();
                String purpose = etPurpose.getText().toString().trim();

                if (date.isEmpty() || time.isEmpty() || purpose.isEmpty()) {
                    Toast.makeText(Booking.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                int selectedId = rgStayType.getCheckedRadioButtonId();
                RadioButton selectedRadio = findViewById(selectedId);
                String stayType = selectedRadio.getText().toString();

                SharedPreferences prefs = getSharedPreferences("StaySlips", MODE_PRIVATE);

                Set<String> slipIds = new HashSet<>(prefs.getStringSet("SLIP_IDS", new HashSet<>()));

                String slipId = "slip_" + System.currentTimeMillis();
                slipIds.add(slipId);

                SharedPreferences.Editor editor = prefs.edit();
                editor.putStringSet("SLIP_IDS", slipIds);
                editor.putString(slipId + "_SUBJECT", subject);
                editor.putString(slipId + "_DETAILS", stayType + " • Grounds Stay • " + date + " (" + time + ")");
                editor.putString(slipId + "_TEACHER", "Waiting");
                editor.putString(slipId + "_SBMO", "Waiting");
                editor.apply();

                Toast.makeText(Booking.this, "Stay Slip Submitted for " + subject, Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}