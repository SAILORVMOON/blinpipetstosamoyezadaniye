package com.example.blinpipetstosamoyezadaniye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity implements OnClickListener {

    ImageView movegood, movebad;
    public static int res3;
    Button btnActFour;

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
        btnActFour = findViewById(R.id.btnActFour);
        btnActFour.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActFour:
                CheckBox boxa = findViewById(R.id.checkBoxa);
                CheckBox boxb = findViewById(R.id.checkBoxb);
                CheckBox boxc = findViewById(R.id.checkBoxc);
                CheckBox boxd = findViewById(R.id.checkBoxd);
                CheckBox boxe = findViewById(R.id.checkBoxe);
                if(!(boxa.isChecked()) && boxb.isChecked() && boxc.isChecked() && !(boxd.isChecked()) && !(boxe.isChecked())){
                    res3 = 2;
                }else if(!(boxa.isChecked()) && (boxb.isChecked() || boxc.isChecked()) && !(boxd.isChecked()) && !(boxe.isChecked())){
                    res3 = 1;
                }else{
                    res3 = 0;
                }
                Intent intent = new Intent(this, MainActivity4.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}