package com.example.blinpipetstosamoyezadaniye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity4 extends AppCompatActivity implements OnClickListener {

    public static int res4q, res4t;
    ImageView movegood, movegood2, movebad;
    Button btnToEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        movegood = findViewById(R.id.movegood4);
        movegood2 = findViewById(R.id.movegood42);
        movebad = findViewById(R.id.movebad4);
        btnToEnd = findViewById(R.id.btnToEnd);
        btnToEnd.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnToEnd:
                RadioButton yes1 = findViewById(R.id.yes1);
                RadioButton yes2 = findViewById(R.id.yes2);
                RadioButton yes3 = findViewById(R.id.yes3);
                RadioButton no = findViewById(R.id.no);
                RadioButton tankyes = findViewById(R.id.tankyes);
                RadioButton tankno = findViewById(R.id.tankno);
                if (yes1.isChecked() || yes2.isChecked() || yes3.isChecked() && !(no.isChecked())) {
                    res4q = 1;
                } else {
                    res4q = 0;
                }
                if (!(tankyes.isChecked()) && tankno.isChecked()) {
                    res4t = 1;
                } else {
                    res4t = 0;
                }

                Intent intent = new Intent(this, Final.class);
                startActivity(intent);
                break;
            default:
                break;
        }


    }
}