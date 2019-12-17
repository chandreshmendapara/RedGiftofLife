package com.example.regoli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    private TextView health,personal;
    private CardView c_personal,c_health;
    private ImageButton back;
    private View v1,v2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        health =(TextView)findViewById(R.id.h);
        personal =(TextView)findViewById(R.id.p);
        c_personal=(CardView)findViewById(R.id.c_profile);
        c_health=(CardView)findViewById(R.id.c_health);
        back=(ImageButton)findViewById(R.id.back);
        v1 =(View)findViewById(R.id.v1);
        v2= (View)findViewById(R.id.v2);
        v2.setVisibility(View.GONE);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                health.setAlpha(1);
                personal.setAlpha((float) 0.5);
                c_health.setVisibility(View.VISIBLE);
                c_personal.setVisibility(View.GONE);
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.VISIBLE);
            }
        });

        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                personal.setAlpha(1);
                health.setAlpha((float) 0.5);
                c_personal.setVisibility(View.VISIBLE);
                c_health.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v1.setVisibility(View.VISIBLE);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(UserProfile.this,Dashboard.class);
                startActivity(i);
            }
        });
    }
}
