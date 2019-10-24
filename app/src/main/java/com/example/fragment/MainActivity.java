package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnRed, btnGreen, btnBlue;
    Fragment fragmentColor;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentColor fragmentColor = new FragmentColor();
        fragmentTransaction.add(R.id.frgColor, fragmentColor);
        fragmentTransaction.commit();
    }
    public void initView(){
        btnBlue = (Button) findViewById(R.id.btnBlue);
        btnGreen = (Button) findViewById(R.id.btnGreen);
        btnRed = (Button) findViewById(R.id.btnrRed);
        frameLayout = (FrameLayout) findViewById(R.id.frgColor);
        btnRed.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnrRed :
                Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
                frameLayout.setBackgroundColor(Color.parseColor("#FD0202"));
                break;
            case R.id.btnBlue :
                Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show();
                frameLayout.setBackgroundColor(Color.parseColor("#0901FA"));
                break;
            case R.id.btnGreen :
                Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show();
                frameLayout.setBackgroundColor(Color.parseColor("#44FA02"));
                break;
        }
    }
}
