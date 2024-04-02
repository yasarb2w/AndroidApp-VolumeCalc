package com.myapp.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {
    EditText cylinder_radius, cylinder_height;
    TextView title, result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        cylinder_radius = findViewById(R.id.editText_sphere);
        cylinder_height = findViewById(R.id.editText_height);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(View->{
            String radius = cylinder_radius.getText().toString();
            String height = cylinder_height.getText().toString();
            int r = Integer.parseInt(radius);
            int h = Integer.parseInt(height);

            // V=πr2h

            double volume = 3.14159 * r*r * h;
            result.setText("V = "+volume);
        });
    }
}