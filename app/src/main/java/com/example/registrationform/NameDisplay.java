package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class NameDisplay extends AppCompatActivity {
    public static final String NAME ="name";
    public static final String P ="phone";
    public static final String M ="mail";
    public static final String D ="dob";
    public static final String A ="adr";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_display);

        TextView txtName =  findViewById(R.id.nm);
        TextView txtPhone = findViewById(R.id.ph);
        TextView txtEmail = findViewById(R.id.em);
        TextView txtDoB =  findViewById(R.id.db);
        TextView txtAddress =  findViewById(R.id.ad);
        Bundle extras = getIntent().getExtras();
        if( extras != null ){
            String namee = extras.getString(NAME);
            String p = extras.getString(P);
            String m = extras.getString(M);
            String da = extras.getString(D);
            String ar = extras.getString(A);

                txtName.setText( getString(R.string.nme) +" "+ namee);
                txtPhone.setText( getString(R.string.phn) +" "+ p);
                txtEmail.setText( getString(R.string.eml) +" "+ m);
                txtDoB.setText( getString(R.string.date) +" "+ da);
                txtAddress.setText( getString(R.string.adr) +" "+ ar);
            }
        }

    }

