package com.example.myapp; // Replace with your actual package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ImageDisplayActivity extends AppCompatActivity {

    private Button buttonChange;

    private ImageView imageView;
    private int currentImageIndex = 0;
    private final int[] imageResources = {R.drawable.image1, R.drawable.image2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);

        buttonChange = findViewById(R.id.changeButton);
        imageView = findViewById(R.id.imageViewFullScreen);


        ImageView imageViewFullScreen = findViewById(R.id.imageViewFullScreen);

        // Get the image resource ID from the intent
        Intent intent = getIntent();
        int imageResId = intent.getIntExtra("IMAGE_RES_ID", R.drawable.image1);

        // Set the image resource to the ImageView
        imageViewFullScreen.setImageResource(imageResId);

        //change button

        buttonChange.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        currentImageIndex = (currentImageIndex + 1) % imageResources.length;
        imageView.setImageResource(imageResources[currentImageIndex]);
          }
        });
    }
}
