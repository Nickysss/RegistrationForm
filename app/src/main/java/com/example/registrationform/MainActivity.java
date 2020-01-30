package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mNameText;
    private EditText mPhoneText;
    private EditText mMailText;
    private EditText mDobText;
    private EditText mAddText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameText = findViewById(R.id.name);
        mPhoneText = findViewById(R.id.phone);
        mMailText = findViewById(R.id.mail);
        mDobText = findViewById(R.id.dob);
        mAddText = findViewById(R.id.adr);
        Button btnPress = findViewById(R.id.reg);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleButtonClick();
            }
        });
    }

    private void handleButtonClick(){
        String SName =  mNameText.getText().toString();
        String SPhone =  mPhoneText.getText().toString();
        String SMail =  mMailText.getText().toString();
        String SDob =  mDobText.getText().toString();
        String SAdd =  mAddText.getText().toString();
        Intent i = new Intent(this, NameDisplay.class);
        i.putExtra("name", SName);
        i.putExtra("phone", SPhone);
        i.putExtra("mail", SMail);
        i.putExtra("dob", SDob);
        i.putExtra("adr", SAdd);

        startActivity(i);
    }

}
