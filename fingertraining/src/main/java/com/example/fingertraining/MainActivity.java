package com.example.fingertraining;

import android.app.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    AlertDialog dialog;
    final int DIALOG_EXIT = 1;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick (View view){
        Toast toast = Toast.makeText(this, "пошел нахуй пидар", Toast.LENGTH_LONG);
        toast.show();
    }
}