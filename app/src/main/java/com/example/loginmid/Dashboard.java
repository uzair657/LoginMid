package com.example.loginmid;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.List;
import java.util.Locale;

public class Dashboard extends AppCompatActivity {

    Button btn;
    TextView userwl;
    TextView textView_location;
    LocationManager locationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn = findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i;
                i = new Intent(Dashboard.this, LoginActivity.class);
                startActivity(i);
                Toast.makeText(Dashboard.this, "Login Again to Continue", Toast.LENGTH_SHORT).show();

                finish();
            }
        });










    }


    }
