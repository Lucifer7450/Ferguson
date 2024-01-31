package com.example.ferguson;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

        Button btnForget,Sign_Up,Login;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnForget=findViewById(R.id.btnForget);
        Sign_Up=findViewById(R.id.Sign_Up);
        Login=findViewById(R.id.Login);

        //dialog box
      /*  AlertDialog alertDialog= new AlertDialog.Builder(this).create();


        alertDialog.setTitle("Welcome to our application");
        alertDialog.setIcon(R.drawable.ag);
        alertDialog.setMessage("You want to join this app");
        alertDialog.show(); */


      btnForget.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent Forget;
              Forget =new Intent(Login.this,Forget_Password.class);
              startActivity(Forget);

          }
      });
        Sign_Up.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent Sign_Up;
              Sign_Up=new Intent(Login.this, SIgn_Up.class);
              startActivity(Sign_Up);
          }
      });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Login;
                Login=new Intent(Login.this,Home.class);
                startActivity(Login);
            }
        });

        //dialog.builder
        AlertDialog.Builder delDialog =new AlertDialog.Builder(this);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AlertDialog.Builder exitDilog = new AlertDialog.Builder(this);

        exitDilog.setTitle("Exit?");
        exitDilog.setIcon(R.drawable.ag);
        exitDilog.setMessage("Are your sure want to exit?");

        exitDilog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Login.this, "ok", Toast.LENGTH_SHORT).show();
            }
        });
        exitDilog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Login.super.onBackPressed();
            }
        });
        exitDilog.show();
    }
}