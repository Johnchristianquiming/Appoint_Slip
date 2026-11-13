package com.example.appoint_slip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    LinearLayout btnTeacher, btnSbmo, btnStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Roles Selector
        btnTeacher = findViewById(R.id.btnTeacher);
        btnSbmo = findViewById(R.id.btnSbmo);
        btnStudent = findViewById(R.id.btnStudent);

        View.OnClickListener roleClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTeacher.setSelected(false);
                btnSbmo.setSelected(false);
                btnStudent.setSelected(false);

                v.setSelected(true);
            }
        };

        btnTeacher.setOnClickListener(roleClickListener);
        btnSbmo.setOnClickListener(roleClickListener);
        btnStudent.setOnClickListener(roleClickListener);
        //Enter button
        Button enterButton = findViewById(R.id.btnLogin);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, MainScreen.class);
                startActivity(intent);
                finish();
            }
        });
        //Return button
        Button returnButton = findViewById(R.id.returntoWelcome);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, WelcomeScreen.class);
                startActivity(intent);
            }
        });
    }
}