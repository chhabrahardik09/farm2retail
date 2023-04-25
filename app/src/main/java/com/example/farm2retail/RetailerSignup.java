package com.example.farm2retail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RetailerSignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_signup);
    }
    public void crop(View view){
        Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_SHORT).show();
        Intent i= new Intent(this,Crop.class);
        startActivity(i);
    }


}