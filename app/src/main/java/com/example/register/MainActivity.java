package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText phone;
    EditText age;
    EditText address;
    EditText gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.text_name);
        email=findViewById(R.id.text_email);
        phone=findViewById(R.id.phone_number);
        age=findViewById(R.id.age);
        address=findViewById(R.id.text_address);
        gender=findViewById(R.id.gender);
            }

    public void onOkClicked(View view) {
        String N=name.getText().toString();
        String E=email.getText().toString();
        String P=phone.getText().toString();
        String A=age.getText().toString();
        String Addr=address.getText().toString();
        String Ge=gender.getText().toString();
        Intent intent=new Intent(this,Informations.class);
        intent.putExtra("name",N);
        intent.putExtra("email",E);
        intent.putExtra("phone",P);
        intent.putExtra("age",A);
        intent.putExtra("address",Addr);
        intent.putExtra("gender",Ge);
        startActivity(intent);
    }
}
