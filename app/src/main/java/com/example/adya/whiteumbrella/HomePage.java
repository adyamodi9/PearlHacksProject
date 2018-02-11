package com.example.adya.whiteumbrella;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button mapbutton = findViewById(R.id.button2);
        mapbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                android.content.Intent myIntent1 = new android.content.Intent(view.getContext(), MapsActivity.class);
                startActivityForResult(myIntent1, 0);
            }
        });
        Button forumbutton = findViewById(R.id.button3);
        mapbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                android.content.Intent myIntent2 = new android.content.Intent(view.getContext(), Welcomescreen.class);
                startActivityForResult(myIntent2, 0);
            }
        });
        Button profilebutton = findViewById(R.id.button4);
        mapbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                android.content.Intent myIntent3 = new android.content.Intent(view.getContext(), MapsActivity.class);
                startActivityForResult(myIntent3, 0);
            }
        });
    }
}
