package com.example.andelaphase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button myProfile;
    Button aboutALC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeContents();


        aboutALC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutALC = new Intent(MainActivity.this, AboutALCActivity.class);
                startActivity(aboutALC);
            }
        });

        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent runProfile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(runProfile);
            }
        });


    }

    private void initializeContents() {
        myProfile = findViewById(R.id.my_profile);
        aboutALC = findViewById(R.id.about_alc);
    }


}
