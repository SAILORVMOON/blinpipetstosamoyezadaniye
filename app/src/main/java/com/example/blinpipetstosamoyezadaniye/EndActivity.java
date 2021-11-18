package com.example.blinpipetstosamoyezadaniye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class EndActivity extends AppCompatActivity{

    Button buttonyes = findViewById(R.id.buttonyes);
    Button buttonno = findViewById(R.id.buttonno);
    ImageView imgicecrm = findViewById(R.id.icecream);
    TextView end = findViewById(R.id.endtext);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        ImageView goodend = findViewById(R.id.goodend);
        ImageView verygoodend = findViewById(R.id.verygoodend);
        ImageView veryverybadway = findViewById(R.id.veryverybadway);
        int sum = MainActivity.res1 + MainActivity2.res2 + MainActivity3.res3 + MainActivity4.res4t + MainActivity4.res4q;
        if (sum == 6){
            verygoodend.setVisibility(View.VISIBLE);
            end.setText("партия гордится вами");
        }else if (sum == 5 || sum == 4){
            goodend.setVisibility(View.VISIBLE);
            end.setText("партия гордится вами");
        }else{
            buttonno.setVisibility(View.VISIBLE);
            buttonyes.setVisibility(View.VISIBLE);
            veryverybadway.setVisibility(View.VISIBLE);
            end.setText("теперь вы ждать своя смерть\nхотите поесть последний мороженное в жизни");
        }
    }

    public void butyes(View view){
        buttonno.setVisibility(View.GONE);
        buttonyes.setVisibility(View.GONE);
        imgicecrm.setVisibility(View.VISIBLE);
        end.setText("наслаждайтесь последний мороженное\nи ждите свой судный день");
    }
    public void butno(View view){
        buttonno.setVisibility(View.GONE);
        buttonyes.setVisibility(View.GONE);
        imgicecrm.setVisibility(View.VISIBLE);
        end.setText("как хотите\nа теперь ждите своя смерть");
    }
}