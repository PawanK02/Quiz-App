package com.example.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button Q1,Q2,Q3,Q4,Q5,Q6;
Button rand;
    Random random = new Random();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Q1 = (Button) findViewById(R.id.Q1);
        Q2 = (Button) findViewById(R.id.Q2);
        Q3 = (Button) findViewById(R.id.Q3);
        Q4= (Button) findViewById(R.id.Q4);
        Q5 = (Button) findViewById(R.id.Q5);
        Q6 = (Button) findViewById(R.id.Q6);
        rand = (Button)findViewById(R.id.rand);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
Q1.setBackgroundColor(Color.GRAY);
        Q2.setBackgroundColor(Color.GRAY);
        Q3.setBackgroundColor(Color.GRAY);
        Q4.setBackgroundColor(Color.GRAY);
        Q5.setBackgroundColor(Color.GRAY);
        Q6.setBackgroundColor(Color.GRAY);
        rand.setBackgroundColor(Color.RED);
        Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Quiz.class);
                intent.putExtra("Q","Q1");
                startActivity(intent);
            }
        });
        Q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Quiz.class);
                intent.putExtra("Q","Q2");
                startActivity(intent);
            }
        });
        Q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Quiz.class);
                intent.putExtra("Q","Q3");
                startActivity(intent);
            }
        });
        Q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Quiz.class);
                intent.putExtra("Q","Q4");
                startActivity(intent);
            }
        }); Q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Quiz.class);
                intent.putExtra("Q","Q5");
                startActivity(intent);
            }
        });
        Q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Quiz.class);
                intent.putExtra("Q","Q6");
                startActivity(intent);
            }
        });
        rand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomNumber = random.nextInt(18 - 1) + 1;
                if(randomNumber==1 || randomNumber==12 || randomNumber==13){
                    Intent intent = new Intent(MainActivity.this, Quiz.class);
                    intent.putExtra("Q","Q1");
                    startActivity(intent);
                }
                else if(randomNumber==2 || randomNumber==7){
                    Intent intent = new Intent(MainActivity.this, Quiz.class);
                    intent.putExtra("Q","Q2");
                    startActivity(intent);
                }
                else if(randomNumber==3 || randomNumber==8){
                    Intent intent = new Intent(MainActivity.this, Quiz.class);
                    intent.putExtra("Q","Q3");
                    startActivity(intent);
                }
                else if(randomNumber==4 || randomNumber==9){
                    Intent intent = new Intent(MainActivity.this, Quiz.class);
                    intent.putExtra("Q","Q4");
                    startActivity(intent);
                }
                else if(randomNumber==5 || randomNumber==10){
                    Intent intent = new Intent(MainActivity.this, Quiz.class);
                    intent.putExtra("Q","Q5");
                    startActivity(intent);
                }
                else if(randomNumber==6 || randomNumber==11){
                    Intent intent = new Intent(MainActivity.this, Quiz.class);
                    intent.putExtra("Q","Q6");
                    startActivity(intent);
                }
            }
        });
    }
    }