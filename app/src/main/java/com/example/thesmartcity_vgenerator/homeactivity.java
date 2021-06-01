package com.example.thesmartcity_vgenerator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class homeactivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);

        LinearLayout form_lay=findViewById(R.id.form_layout);
        ImageView logout=findViewById(R.id.btn_logout);
        firebaseAuth= FirebaseAuth.getInstance();
        form_lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homeactivity.this,formactivity.class));
            }
        });


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(homeactivity.this,login_activity.class));
                Toast.makeText(homeactivity.this,"You have been successfully logged out", Toast.LENGTH_SHORT).show();
            }
        });
    }
}