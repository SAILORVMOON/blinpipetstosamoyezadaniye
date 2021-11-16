package com.example.blinpipetstosamoyezadaniye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity2 extends AppCompatActivity implements OnClickListener {

    Button btnActThree;
    TextView wowname;
    ImageView movegood, movebad;
    public static int res2 = 0;
    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnActThree = findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);
        wowname = findViewById(R.id.name1);
        wowname.setText(MainActivity.towowfnames);

        wowname = findViewById(R.id.name2);
        wowname.setText(MainActivity.towowsnames);

        wowname = findViewById(R.id.name3);
        wowname.setText(MainActivity.towowlnames);
        movegood = findViewById(R.id.movegood);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.trans);
        if(MainActivity.res1 == 1){
            movegood.setVisibility(View.VISIBLE);
            movegood.startAnimation(anim);
            movegood.setVisibility(View.INVISIBLE);
        }
    }
    public void buttonbebra222222(View view){
        if(check==false) {
            Toast.makeText(this, "нажмать ещё раз и получать смачную бебрятину от партии", Toast.LENGTH_LONG).show();
            check = true;
        }else{
            Toast.makeText(this, "партия вас надурить но давать ответ John Xina", Toast.LENGTH_LONG).show();
        }
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActThree:
                EditText xina = (EditText) findViewById(R.id.xina);
                String xinas = xina.getText().toString();
                if(xinas.equals("John Xina")) {
                    res2 = 1;
                }


                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}