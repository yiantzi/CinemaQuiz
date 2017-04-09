package com.example.android.cinemaquiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by yiantzi on 8/4/2017.
 */

public class Activity04 extends Activity{

    EditText villageEditText;
    String villageAnswer;
    String answer;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_04);
    }


    public void submitButton(View view) {

        villageEditText = (EditText) findViewById(R.id.q04_ed01);
        villageAnswer = villageEditText.getText().toString().toUpperCase();
        Globals g = Globals.getInstance();

        if (g.isTrueq04()) {
            if (villageAnswer.isEmpty()) {
                Toast.makeText(this, "No Answer Typed", Toast.LENGTH_SHORT).show();
            } else {

                answer = "Q4: " + villageAnswer + "\r\n ";
                g.setAnswer(answer);
                if (villageAnswer.equalsIgnoreCase("SHIRE")) {
                    g.increaseScore();
                    Toast.makeText(this, "Excellent!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "The Correct answer was Shire ", Toast.LENGTH_SHORT).show();
                }
                g.setFalseq04();
                final Context context = this;
                Intent intent = new Intent(context, Activity05.class);
                startActivity(intent);
            }
        }
        else {
            Toast.makeText(this, "You have already give an answer for this question. Your new choices will not replace your previous answers!", Toast.LENGTH_SHORT).show();
            final Context context = this;
            Intent intent = new Intent(context, Activity05.class);
            startActivity(intent);
        }

    }


}
