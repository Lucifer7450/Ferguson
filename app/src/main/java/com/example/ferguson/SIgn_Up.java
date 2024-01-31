package com.example.ferguson;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SIgn_Up extends AppCompatActivity {

    Button btnSignUpBack;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignUpBack=findViewById(R.id.btnSignUpBack);
        btnSignUpBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnSignUpBack;
                btnSignUpBack= new Intent(SIgn_Up.this,Login.class);
                startActivity(btnSignUpBack);
            }
        });
    }
}