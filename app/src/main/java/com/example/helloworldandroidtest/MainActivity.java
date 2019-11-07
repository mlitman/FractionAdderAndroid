package com.example.helloworldandroidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText inputNum1ET, inputNum2ET, inputDenom1ET, inputDenom2ET;
    TextView outputNumTV, outputDenomTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.inputNum1ET = this.findViewById(R.id.inputNum1ET);
        this.inputDenom1ET = this.findViewById(R.id.inputDenom1ET);
        this.inputNum2ET = this.findViewById(R.id.inputNum2ET);
        this.inputDenom2ET = this.findViewById(R.id.inputDenom2ET);

        this.outputNumTV = this.findViewById(R.id.outputNumTV);
        this.outputDenomTV = this.findViewById(R.id.outputDenomTV);
    }

    public void onClickMeButtonPressed(View v)
    {
        int num1 = Integer.parseInt(this.inputNum1ET.getText().toString());
        int denom1 = Integer.parseInt(this.inputDenom1ET.getText().toString());
        int num2 = Integer.parseInt(this.inputNum2ET.getText().toString());
        int denom2 = Integer.parseInt(this.inputDenom2ET.getText().toString());

        Fraction f1 = new Fraction(num1, denom1);
        Fraction f2 = new Fraction(num2, denom2);
        Fraction answer = f1.add(f2);
        answer.reduceEuclidean();

        this.outputNumTV.setText("" + answer.numerator);
        this.outputDenomTV.setText("" + answer.denominator);


    }
}
