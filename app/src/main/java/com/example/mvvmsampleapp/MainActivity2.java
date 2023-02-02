package com.example.mvvmsampleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.example.mvvmsampleapp.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding newpagexml;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //for data binding
        newpagexml= ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(newpagexml.getRoot());
        newpagexml.t1.setText("This is my databinding Page");
        //....end data binding.....
//
//        ActivityMain2Binding secondxml= DataBindingUtil.setContentView(this,R.layout.activity_main2);
//
//        secondxml.t2.setText("Data binding started.........");
//        secondxml.setPname("Data binding is data with by using variables.....");

//        Product p =new Product("Data binding with help of object");//creating object for data binding.....
//        secondxml.setProduct(p);
    }
}