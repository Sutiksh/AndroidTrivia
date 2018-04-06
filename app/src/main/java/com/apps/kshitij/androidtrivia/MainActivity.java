package com.apps.kshitij.androidtrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean optionA1;
    private boolean optionA2;
    private boolean optionA3;
    private boolean optionA4;
    private boolean optionA5;
    private boolean optionA6;
    private boolean optionA7;
    private boolean optionA8;
    private boolean optionA9;
    private boolean optionA10;
    private boolean optionB1;
    private boolean optionB2;
    private boolean optionB3;
    private boolean optionB4;
    private boolean optionB5;
    private boolean optionB6;
    private boolean optionB7;
    private boolean optionB8;
    private boolean optionB9;
    private boolean optionB10;
    private int score;
    private int scoreRep1 = 0;
    private int scoreRep2 = 0;
    private int scoreRep3 = 0;
    private int scoreRep4 = 0;
    private int scoreRep5 = 0;
    private int scoreRep6 = 0;
    private int scoreRep8= 0;
    private int scoreRep9 = 0;
    private int scoreRep10 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.optionA1:
                if (checked) {
                    if (scoreRep1 == 0) {
                        scoreRep1 = 1;
                        score = score + 1;
                    }else if (scoreRep1 == 1){
                        score = score + 0;
                    }
                    break;
                }
            case R.id.optionB1:
                if (checked)
                    score = score + 0;
                    break;
        }
    }

    public void onRadioButtonClicked2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.optionA2:
                if (checked)
                    score = score + 0;
                break;
            case R.id.optionB2:
                if (checked) {
                    if (scoreRep2 == 0) {
                        scoreRep2 = 1;
                        score = score + 1;
                    }else if (scoreRep2 == 1){
                        score = score + 0;
                    }
                    break;
                }
        }
    }

    public void onRadioButtonClicked3(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.optionA3:
                if (checked) {
                    if (scoreRep3 == 0) {
                        scoreRep3 = 1;
                        score = score + 1;
                    }else if (scoreRep3==1){
                        score = score + 0;
                    }
                    break;
                }
            case R.id.optionB3:
                if (checked)
                    score = score + 0;
                break;
        }
    }

    public void onRadioButtonClicked4(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.optionA4:
                if (checked)
                    score = score + 0;
                break;
            case R.id.optionB4:
                if (checked) {
                    if (scoreRep4 == 0) {
                        scoreRep4 = 1;
                        score = score + 1;
                    }else if (scoreRep4==1){
                        score = score + 0;
                    }
                    break;
                }
        }
    }

    public void onRadioButtonClicked5(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.optionA5:
                if (checked) {
                    if (scoreRep5 == 0) {
                        scoreRep5 = 1;
                        score = score + 1;
                    }else if (scoreRep5==1){
                        score = score + 0;
                    }
                    break;
                }
            case R.id.optionB5:
                if (checked)
                    score = score + 0;
                break;
        }
    }

    public void onRadioButtonClicked6(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.optionA6:
                if (checked)
                    score = score + 0;
                break;
            case R.id.optionB6:
                if (checked) {
                    if (scoreRep6 == 0) {
                        scoreRep6 = 1;
                        score = score + 1;
                    }else if (scoreRep6==1){
                        score = score + 0;
                    }
                    break;
                }
        }
    }

    public void onCheckBoxClicked7(View view) {
        CheckBox checked1 = (CheckBox) findViewById(R.id.optionA7);
        CheckBox checked2 = (CheckBox) findViewById(R.id.optionB7);
        boolean check1 = checked1.isChecked();
        boolean check2 = checked2.isChecked();
        if (check1 == true && check2 == true){
            score = score + 1;
        }
        else {
            score = score + 0;
        }
    }

    public void onRadioButtonClicked8(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.optionA8:
                if (checked) {
                    if (scoreRep8 == 0) {
                        scoreRep8 = 1;
                        score = score + 1;
                    }else if (scoreRep8==1){
                        score = score + 0;
                    }
                    break;
                }
            case R.id.optionB8:
                if (checked)
                    score = score + 0;
                break;
        }
    }

    public void onRadioButtonClicked9(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.optionA9:
                if (checked)
                    score = score + 0;
                break;
            case R.id.optionB9:
                if (checked) {
                    if (scoreRep9 == 0) {
                        scoreRep9 = 1;
                        score = score + 1;
                    }else if (scoreRep9==1){
                        score = score + 0;
                    }
                    break;
                }
        }
    }
    public void onRadioButtonClicked10(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.optionA10:
                if (checked) {
                    if (scoreRep10 == 0) {
                        scoreRep10 = 1;
                        score = score + 1;
                    }else if (scoreRep10==1){
                        score = score + 0;
                    }
                    break;
                }
            case R.id.optionB10:
                if (checked)
                    score = score + 0;
                break;
        }
    }

    public void showResult(View view) {
        Toast toast = Toast.makeText(this,"You have got " + score + " correct answers out of 10.",Toast.LENGTH_LONG);
        toast.show();

    }

    public void resetResult(View view) {
        score = 0;
        CheckBox checked1 = (CheckBox) findViewById(R.id.optionA7);
        CheckBox checked2 = (CheckBox) findViewById(R.id.optionB7);
        RadioButton radioButtonA1 = (RadioButton) findViewById(R.id.optionA1);
        RadioButton radioButtonB1 = (RadioButton) findViewById(R.id.optionB1);
        RadioButton radioButtonA2 = (RadioButton) findViewById(R.id.optionA2);
        RadioButton radioButtonB2 = (RadioButton) findViewById(R.id.optionB2);
        RadioButton radioButtonA3 = (RadioButton) findViewById(R.id.optionA3);
        RadioButton radioButtonB3 = (RadioButton) findViewById(R.id.optionB3);
        RadioButton radioButtonA4 = (RadioButton) findViewById(R.id.optionA4);
        RadioButton radioButtonB4 = (RadioButton) findViewById(R.id.optionB4);
        RadioButton radioButtonA5 = (RadioButton) findViewById(R.id.optionA5);
        RadioButton radioButtonB5 = (RadioButton) findViewById(R.id.optionB5);
        RadioButton radioButtonA6 = (RadioButton) findViewById(R.id.optionA6);
        RadioButton radioButtonB6 = (RadioButton) findViewById(R.id.optionB6);
        RadioButton radioButtonA8 = (RadioButton) findViewById(R.id.optionA8);
        RadioButton radioButtonB8 = (RadioButton) findViewById(R.id.optionB8);
        RadioButton radioButtonA9 = (RadioButton) findViewById(R.id.optionA9);
        RadioButton radioButtonB9 = (RadioButton) findViewById(R.id.optionB9);
        RadioButton radioButtonA10 = (RadioButton) findViewById(R.id.optionA10);
        RadioButton radioButtonB10 = (RadioButton) findViewById(R.id.optionB10);

            checked1.setChecked(false);
            checked2.setChecked(false);
        radioButtonA1.setChecked(false);
        radioButtonB1.setChecked(false);
        radioButtonA2.setChecked(false);
        radioButtonB2.setChecked(false);
        radioButtonA3.setChecked(false);
        radioButtonB3.setChecked(false);
        radioButtonA4.setChecked(false);
        radioButtonB4.setChecked(false);
        radioButtonA5.setChecked(false);
        radioButtonB5.setChecked(false);
        radioButtonA6.setChecked(false);
        radioButtonB6.setChecked(false);
        radioButtonA8.setChecked(false);
        radioButtonB8.setChecked(false);
        radioButtonA9.setChecked(false);
        radioButtonB9.setChecked(false);
        radioButtonA10.setChecked(false);
        radioButtonB10.setChecked(false);
        scoreRep1 = 0;
        scoreRep2 = 0;
        scoreRep3 = 0;
        scoreRep4 = 0;
        scoreRep5 = 0;
        scoreRep6 = 0;
        scoreRep8 = 0;
        scoreRep9 = 0;
        scoreRep10 = 0;
    }
}
