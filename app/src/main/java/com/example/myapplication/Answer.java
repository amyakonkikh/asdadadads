package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.annotation.Nullable;

public class Answer extends Activity {
    TextView textView;
    int b = 0;
    int answer1 = 1;
    int answer2 = 0;
    int answer3 = 1;
    int answer4 = 0;
    int answer5 = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer);
        textView = findViewById(R.id.textView6);
        Bundle argument = getIntent().getExtras();
        int checkBox11 = argument.getInt("checkBox11");
        int checkBox12 = argument.getInt("checkBox12");
        int checkBox13 = argument.getInt("checkBox13");
        int checkBox14 = argument.getInt("checkBox14");
        int checkBox15 = argument.getInt("checkBox15");
        if (checkBox11 != answer1 ){
            b++;
        }
        if (checkBox12 != answer2 ){
            b++;
        }
        if (checkBox13 != answer3 ){
            b++;
        }
        if (checkBox14 != answer4 ){
            b++;
        }
        if (checkBox15 != answer5 ){
            b++;
        }
        textView.setText("У вас "+b+" ошибок");


    }
}
