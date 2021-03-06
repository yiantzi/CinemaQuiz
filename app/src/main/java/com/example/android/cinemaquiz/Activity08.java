package com.example.android.cinemaquiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * Created by yiantzi on 8/4/2017.
 */

public class Activity08 extends Activity{

    private RadioGroup thisRadioGroup;
    private RadioButton thisRadioButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_08);
    }


    public void submitButton(View view) {
        thisRadioGroup = (RadioGroup) findViewById(R.id.radioQuestionGroup);
        int selectedId = thisRadioGroup.getCheckedRadioButtonId();
        thisRadioButton = (RadioButton) findViewById(selectedId);
        Globals g = Globals.getInstance();

        if (g.isTrueq08()) {
        if (thisRadioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "No Radio Button Selected", Toast.LENGTH_SHORT).show();
        } else {
            int position = thisRadioGroup.indexOfChild(thisRadioButton);

            String answer = (String) thisRadioButton.getText();
            answer = "Q8: " + answer + "\r\n ";
            g.setAnswer(answer);
            if (position == 0) {
                g.increaseScore();
                Toast.makeText(this, "Excellent!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "The Correct answer was Alfred Hitchcock ", Toast.LENGTH_SHORT).show();
            }
            g.setFalseq08();
            final Context context = this;
            Intent intent = new Intent(context, Activity09.class);
            startActivity(intent);
        }
    }
    else {
        Toast.makeText(this, "You have already give an answer for this question. Your new choices will not replace your previous answers!", Toast.LENGTH_SHORT).show();
            final Context context = this;
            Intent intent = new Intent(context, Activity09.class);
            startActivity(intent);
    }

    }


}
