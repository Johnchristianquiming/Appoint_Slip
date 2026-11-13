package com.example.appoint_slip;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashSet;
import java.util.Set;

public class MainScreen extends AppCompatActivity {

    private LinearLayout slipsContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_screen);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainscreen), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        setupBookingButton(R.id.btnBookSub1, "Computer Programming 4 (Java) (NC III)", "Mr. Joseph C. Sixson");
        setupBookingButton(R.id.btnBookSub2, "Empowerment Technologies", "Mr. Neil Roland L. Quindoy");
        setupBookingButton(R.id.btnBookSub3, "Inquiries Investigation, and Immersion", "Ms. Ynissa R. Magnawa");
        setupBookingButton(R.id.btnBookSub4, "Work Immersion", "Mr. Joseph C. Sixson");
        setupBookingButton(R.id.btnBookSub5, "Animation 4 (NC II)", "Mr. Neil Roland L. Quindoy");
        setupBookingButton(R.id.btnBookSub6, "Contemporary Philippine Arts from the Regions (CPAR)", "Mr. Jericho Baes");
        setupBookingButton(R.id.btnBookSub7, "Christian Living Education 12-B", "Mr. Jomar P. Miranda");
        setupBookingButton(R.id.btnBookSub8, "Media and Information Literacy", "Ms. Richelle Mae D. De Luna");
        setupBookingButton(R.id.btnBookSub9, "Physical Education & Health 12-B", "Mr. CJ Mulawin");
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadAllAppointments();
    }

    private void loadAllAppointments() {
        SharedPreferences prefs = getSharedPreferences("StaySlips", MODE_PRIVATE);
        Set<String> slipIds = prefs.getStringSet("SLIP_IDS", new HashSet<>());

        slipsContainer = findViewById(R.id.slipsContainer);
        if (slipsContainer == null) return;

        slipsContainer.removeAllViews();

        if (slipIds == null || slipIds.isEmpty()) {
            return;
        }

        for (String slipId : slipIds) {
            String subject = prefs.getString(slipId + "_SUBJECT", "");
            String details = prefs.getString(slipId + "_DETAILS", "");
            String teacherStatus = prefs.getString(slipId + "_TEACHER", "Waiting");
            String sbmoStatus = prefs.getString(slipId + "_SBMO", "Waiting");

            View slipView = getLayoutInflater().inflate(R.layout.item_stay_slip, slipsContainer, false);

            TextView tvSubject = slipView.findViewById(R.id.tvAppSubject);
            TextView tvDetails = slipView.findViewById(R.id.tvAppDetails);
            TextView tvOverall = slipView.findViewById(R.id.tvOverallStatus);
            TextView tvTeacher = slipView.findViewById(R.id.tvTeacherStatus);
            TextView tvSbmo = slipView.findViewById(R.id.tvSbmoStatus);

            tvSubject.setText(subject);
            tvDetails.setText(details);

            boolean tApp = teacherStatus.equalsIgnoreCase("Approved");
            boolean sApp = sbmoStatus.equalsIgnoreCase("Approved");

            tvTeacher.setText(tApp ? "Teacher: Approved ✓" : "Teacher: Waiting");
            tvTeacher.setTextColor(Color.parseColor(tApp ? "#15803D" : "#D97706"));

            tvSbmo.setText(sApp ? "SBMO: Approved ✓" : "SBMO: Waiting");
            tvSbmo.setTextColor(Color.parseColor(sApp ? "#15803D" : "#D97706"));

            if (tApp && sApp) {
                tvOverall.setText("APPROVED");
                tvOverall.setBackgroundColor(Color.parseColor("#D4EDDA"));
                tvOverall.setTextColor(Color.parseColor("#155724"));
            } else {
                tvOverall.setText("WAITING");
                tvOverall.setBackgroundColor(Color.parseColor("#FFF3CD"));
                tvOverall.setTextColor(Color.parseColor("#856404"));
            }

            slipsContainer.addView(slipView);
        }
    }

    private void setupBookingButton(int buttonId, String subjectName, String instructorName) {
        Button btn = findViewById(buttonId);
        if (btn != null) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
        }
    }
}
