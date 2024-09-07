package com.example.myapp; // Replace with your actual package name

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonRed;
    private Button buttonGreen; // Changed to match XML
    private Button buttonClear;
    private Button buttonNext;

    //private Button buttonShowImage; // Added for showing image
   // private ImageView imageView;
   //private int currentImageIndex = 0;
    //private final int[] imageResources = {R.drawable.image1, R.drawable.image2}; // Add your image resources here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        textView = findViewById(R.id.textView);
        buttonRed = findViewById(R.id.redButton);
        buttonGreen = findViewById(R.id.blueButton); // Changed to match XML
        buttonClear = findViewById(R.id.clearButton);
        buttonNext = findViewById(R.id.nextButton);

        //buttonShowImage = findViewById(R.id.changeButton); // Added for showing image
        //imageView = findViewById(R.id.imageView);

        // Set button click listeners
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Red is clicked");
                textView.setTextColor(Color.RED);
                Toast.makeText(MainActivity.this, "This is Red!", Toast.LENGTH_SHORT).show();
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Green is clicked");
                textView.setTextColor(Color.GREEN);
                Toast.makeText(MainActivity.this, "This is Green!", Toast.LENGTH_SHORT).show();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(" ");
                textView.setTextColor(Color.BLACK);
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
                //intent.putExtra("IMAGE_RES_ID", imageResources[currentImageIndex]);
                startActivity(intent);
            }
        });


       // buttonNext.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View v) {
               // currentImageIndex = (currentImageIndex + 1) % imageResources.length;
               // imageView.setImageResource(imageResources[currentImageIndex]);
         //   }
       // });




       // buttonShowImage.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View v) {
             //   Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
               // intent.putExtra("IMAGE_RES_ID", imageResources[currentImageIndex]);
                //startActivity(intent);
           // }
        //});
    }
}
