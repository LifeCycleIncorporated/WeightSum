package com.example.weightsum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.oneButtonId);
        button2 = findViewById(R.id.twoButtonId);
        button3 = findViewById(R.id.threeButtonId);
        button4 = findViewById(R.id.fourButtonId);
        button5 = findViewById(R.id.fiveButtonId);


    }
}