package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnEdit, btnCreate;
    private TextView textName, textCountry;
    private ImageView flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnEdit = findViewById(R.id.btnEdit);
        btnCreate = findViewById(R.id.btnCreate);
        textCountry = findViewById(R.id.textCountry);
        textName = findViewById(R.id.textName);
        flag = findViewById(R.id.flag);
        flag.setImageResource(R.drawable.flag_00);

        Bundle extra = getIntent().getExtras();
        if (extra != null){
            String Flag = getIntent().getStringExtra("Flag");
            int resId = getResources().getIdentifier(Flag, "drawable", getPackageName());
            flag.setImageResource(resId);
            Log.e("FLAG", Flag);
        }







        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FlagActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String County = textCountry.getText().toString();
                String Name = textName.getText().toString();

                if (County.equals("")){
                    textCountry.setError("Enter a country");
                }else if (Name.equals("")){
                    textName.setError("Enter a team name");
                }else{
                    Toast.makeText(MainActivity.this, "Team "+ Name +" from "+ County+" has been created!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}