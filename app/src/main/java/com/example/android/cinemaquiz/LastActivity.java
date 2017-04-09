package com.example.android.cinemaquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);



        Globals g = Globals.getInstance();
        String summary = "You have answered " + Integer.toString(g.getScore()) + " correct answers!" + "\r\n " + "Below are your answers: " + "\r\n " + g.getAnswers() + "\r\n ";


        TextView orderSummaryTextView = (TextView) findViewById(R.id.editTextAnswers);
        orderSummaryTextView.setText(summary);



    }



}
