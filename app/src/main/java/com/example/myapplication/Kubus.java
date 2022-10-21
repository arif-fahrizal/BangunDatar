package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class Kubus extends AppCompatActivity {
    EditText etSisi;
    TextView tvLuas, tvKeliling, tvVolume;
    Button count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kubus);

        etSisi = (EditText) findViewById(R.id.sisi1);
        tvLuas = (TextView) findViewById(R.id.hasilLu);
        tvKeliling = (TextView) findViewById(R.id.hasilKel);
        tvVolume = (TextView) findViewById(R.id.hasilVolume);
        count = (Button) findViewById(R.id.operasi);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double sisi, Luas, Keliling, Volume;

                sisi = Double.parseDouble(String.valueOf(etSisi.getText()));
                Luas = 6 *sisi * sisi;
                Keliling = 12 * sisi;
                Volume = Math.pow(sisi, 3);

                tvLuas.setText(String.valueOf(Luas));
                tvKeliling.setText(String.valueOf(Keliling));
                tvVolume.setText(String.valueOf(Volume));
            }
        });
    }
}