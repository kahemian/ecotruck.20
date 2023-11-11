package com.example.ahorravoltios_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterUserActivity extends AppCompatActivity {

    TextInputLayout name,email,phone,password1,password2;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        name= findViewById(R.id.name_user);
        email=findViewById(R.id.email_user);
        register=findViewById(R.id.buttonUserRegister);
        phone=findViewById(R.id.phone_user);
        password1=findViewById(R.id.password1_user);
        password2=findViewById(R.id.password2_user);

        Intent login= new Intent(getApplicationContext(),
                MainActivity.class);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(login);
                System.out.println(name.getEditText().getText().toString()+
                        "-"+email.getEditText().getText().toString()+"-"+
                        phone.getEditText().getText().toString());
            }
        });




    }
}