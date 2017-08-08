package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz (View view) {

        EditText services = (EditText) findViewById(R.id.services_field);
        String answer = "Air Force";
        CheckBox twoCheckBox = (CheckBox)findViewById(R.id.two_checkbox);
        boolean two = twoCheckBox.isChecked();
        CheckBox threeCheckBox = (CheckBox)findViewById(R.id.three_checkbox);
        boolean three = threeCheckBox.isChecked();
        RadioButton notTrueRadioButton = (RadioButton) findViewById(R.id.false_radio_button);
        boolean notTrue = notTrueRadioButton.isChecked();
        RadioButton correctRadioButton = (RadioButton) findViewById(R.id.correct_radio_button);
        boolean correct = correctRadioButton.isChecked();
        int baseScore = calculateScore(answer, two, three, notTrue, correct);
        Toast.makeText(this, "You scored: " + baseScore + " out of 12 points!", Toast.LENGTH_LONG).show();
    }

    private int calculateScore(String answer, boolean two, boolean three, boolean notTrue, boolean correct) {
        int baseScore = 0;

        if (services.getText().toString.trim().equalsIgnoreCase(answer)) {
            baseScore = + 3 ;
        }

        if (two && three) {
            baseScore = baseScore + 3;
        }

        if (notTrue) {
            baseScore = baseScore + 3;
        }
        if (correct) {
            baseScore = baseScore + 3;
        }
        return baseScore;
    }

    }

