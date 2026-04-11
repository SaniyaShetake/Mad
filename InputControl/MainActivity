package com.example.spinner;


import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    ToggleButton toggleBtn;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        toggleBtn = findViewById(R.id.toggleBtn);
        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(v -> {

            int selectedId = radioGroup.getCheckedRadioButtonId();
            RadioButton radioButton = findViewById(selectedId);

            String gender = "";
            if (radioButton != null) {
                gender = radioButton.getText().toString();
            } else {
                gender = "Not Selected";
            }

            String toggleStatus;
            if (toggleBtn.isChecked()) {
                toggleStatus = "ON";
            } else {
                toggleStatus = "OFF";
            }

        
            Toast.makeText(this,
                    "Gender: " + gender + "\nToggle: " + toggleStatus,
                    Toast.LENGTH_LONG).show();
        });
    }
}
