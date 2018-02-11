package com.example.adya.whiteumbrella;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Stack;

public class HomePage extends AppCompatActivity {
    Stack<Spots> spots = new Stack<>();

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
        forumbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                android.content.Intent myIntent2 = new android.content.Intent(view.getContext(), ForumPage.class);
                startActivityForResult(myIntent2, 0);
            }
        });
        Button profilebutton = findViewById(R.id.button4);
        profilebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                android.content.Intent myIntent3 = new android.content.Intent(view.getContext(), UserView.class);
                startActivityForResult(myIntent3, 0);
            }
        });
        Button donatebutton = findViewById(R.id.donate);
        donatebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                android.content.Intent myIntent7 = new android.content.Intent(view.getContext(), DonationsPage.class);
                startActivityForResult(myIntent7, 0);
            }
        });
    }
}
