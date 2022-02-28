package com.example.ImmediateHelpApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    CardView cardContact, cardDisease, cardKitTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Card view
        cardContact = (CardView) findViewById(R.id.cardContact);
        cardDisease = (CardView) findViewById(R.id.cardDisease);
        cardKitTool = (CardView) findViewById(R.id.cardTool);


        cardContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);


            }
        });

        cardDisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuActivity.this,DiseaseActivity.class);
                startActivity(intent);


            }
        });

        cardKitTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuActivity.this,FirstAidActivity.class);
                startActivity(intent);


            }
        });

    }
}