package com.myapp.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {
    EditText cube_edge;
    TextView title, result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        cube_edge = findViewById(R.id.editText_sphere);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(View->{
            String edge = cube_edge.getText().toString();

            int a = Integer.parseInt(edge);

            // V=a^3

            double volume = a*a*a;
            result.setText("V = "+volume);

        });
    }
}