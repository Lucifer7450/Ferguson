package com.example.ferguson;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

        Button loginButton;
        TextView btnForget,ForgetPage,signupPage;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide top bar
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
        setContentView(R.layout.activity_login);

        btnForget=findViewById(R.id.ForgetPage);
        signupPage=findViewById(R.id.signupPage);
        loginButton=findViewById(R.id.loginButton);


      btnForget.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent Forget;
              Forget =new Intent(Login.this,Forget_Password.class);
              startActivity(Forget);

          }
      });
        signupPage.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent Sign_Up;
              Sign_Up=new Intent(Login.this, SIgn_Up.class);
              startActivity(Sign_Up);
          }
      });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginButton;
                loginButton=new Intent(Login.this,Home.class);
                startActivity(loginButton);
            }
        });

       //dialog.builder referance
//        AlertDialog.Builder delDialog =new AlertDialog.Builder(this);

    }
//   @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        AlertDialog.Builder exitDilog = new AlertDialog.Builder(this);
//
//        exitDilog.setTitle("Exit?");
//        exitDilog.setIcon(R.drawable.ag);
//        exitDilog.setMessage("Are your sure want to exit?");
//
//        exitDilog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(Login.this, "ok", Toast.LENGTH_SHORT).show();
//            }
//        });
//        exitDilog.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Login.super.onBackPressed();
//            }
//        });
//        exitDilog.show();
//    }
}