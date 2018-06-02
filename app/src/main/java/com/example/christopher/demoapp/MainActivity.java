package com.example.christopher.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Bitches");

        final TextView result = (TextView) findViewById(R.id.dick);

        Button eur = (Button) findViewById(R.id.button);
        eur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("demo", "button Clicked.");


                    result.setText("Hello, World! Bitches!");

            }
        });
    }
}
