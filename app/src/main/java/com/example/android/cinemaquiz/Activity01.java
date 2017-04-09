package com.example.android.cinemaquiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


/**
 * Created by yiantzi on 8/4/2017.
 */

public class Activity01 extends Activity {

    boolean hasCheckedBox1;
    CheckBox checkBox1;
    boolean hasCheckedBox2;
    CheckBox checkBox2;
    boolean hasCheckedBox3;
    CheckBox checkBox3;
    boolean hasCheckedBox4;
    CheckBox checkBox4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_01);
    }


    public void submitButton(View view) {

        checkBox1 = (CheckBox) findViewById(R.id.q01_ch01);
        hasCheckedBox1 = checkBox1.isChecked();
        checkBox2 = (CheckBox) findViewById(R.id.q01_ch02);
        hasCheckedBox2 = checkBox2.isChecked();
        checkBox3 = (CheckBox) findViewById(R.id.q01_ch03);
        hasCheckedBox3 = checkBox3.isChecked();
        checkBox4 = (CheckBox) findViewById(R.id.q01_ch04);
        hasCheckedBox4 = checkBox4.isChecked();
        String answerQuestion1 = "Q1: ";
        Globals g = Globals.getInstance();

        if (g.isTrueq01()) {

            if (hasCheckedBox1 == false && hasCheckedBox2 == false && hasCheckedBox3 == false && hasCheckedBox4 == false) {
                Toast.makeText(this, "No Check Box Selected", Toast.LENGTH_SHORT).show();
            } else {


                if (hasCheckedBox1) {
                    answerQuestion1 = answerQuestion1 + checkBox1.getText() + " ";
                }

                if (hasCheckedBox2) {
                    answerQuestion1 = answerQuestion1 + checkBox2.getText() + " ";
                }

                if (hasCheckedBox3) {
                    answerQuestion1 = answerQuestion1 + checkBox3.getText() + " ";
                }

                if (hasCheckedBox4) {
                    answerQuestion1 = answerQuestion1 + checkBox4.getText() + " ";
                }
                answerQuestion1 = answerQuestion1 + "\r\n ";
                g.setAnswer(answerQuestion1);
                g.setFalseq01();
                if (hasCheckedBox1 && hasCheckedBox3) {
                    g.increaseScore();
                    Toast.makeText(this, "Excellent!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "The Correct answer was Ryan Gosling and Michelle Williams ", Toast.LENGTH_SHORT).show();
                }
                final Context context = this;
                Intent intent = new Intent(context, Activity02.class);
                startActivity(intent);

            }

        } else {
            Toast.makeText(this, "You have already give an answer for this question. Your new choices will not replace your previous answers!", Toast.LENGTH_SHORT).show();
            final Context context = this;
            Intent intent = new Intent(context, Activity02.class);
            startActivity(intent);
        }


    }
}