package com.example.adya.whiteumbrella;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RegistrationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        Button but = findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                android.content.Intent myIntent2 = new android.content.Intent(view.getContext(), Map.class);
                startActivityForResult(myIntent2, 0);
            }
        });
    }
}
