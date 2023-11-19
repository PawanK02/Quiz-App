package com.example.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Quiz extends AppCompatActivity implements View.OnClickListener {
    TextView qs,txt;
    Button b1, b2, b3, b4, submit,next,rand;
    int score = 0;
    int i = 0;
    String userans = "";
    String topic;
    int totalqs = QnA.ans1.length;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        qs = (TextView) findViewById(R.id.qs);
        txt = (TextView) findViewById(R.id.txt);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        submit = (Button) findViewById(R.id.submit);
        next = (Button) findViewById(R.id.next);
       //  prev= (Button)findViewById(R.id.prev);
topic = getIntent().getStringExtra("Q");
        b1.setBackgroundColor(Color.BLUE);
        b2.setBackgroundColor(Color.BLUE);
        b3.setBackgroundColor(Color.BLUE);
        b4.setBackgroundColor(Color.BLUE);
        submit.setBackgroundColor(Color.DKGRAY);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        next.setOnClickListener(this);
        submit.setOnClickListener(this);
        if(Objects.equals(topic, "Q1")) {
           loadnewQs(QnA.qns1,QnA.options1);
           // Toast.makeText(Quiz.this,"Hey there",Toast.LENGTH_SHORT).show();
        }
        else if(Objects.equals(topic, "Q2")){
            loadnewQs(QnA.qns2,QnA.options2);
        }
        else if(Objects.equals(topic, "Q3")){
            loadnewQs(QnA.qns3,QnA.options3);
        }
        else if(Objects.equals(topic, "Q4")){
            loadnewQs(QnA.qns4,QnA.options4);
        }
        else if(Objects.equals(topic, "Q5")){
            loadnewQs(QnA.qns5,QnA.options5);
        }
        else if(Objects.equals(topic, "Q6")){
            loadnewQs(QnA.qns6,QnA.options6);
        }
        submit.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {
        Button clickedButton = (Button) view;
        b1.setBackgroundColor(Color.BLUE);
        b2.setBackgroundColor(Color.BLUE);
        b3.setBackgroundColor(Color.BLUE);
        b4.setBackgroundColor(Color.BLUE);

        if (clickedButton.getId() == R.id.next || clickedButton.getId() == R.id.submit) {
                       if (topic.equals("Q1")) {
                if (userans.equals(QnA.ans1[i])) {
                    score++;
                }
                i++;
                loadnewQs(QnA.qns1,QnA.options1);
            }
            else  if (topic.equals("Q2")) {
                if (userans.equals(QnA.ans2[i])) {
                    score++;
                }
                i++;
                loadnewQs(QnA.qns2,QnA.options2);
            }
          else if (topic.equals("Q3")) {
                if (userans.equals(QnA.ans3[i])) {
                    score++;
                }
                i++;
                loadnewQs(QnA.qns3,QnA.options3);
            }
            else  if (topic.equals("Q4")) {
                if (userans.equals(QnA.ans4[i])) {
                    score++;
                }
                i++;
                loadnewQs(QnA.qns4,QnA.options4);
            }
            else  if (topic.equals("Q5")) {
                if (userans.equals(QnA.ans5[i])) {
                    score++;
                }
                i++;
                loadnewQs(QnA.qns5,QnA.options5);
            }
            else  if (topic.equals("Q6")) {
                if (userans.equals(QnA.ans6[i])) {
                    score++;
                }
                i++;
                loadnewQs(QnA.qns6,QnA.options6);
            }

        }else {
            userans = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.GREEN);

        }
    }

    void loadnewQs(String[] Qns, String[][] opt) {
        if(i==totalqs-1) {
            submit.setVisibility(View.VISIBLE);
            next.setVisibility(View.INVISIBLE);
        }
      else if (i == totalqs) {
            Qfinish();
            return;
        }
            qs.setText(Qns[i]);
            b1.setText(opt[i][0]);
            b2.setText(opt[i][1]);
            b3.setText(opt[i][2]);
            b4.setText(opt[i][3]);
    }
    void Qfinish() {
        String Text = "";
        if (score > totalqs * 0.4) {
            Text = "Good Job";
        } else {
            Text = "Better Luck next time";
        }
                        Intent intent = new Intent(Quiz.this,Final.class);
                        intent.putExtra("Text",Text);
                        intent.putExtra("val",score);
                        startActivity(intent);

    }

}