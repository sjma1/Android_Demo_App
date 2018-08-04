package com.example.jun.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    protected boolean dead = false;

    public void DrangleicSword(View view) {
        if(dead) {
            dead = false;
            //Change image back from "Bardock the Destroyer" to "Drangleic Sword"
            ImageView image = (ImageView) findViewById(R.id.img1);
            image.setImageResource(R.drawable.drangleic_sword);

            Button btn = (Button) findViewById(R.id.b1);
            btn.setText("THE POWER OF THE DRANGLEIC SWORD");
        }
        else {
            dead = true;
            //Change image from "Drangleic Sword" to "Bardock the Destroyer"
            ImageView image = (ImageView) findViewById(R.id.img1);
            image.setImageResource(R.drawable.trashman);

            Button btn = (Button) findViewById(R.id.b1);
            btn.setText("BELONGS TO BARDOCK THE DESTROYER!");
        }
    }

    /*
    public void clickFunction(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_SHORT).show();
        Log.i("Info", editText.getText().toString());
    }
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}
