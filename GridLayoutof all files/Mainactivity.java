package com.example.layoutsinexplicit;



import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout1 = findViewById(R.id.layout1);
        LinearLayout layout2 = findViewById(R.id.layout2);
        LinearLayout layout3 = findViewById(R.id.layout3);
        LinearLayout layout4 = findViewById(R.id.layout4);
        LinearLayout layout5 = findViewById(R.id.layout5);
        LinearLayout layout6 = findViewById(R.id.layout6);

        layout1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, linear.class)));
        layout2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, realtive.class)));
        layout3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, table.class)));
        layout4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, grid.class)));
        layout5.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,frame.class)));
        layout6.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, list.class)));
    }
}
