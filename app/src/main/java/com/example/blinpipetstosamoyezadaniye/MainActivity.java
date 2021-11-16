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

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button btnActTwo;
    EditText towowfnamee, towowsnamee, towowlnamee;
    public static String towowfnames, towowsnames, towowlnames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActTwo = findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
    }

    public void buttona(View view){
        Toast.makeText(this, "bebraknopkaa", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                towowfnamee = findViewById(R.id.fname);
                EditText editf = (EditText) findViewById(R.id.fname);
                towowfnames = editf.getText().toString();

                towowsnamee = findViewById(R.id.fname);
                EditText edits = (EditText) findViewById(R.id.sname);
                towowsnames = edits.getText().toString();

                towowlnamee = findViewById(R.id.fname);
                EditText editl = (EditText) findViewById(R.id.lname);
                towowlnames = editl.getText().toString();

                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}