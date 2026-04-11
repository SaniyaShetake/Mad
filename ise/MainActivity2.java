package com.example.camera;

import android.widget.Button;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = findViewById(R.id.imageView2);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        TextView txtRating = findViewById(R.id.txtRating);
        Button btnBack = findViewById(R.id.btnBack);

        Bitmap photo = getIntent().getParcelableExtra("image");
        imageView.setImageBitmap(photo);
        ratingBar.setOnRatingBarChangeListener((ratingBar1, rating, fromUser) -> {
            txtRating.setText("Rating: " + rating);

            btnBack.setOnClickListener(v -> {
                finish();  // closes this activity and goes back
            });

        });
    }
}