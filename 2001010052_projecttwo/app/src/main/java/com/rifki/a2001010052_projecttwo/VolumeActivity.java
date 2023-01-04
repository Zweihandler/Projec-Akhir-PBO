package com.rifki.a2001010052_projecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class VolumeActivity extends AppCompatActivity {


    private EditText atpanjang;
    private EditText atlebar;
    private EditText attinggi;
    private TextView hasil;
    private Button btnhitung;
    private Button btnclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        initUI();
        initEvent();
        btnclear = (Button) findViewById(R.id.btnClear);

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                atpanjang.setText("");
                atlebar.setText("");
                attinggi.setText("");
                hasil.setText("");
            }
        });
    }
    private void initEvent() {
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                HitungVolume();
            }
        });

    }

    private void HitungVolume() {
        double panjang = Double.parseDouble(atpanjang.getText().toString());
        double lebar = Double.parseDouble(atlebar.getText().toString());
        double tinggi = Double.parseDouble(attinggi.getText().toString());
        double volume = (panjang * lebar) * tinggi;
        hasil.setText("Volume Balok = " + volume);
    }

    private void initUI() {
        atpanjang = (EditText) findViewById(R.id.atpanjang);
        atlebar = (EditText) findViewById(R.id.atlebar);
        attinggi = (EditText) findViewById(R.id.attinggi);
        hasil = (TextView) findViewById(R.id.hasil);
        btnhitung = (Button) findViewById(R.id.btnhitung);
    }



}