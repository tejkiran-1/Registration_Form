package com.example.contactform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userName, userEmail, userDOB, userPassword;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.nameTV);
        userEmail = findViewById(R.id.emailTV);
        userDOB = findViewById(R.id.dobTV);
        userPassword = findViewById(R.id.passwordTV);
        submitButton = findViewById(R.id.submitButton);

        Intent intent  =new Intent(this, ShowDetails.class);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = userName.getText().toString();
                String email = userEmail.getText().toString();
                String dob = userDOB.getText().toString();
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("dob", dob);

                startActivity(intent);

                userName.setText("");
                userEmail.setText("");
                userDOB.setText("");
                userPassword.setText("");
            }
        });

    }
}