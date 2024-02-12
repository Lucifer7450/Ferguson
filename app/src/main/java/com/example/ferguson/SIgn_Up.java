package com.example.ferguson;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SIgn_Up extends AppCompatActivity {
    Button SignUP;
    TextView btnSignUpBack;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignUpBack=findViewById(R.id.btnSignUpBack);
        SignUP=findViewById(R.id.SignUP);

        SignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUP;
                SignUP = new Intent(SIgn_Up.this,Login.class);
                startActivity(SignUP );
            }
        });
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