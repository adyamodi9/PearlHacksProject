package com.example.adya.whiteumbrella;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        ImageButton logo = findViewById(R.id.log);
        logo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setContentView(R.layout.activity_registration_page);
                //android.content.Intent myIntent = new android.content.Intent(view.getContext(), LoginPage.class);
                //startActivityForResult(myIntent, 0);
            }
        });
    }
}
