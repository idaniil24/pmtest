package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView firstoperand;
    TextView operation;
    TextView secondoperand;
    TextView result;
    Button operationplus;
    Button operationminus;
    public int c;

    public int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstoperand = (TextView) findViewById(R.id.firstoperand);
        secondoperand = (TextView) findViewById(R.id.secondoperant);
        result = (TextView) findViewById(R.id.result);
        operation = (TextView) findViewById(R.id.operation);
        operationminus = (Button) findViewById(R.id.operationminus);
        operationplus = (Button) findViewById(R.id.operationplus);
        operationminus.setActivated(false);
        operationplus.setActivated(false);
    }
    public void onButtonClick (View view){
        Button button = (Button) view;
        if (operationminus.isActivated() || operationplus.isActivated())
        {
            secondoperand.append(button.getText());
        }
        else firstoperand.append(button.getText());
    }
    public void acButtonOnClick (View view){
        Button button = (Button) view;
        firstoperand.setText("");
        secondoperand.setText("");
        result.setText("");
        operation.setText("");
        operationplus.setActivated(false);
        operationminus.setActivated(false);
    }
    public void onOperationButtonClick (View view) {
        Button button = (Button) view;
        operation.setText(button.getText());
        button.setActivated(true);
        if (operationplus.isActivated() & operationminus.isActivated())
        {
            operationminus.setActivated(false);
            operationplus.setActivated(false);
            operation.setText("");
        }
    }
    public void buttonResultOnClick (View view) {
        int a = Integer.parseInt(firstoperand.getText().toString());
        int b= Integer.parseInt(secondoperand.getText().toString());
        if (operationplus.isActivated())
        {
            c = a + b;
        }
        else if (operationminus.isActivated())
        {
            c = a - b;
        }
        result.setText(" = " + Integer.toString(c));
    }

}