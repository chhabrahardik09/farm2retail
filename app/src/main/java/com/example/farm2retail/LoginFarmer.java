package com.example.farm2retail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginFarmer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }
    public void login_retailer(View view){
        Intent i= new Intent(this,login_page_retailer.class);
        startActivity(i);
    }
    public void crop(View view){
        Intent i=new Intent(this,Crop.class);
        startActivity(i);
    }


}