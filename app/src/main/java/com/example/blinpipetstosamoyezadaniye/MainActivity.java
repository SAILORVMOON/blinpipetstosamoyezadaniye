package com.example.blinpipetstosamoyezadaniye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button btnActTwo;
    public static String towowfnames, towowsnames;
    public static int res1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActTwo = findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                EditText editf = (EditText) findViewById(R.id.fname);
                towowfnames = editf.getText().toString();

                EditText edits = (EditText) findViewById(R.id.sname);
                towowsnames = edits.getText().toString();

                if(towowfnames.equals("") || towowsnames.equals("")){
                    res1= 0;
                }else{
                    res1=1;
                }

                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}