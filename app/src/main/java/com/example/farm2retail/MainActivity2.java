package com.example.farm2retail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity2 extends AppCompatActivity {
    EditText inputEmail,inputPassword;
    Button registerf;
    String emailpattern ="[a-zA-z0-9._-]+@[a-z]+\\.+[a-z]+";
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        inputEmail=findViewById(R.id.emailfarmer);

        inputPassword=findViewById(R.id.passwordfarmer);

        registerf=findViewById(R.id.loginfarmer);
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseUser=firebaseAuth.getCurrentUser();



    }
    public void crop(View view){
//        Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_SHORT).show();
//        Intent i= new Intent(this,Crop.class);
//        startActivity(i);
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