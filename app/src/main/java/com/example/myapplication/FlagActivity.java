package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FlagActivity extends AppCompatActivity {
    ImageView btnCA, btnEG, btnFR, btnJP, btnKR, btnSP, btnTR, btnUK, btnUS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);

        btnCA = findViewById(R.id.imageCA);
        btnEG = findViewById(R.id.imageEG);
        btnFR = findViewById(R.id.imageFR);
        btnJP = findViewById(R.id.imageJP);
        btnKR = findViewById(R.id.imageKR);
        btnSP = findViewById(R.id.imageSP);
        btnTR = findViewById(R.id.imageTR);
        btnUK = findViewById(R.id.imageUK);
        btnUS = findViewById(R.id.imageUS);

        btnCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlagActivity.this, MainActivity.class);
                intent.putExtra("Flag","flag_00");
                startActivity(intent);
                finish();
            }
        });

        btnEG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlagActivity.this, MainActivity.class);
                intent.putExtra("Flag","flag_01");
                startActivity(intent);
                finish();
            }
        });
        btnFR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlagActivity.this, MainActivity.class);
                intent.putExtra("Flag","flag_02");
                startActivity(intent);
                finish();
            }
        });
        btnKR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlagActivity.this, MainActivity.class);
                intent.putExtra("Flag","flag_04");
                startActivity(intent);
                finish();
            }
        });
        btnJP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlagActivity.this, MainActivity.class);
                intent.putExtra("Flag","flag_03");
                startActivity(intent);
                finish();
            }
        });
        btnSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlagActivity.this, MainActivity.class);
                intent.putExtra("Flag","flag_05");
                startActivity(intent);
                finish();
            }
        });
        btnTR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlagActivity.this, MainActivity.class);
                intent.putExtra("Flag","flag_06");
                startActivity(intent);
                finish();
            }
        });
        btnUK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlagActivity.this, MainActivity.class);
                intent.putExtra("Flag","flag_07");
                startActivity(intent);
                finish();
            }
        });
        btnUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlagActivity.this, MainActivity.class);
                intent.putExtra("Flag","flag_08");
                startActivity(intent);
                finish();
            }
        });

    }
}