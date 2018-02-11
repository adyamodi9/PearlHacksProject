package com.example.adya.whiteumbrella;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_location);

        Button ntr = findViewById(R.id.enter);
        ntr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                android.content.Intent myIntent1 = new android.content.Intent(view.getContext(), MapsActivity.class);
                startActivityForResult(myIntent1, 0);
            }
        });
    }
}
