package com.example.actividad01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtCounter = findViewById(R.id.txt_view);
        Button button = findViewById(R.id.btn_counter);
        Button button2 = findViewById(R.id.btn_restart);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                txtCounter.setText(""+ counter);
                Log.d("CLICKER", "CLICK");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                txtCounter.setText(""+ counter);
            }
        });
    }
}