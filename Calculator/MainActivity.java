package com.example.calculator;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button addBtn, subBtn, mulBtn, divBtn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);

        addBtn = findViewById(R.id.addBtn);
        subBtn = findViewById(R.id.subBtn);
        mulBtn = findViewById(R.id.mulBtn);
        divBtn = findViewById(R.id.divBtn);

        addBtn.setOnClickListener(v -> calculate("+"));
        subBtn.setOnClickListener(v -> calculate("-"));
        mulBtn.setOnClickListener(v -> calculate("*"));
        divBtn.setOnClickListener(v -> calculate("/"));
    }
    private void calculate(String op) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        if (n1.isEmpty() || n2.isEmpty()) {
            result.setText("Please enter both numbers");
            return;
        }

        double a = Double.parseDouble(n1);
        double b = Double.parseDouble(n2);
        double res = 0;

        switch (op) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                if (b != 0)
                    res = a / b;
                else {
                    result.setText("Cannot divide by zero");
                    return;
                }
                break;
        }

        
        result.setText("Result: " + a + " " + op + " " + b + " = " + res);
    }}
