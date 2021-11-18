package com.example.blinpipetstosamoyezadaniye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {


    ImageView movegood, movegood2, movebad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        movegood = findViewById(R.id.movegood4);
        movegood2 = findViewById(R.id.movegood42);
        movebad = findViewById(R.id.movebad4);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.trans);
        if(MainActivity3.res3 == 2){
            movegood2.setVisibility(View.VISIBLE);
            movegood2.startAnimation(anim);
            movegood2.setVisibility(View.INVISIBLE);
        }else if (MainActivity3.res3 == 1){
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