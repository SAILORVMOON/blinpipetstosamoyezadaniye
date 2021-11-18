package com.example.blinpipetstosamoyezadaniye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Final extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        int sum = MainActivity.res1+MainActivity2.res2+MainActivity3.res3+MainActivity4.res4q+MainActivity4.res4t;
        ImageView good = findViewById(R.id.imageView5);
        ImageView verygood = findViewById(R.id.imageView6);
        ImageView bad = findViewById(R.id.imageView7);
        TextView tekst = findViewById(R.id.tekst);
        if (sum==6) {
            verygood.setVisibility(View.VISIBLE);
            tekst.setText(MainActivity.towowfnames + MainActivity.towowsnames +"ВЫ ОЧЕНЬ РАДОВАТЬ ПАРТИЯ");
        }else if (sum==5 || sum==4) {
            good.setVisibility(View.VISIBLE);
            tekst.setText(MainActivity.towowfnames + MainActivity.towowsnames +"ВЫ РАДОВАТЬ ПАРТИЯ");
        }else {
            bad.setVisibility(View.VISIBLE);
            tekst.setText(MainActivity.towowfnames + MainActivity.towowsnames +"ВЫ ОЧЕНЬ РАЗОЗЛИТЬ ПАРТИЯ");
        }

    }
}