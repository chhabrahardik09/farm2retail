package com.example.farm2retail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RetailerSignup extends AppCompatActivity {

    EditText inputEmail,inputPassword;
    Button registerR;
    String emailpattern ="[a-zA-z0-9._-]+@[a-z]+\\.+[a-z]+";
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_signup);

        inputEmail=findViewById(R.id.emailretailer);

        inputPassword=findViewById(R.id.passwordretailer);

        registerR=findViewById(R.id.loginretailer);
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseUser=firebaseAuth.getCurrentUser();
    }
    public void FarmerSignup(View view) {
        PerformAuth();
    }

    private void PerformAuth(){
        String email=inputEmail.getText().toString();
        String password =inputPassword.getText().toString();
        if(!email.matches(emailpattern)){
            inputEmail.setError("Enter correct email");
        }
        else if(password.isEmpty() || password.length()<6){
            inputPassword.setError("enter proper password");
        }
        else{
            firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Registration UnSuccessful", Toast.LENGTH_SHORT).show();

                    }

                }
            });
        }

    }


}