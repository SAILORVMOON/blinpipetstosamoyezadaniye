package com.example.blinpipetstosamoyezadaniye;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    ImageView movegood, movebad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        movegood = findViewById(R.id.movegood3);
        movebad = findViewById(R.id.movebad3);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.trans);
        if(MainActivity2.res2 == 1){
            movegood.setVisibility(View.VISIBLE);
            movegood.startAnimation(anim);
            movegood.setVisibility(View.INVISIBLE);
        }else{
            movebad.setVisibility(View.VISIBLE);
            movebad.startAnimation(anim);
            movebad.setVisibility(View.INVISIBLE);
        }
    }


}