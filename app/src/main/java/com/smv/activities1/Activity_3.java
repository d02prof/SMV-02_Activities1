package com.smv.activities1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        setTitle("Activity 3");

        //preberemo Intent
        Intent intent = getIntent();

        if(intent.hasExtra("EXTRA_STRING"))
        {
            String textRead = intent.getStringExtra("EXTRA_STRING");
            TextView text = findViewById(R.id.textViewText);
            text.setText(textRead);
        }

        if (intent.hasExtra("EXTRA_NUMBER"))
        {
            int numberRead = intent.getIntExtra("EXTRA_NUMBER", 0);
            TextView number = findViewById(R.id.textViewNumber);
            number.setText("" + numberRead);
        }

    }
}