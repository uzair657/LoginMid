package com.example.loginmid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText email,pass;

    CheckBox rememberme;



    private static int RC_SIGN_IN = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.button69);
        email = findViewById(R.id.Email);
        pass = findViewById(R.id.Password);







        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(email.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){
                    Intent i;
                    i = new Intent(LoginActivity.this, Dashboard.class);
                    startActivity(i);
                    Toast.makeText(LoginActivity.this, "Welcome to Our App", Toast.LENGTH_SHORT).show();
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this, "Email or Password Wrong", Toast.LENGTH_SHORT).show();
                }









            }
        });







    }





}