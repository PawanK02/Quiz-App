package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Final extends AppCompatActivity {
Button go;
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
go = (Button) findViewById(R.id.go);
t1 = (TextView) findViewById(R.id.t1);
t2 = (TextView) findViewById(R.id.t2);
String text1 = getIntent().getStringExtra("Text");
int sr = getIntent().getExtras().getInt("val");
t1.setText(text1);
t2.setText(+sr+"/10");
go.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Final.this, MainActivity.class);
        startActivity(intent);
    }
});
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Final.this, MainActivity.class);
        startActivity(intent);
    }
}