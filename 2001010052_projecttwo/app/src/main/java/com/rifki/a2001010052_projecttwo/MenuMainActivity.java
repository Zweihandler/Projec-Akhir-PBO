package com.rifki.a2001010052_projecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void halamanSatu(View view) {
        Intent in1 = new Intent(MenuMainActivity.this, VolumeActivity.class);
        startActivity(in1);
    }

    public void halamanDua(View view) {
        Intent in2 = new Intent(MenuMainActivity.this, KalkulatorActivity.class);
        startActivity(in2);
    }

    public void halamanTiga(View view) {
        Intent in3 = new Intent(MenuMainActivity.this, MoneyActivity.class);
        startActivity(in3);
    }
}