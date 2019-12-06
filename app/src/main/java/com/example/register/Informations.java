package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Informations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);
        Intent intent=getIntent();
        String Name1=intent.getStringExtra("name");
        String Email1=intent.getStringExtra("email");
        String Phone1=intent.getStringExtra("phone");
        String Age1=intent.getStringExtra("age");
        String Address1=intent.getStringExtra("address");
        String Gender1=intent.getStringExtra("gender");
        TextView name=findViewById(R.id.result_name);
        TextView email=findViewById(R.id.result_email);
        TextView phone=findViewById(R.id.result_phone);
        TextView age=findViewById(R.id.result_age);
        TextView address=findViewById(R.id.result_address);
        TextView gender=findViewById(R.id.result_gender);
        name.append(Name1);
        email.append(Email1);
        phone.append(Phone1);
        age.append(Age1);
        address.append(Address1);
        gender.append(Gender1);
    }
}
