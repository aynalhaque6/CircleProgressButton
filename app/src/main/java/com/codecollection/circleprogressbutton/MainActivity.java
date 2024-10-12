package com.codecollection.circleprogressbutton;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CircleProgressButton progressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressButton = findViewById(R.id.sendingBtn);
        progressButton.setOnProgressCompleteListener(new CircleProgressButton.OnProgressCompleteListener() {
            @Override
            public void onProgressComplete() {
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
            }
        });

    }
}