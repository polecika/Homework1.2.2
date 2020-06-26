package com.example.photo122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URI;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonBack = (Button) findViewById(R.id.button_back);
        Button buttonNext = (Button) findViewById(R.id.button_next);
        final TextView imageLink = (TextView) findViewById(R.id.image_link);
        final ImageView photo = (ImageView) findViewById(R.id.photo);
        final Random random = new Random();
        int[] imgArray = new int[]{
                R.drawable.photo1,
                R.drawable.photo2,
                R.drawable.photo3,
                R.drawable.photo4,
                R.drawable.photo5,
        };

        int randomIntPhoto =  random.nextInt(4);
        int randomIntLink =  random.nextInt(99) + 1;
        photo.setImageResource(imgArray[randomIntPhoto]);
        randomIntPhoto++;
        imageLink.setText("drawable/photo" + randomIntLink  + ".jpg");

        buttonBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               MainActivity.super.finish();
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}