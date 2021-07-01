package com.example.lesonelementsrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView MyTextView = findViewById(R.id.mytextview);
        Button fuckingbutton = findViewById(R.id.fuckingbutton);
        fuckingbutton.setEnabled(false);
        fuckingbutton.setText("Eblan...");
        CheckBox eblanbox = findViewById(R.id.eblanbox);
        eblanbox.setChecked(true);
        eblanbox.setText("idinahui");
    }
}