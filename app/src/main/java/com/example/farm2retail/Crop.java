package com.example.farm2retail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Crop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop);
    }
    public void chat(View view){
        Intent i=new Intent(this,list_of_chats.class);
        startActivity(i);
    }
}