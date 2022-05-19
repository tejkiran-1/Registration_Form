package com.example.contactform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowDetails extends AppCompatActivity {
    TextView name, email, dob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        name = findViewById(R.id.uName);
        email = findViewById(R.id.uuEmail);
        dob = findViewById(R.id.uDOB);

        name.setText(getIntent().getExtras().getString("name"));
        email.setText(getIntent().getExtras().getString("email"));
        dob.setText(getIntent().getExtras().getString("dob"));
    }
}