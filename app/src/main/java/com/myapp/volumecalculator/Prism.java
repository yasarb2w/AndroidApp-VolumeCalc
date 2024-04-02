package com.myapp.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {
    EditText area_base, prism_height;
    TextView title, result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        area_base = findViewById(R.id.editText_sphere);
        prism_height = findViewById(R.id.editText_height);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(View->{
            String Base = area_base.getText().toString();
            String height = prism_height.getText().toString();
            int B = Integer.parseInt(Base);
            int h = Integer.parseInt(height);

            // V= B × h

            double volume = B * h;
            result.setText("V = "+volume);
        });
    }
}