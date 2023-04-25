package com.example.farm2retail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class login_page_retailer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page_retailer);
    }
    public void cropbuy(View view){   //RETAILER WILL BE SENT TO THE CROPS LISTING
        Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();
        Intent i= new Intent(this,cropbuy_retailer.class);
        startActivity(i);
    }

}