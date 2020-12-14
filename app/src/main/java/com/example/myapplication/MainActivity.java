package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4,checkBox5;
    TextView textView1, textView2, textView3, textView4,textView5;
    Button button;
    int checkBox11 = 0;
    int checkBox12 = 0;
    int checkBox13 = 0;
    int checkBox14 = 0;
    int checkBox15 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 =findViewById(R.id.checkBox2);
        checkBox3 =findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5=findViewById(R.id.checkBox5);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()){
                    checkBox11++;

                }
                if (checkBox2.isChecked()){
                    checkBox12++;
                }
                if (checkBox3.isChecked()){
                    checkBox13++;

                }
                if (checkBox4.isChecked()){
                    checkBox14++;
                }
                if (checkBox5.isChecked()){
                    checkBox15++;
                }
                Intent intent = new Intent(MainActivity.this, Answer.class);
                intent.putExtra("checkBox11", checkBox11 );
                intent.putExtra("checkBox12", checkBox12 );
                intent.putExtra("checkBox13", checkBox13 );
                intent.putExtra("checkBox14", checkBox14 );
                intent.putExtra("checkBox15", checkBox15 );
                startActivity(intent);


            }
        });

    }


}