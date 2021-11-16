package com.example.blinpipetstosamoyezadaniye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements OnClickListener {

    Button btnActThree;
    TextView wowname;

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
    }
    public void buttonbebra222222(View view){
        Toast.makeText(this, "bebraknopkaa222222", Toast.LENGTH_LONG).show();
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActThree:
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}