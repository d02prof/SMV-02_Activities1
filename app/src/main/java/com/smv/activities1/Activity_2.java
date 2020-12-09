package com.smv.activities1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Activity_2 extends AppCompatActivity
{
    Button buttonOpenActivity3;
    EditText text, number;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        setTitle("Activity 2");

        buttonOpenActivity3 = findViewById(R.id.buttonOpenActivity3);
        text = findViewById(R.id.editTextText);
        number = findViewById(R.id.editTextNumber);

        buttonOpenActivity3.setOnClickListener(OpenActivity3_OnCLickListener);
    }

    public View.OnClickListener OpenActivity3_OnCLickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            //preberemo besedilo iz obeg polj
            String textRead = text.getText().toString();
            int numberRead;
            try
            {
                numberRead = Integer.parseInt(number.getText().toString());
            }
            catch (Exception ex)
            {
                numberRead = -1;
            }

            Intent intent = new Intent(getApplicationContext(), Activity_3.class);
            intent.putExtra("EXTRA_STRING", textRead);
            intent.putExtra("EXTRA_NUMBER", numberRead);
            startActivity(intent);
        }
    };
}