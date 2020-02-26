package com.guptaamey.layoutsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout a;
    Button switch_layouts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = R.layout.activity_main;


    }
}
