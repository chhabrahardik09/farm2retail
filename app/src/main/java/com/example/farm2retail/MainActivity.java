package com.example.farm2retail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void farmer(View view){
        Intent i= new Intent(this,MainActivity2.class);
        startActivity(i);
    }
    public void Retailer(View view){
        Intent i= new Intent(this,RetailerSignup.class);
        startActivity(i);
    }
    public void sign_in_options(View view){
        try {
            Intent i= new Intent(this,LoginFarmer.class);
            startActivity(i);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}