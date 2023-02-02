package com.example.mvvmsampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mvvmsampleapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainxml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainxml=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainxml.getRoot());
        mainxml.t1.setText("View Binding done on first page...........");
        mainxml.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

    }
    private void openActivity2()
    {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}