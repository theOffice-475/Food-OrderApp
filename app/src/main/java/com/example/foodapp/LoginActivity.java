package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText editText = findViewById(R.id.editText);
        final EditText editText1 = findViewById(R.id.editText2);
        ImageView imageView5 = findViewById(R.id.imageView5);

        final String password = "0123456789";

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobileNo;
                String pass;

                mobileNo = editText.getText().toString();
                pass = editText1.getText().toString();

                if(mobileNo.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please Enter mobile number", Toast.LENGTH_SHORT).show();
                }
                if(pass.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please enter password", Toast.LENGTH_SHORT).show();
                }
                if(pass.equals(password)){
                    Toast.makeText(LoginActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
