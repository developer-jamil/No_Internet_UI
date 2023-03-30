package com.jamillabltd.nointernetui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button style_1 = findViewById(R.id.style_id_1);
        Button style_2 = findViewById(R.id.style_id_2);
        Button style_3 = findViewById(R.id.style_id_3);
        Button style_4 = findViewById(R.id.style_id_4);
        Button style_5 = findViewById(R.id.style_id_5);
        Button style_6 = findViewById(R.id.style_id_6);
        Button style_7 = findViewById(R.id.style_id_7);
        Button style_8 = findViewById(R.id.style_id_8);
        Button style_9 = findViewById(R.id.style_id_9);
        Button style_10 = findViewById(R.id.style_id_10);

        style_1.setOnClickListener(this);
        style_2.setOnClickListener(this);
        style_3.setOnClickListener(this);
        style_4.setOnClickListener(this);
        style_5.setOnClickListener(this);
        style_6.setOnClickListener(this);
        style_7.setOnClickListener(this);
        style_8.setOnClickListener(this);
        style_9.setOnClickListener(this);
        style_10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //style_1
        if (v.getId() == R.id.style_id_1) {
            startActivity(new Intent(getApplicationContext(), StyleOne.class));
        }
        //style_2
        if (v.getId() == R.id.style_id_2) {
            startActivity(new Intent(getApplicationContext(), StyleTwo.class));
        }
        //style_3
        if (v.getId() == R.id.style_id_3) {
            startActivity(new Intent(getApplicationContext(), StyleThree.class));
        }
        //style_4
        if (v.getId() == R.id.style_id_4) {
            startActivity(new Intent(getApplicationContext(), StyleFour.class));
        }
        //style_5
        if (v.getId() == R.id.style_id_5) {
            startActivity(new Intent(getApplicationContext(), StyleFive.class));
        }
        //style_6
        if (v.getId() == R.id.style_id_6) {
            startActivity(new Intent(getApplicationContext(), StyleSix.class));
        }
        //style_7
        if (v.getId() == R.id.style_id_7) {
            startActivity(new Intent(getApplicationContext(), StyleSeven.class));
        }
        //style_8
        if (v.getId() == R.id.style_id_8) {
            startActivity(new Intent(getApplicationContext(), StyleEight.class));
        }
        //style_9
        if (v.getId() == R.id.style_id_9) {
            startActivity(new Intent(getApplicationContext(), StyleNine.class));
        }
        //style_10
        if (v.getId() == R.id.style_id_10) {
            startActivity(new Intent(getApplicationContext(), StyleTen.class));
        }

    }


}