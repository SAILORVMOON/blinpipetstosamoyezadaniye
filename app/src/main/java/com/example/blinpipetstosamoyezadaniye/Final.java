package com.example.blinpipetstosamoyezadaniye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Final extends AppCompatActivity implements View.OnClickListener {

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
            tekst.setText("вы очень радовать партия");
        }else if (sum==5 || sum==4) {
            good.setVisibility(View.VISIBLE);
            tekst.setText("вы радовать партия");
        }else {
            bad.setVisibility(View.VISIBLE);
            tekst.setText("вы очень разозлить партия\nхотите попробовать последнее мороженное в жизни");
        }

    }

    @Override
    public void onClick(View v) {
        Button butyes = findViewById(R.id.butyes);
        butyes.setOnClickListener(this);
        Button butno = findViewById(R.id.butno);
        butno.setOnClickListener(this);
        ImageView imageView4 = findViewById(R.id.imageView4);
        TextView tekst = findViewById(R.id.tekst);
        switch (v.getId()) {
            case R.id.butyes:
                tekst.setText("наслаждайтесь свой последний мороженное\nждите свой судный день");
                imageView4.setVisibility(View.VISIBLE);
                break;
            case R.id.butno:
                tekst.setText("ждите свой судный день");
            default:
                break;
        }
    }
}