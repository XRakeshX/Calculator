package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class loveCalculator extends AppCompatActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_calculator);

        result = findViewById(R.id.result);

    }

    public void check(View view) {

        Random r = new Random();
        int res = r.nextInt(100);
        result.setText(res+"%");
    }
}
