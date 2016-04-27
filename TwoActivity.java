package com.example.d14141515.kidzz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class TwoActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton image = (ImageButton) findViewById(R.id.myButton);
        image.setOnClickListener(this);

        ImageButton image = (ImageButton) findViewById(R.id.myButton1);
        image.setOnClickListener(this);

        ImageButton image = (ImageButton) findViewById(R.id.myButton2);
        image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(TwoActivity.this, ThreeActivity.class));

    public void onClick(View v) {
        startActivity(new Intent(TwoActivity.this, FiveActivity.class));

    public void onClick(View v) {
        startActivity(new Intent(TwoActivity.this, SixActivity.class));
