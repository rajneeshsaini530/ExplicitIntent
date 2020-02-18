package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String email = intent.getStringExtra("Email");
        Toast.makeText(this, "Name : "+name+"\nEmail : "+email, Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.data);
        textView.setText("Name : "+name+"\n Email : "+email);

    }
}
