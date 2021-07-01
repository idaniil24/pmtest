package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView prediction;
    Button numone;
    Button numtwo;
    Button numthree;
    Button predictbtn;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numone = (Button) findViewById(R.id.numone);
        numtwo = (Button) findViewById(R.id.numtwo);
        numthree = (Button) findViewById(R.id.numthree);
        prediction = (TextView) findViewById(R.id.prediction);
        predictbtn = (Button) findViewById(R.id.predictbtn);
    }

    public void btnOnClick (View view) {
        if (predictbtn.isActivated()){
            if ((i == Integer.parseInt(String.valueOf(numone.getText()))) || (i == Integer.parseInt(String.valueOf(numtwo.getText()))) || (i == Integer.parseInt(String.valueOf(numthree.getText())))){
                prediction.setText("вы угадали и выиграли 1 миллион!");
            }
            else prediction.setText("Ебать ты клоун");
        }
        else prediction.setText("Поспи нахуй, кнопку загадать нажми хуила");
    }
    public void btnPredict (View view){
        Random random = new Random();
        i = random.nextInt(3);
        predictbtn.setActivated(true);
        prediction.setText("");
    }
}