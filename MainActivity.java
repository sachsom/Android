package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    int countB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment_three_A(View view) {
        count = count + 3;
        display(count);

    }

    public void increment_two_A(View view) {
        count = count + 2;
        display(count);

    }

    public void increment_throw_A(View view) {
        count = count + 1;
        display(count);

    }

    public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_A_Score);
        quantityTextView.setText("" + number);
    }

///////////////////////////////////////////////////////////////////////////////////


    public void increment_three_B(View view) {
        countB = countB + 3;
        displayB(countB);

    }

    public void increment_two_B(View view) {
        countB = countB + 2;
        displayB(countB);

    }

    public void increment_throw_B(View view) {
        countB = countB + 1;
        displayB(countB);

    }

    public void displayB(int number) {
        TextView quantityTextViewB = (TextView) findViewById(R.id.team_B_Score);
        quantityTextViewB.setText("" + number);
    }


    public void Reset(View view) {
        count = 0;
        countB = 0;
        TextView quantityTextViewB = (TextView) findViewById(R.id.team_B_Score);
        quantityTextViewB.setText("0");
        TextView quantityTextView = (TextView) findViewById(R.id.team_A_Score);
        quantityTextView.setText("0");

    }


}
