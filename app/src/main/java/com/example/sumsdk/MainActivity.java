package com.example.sumsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int result = SumSdkCalculator.calculateSum(5, 10);

        // Display the result (you can use a TextView or Log as per your application)
        System.out.println("Sum: " + result);

    }
}