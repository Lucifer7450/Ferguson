package com.hardware.ferguson;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SIgn_Up extends AppCompatActivity {
    Button SignUP;
    TextView btnSignUpBack,Useremail_input,Username_input,Mobile_input,Address_input,Password_input,RePassword_input;
    FirebaseDatabase database;
    DatabaseReference reference;
     FirebaseAuth Mauth;
    ProgressBar progressBar;
    private View ProgressBar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignUpBack=findViewById(R.id.btnSignUpBack);
        SignUP=findViewById(R.id.SignUP);
        Useremail_input=findViewById(R.id.Useremail_input);
        Username_input=findViewById(R.id.Username_input);
        Mobile_input=findViewById(R.id.Mobile_input);
        Address_input=findViewById(R.id.Address_input);
        Password_input=findViewById(R.id.Password_input);
        RePassword_input=findViewById(R.id.RePassword_input);
        ProgressBar=findViewById(R.id.progressBar);
        
        Mauth=FirebaseAuth.getInstance();


        SignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Name=Username_input.getText().toString();
                String Email=Username_input.getText().toString();
                String Mobile=Username_input.getText().toString();
                String Addreass=Username_input.getText().toString();
                String Password=Username_input.getText().toString();
                String RePassword=Username_input.getText().toString();

                if(TextUtils.isEmpty(Email)){
                    Toast.makeText(SIgn_Up.this,"Enter Email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(Password)){
                    Toast.makeText(SIgn_Up.this,"Enter Password",Toast.LENGTH_SHORT).show();
                    return;

                }
                Mauth.signInWithEmailAndPassword(Email, Password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(SIgn_Up.this,"login..",Toast.LENGTH_SHORT).show();

                                } else {

                                    Toast.makeText(SIgn_Up.this,"faild",Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
            }
        });

    }
}