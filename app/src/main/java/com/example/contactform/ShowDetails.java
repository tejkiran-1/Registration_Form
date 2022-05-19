package com.example.contactform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowDetails extends AppCompatActivity {
    TextView name, email, dob;
    Button clearBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        name = findViewById(R.id.uName);
        email = findViewById(R.id.uuEmail);
        dob = findViewById(R.id.uDOB);
        clearBtn = findViewById(R.id.clearButton);

        name.setText(getIntent().getExtras().getString("name"));
        email.setText(getIntent().getExtras().getString("email"));
        dob.setText(getIntent().getExtras().getString("dob"));

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                email.setText("");
                dob.setText("");
            }
        });
    }
}