package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private final String TAG = "OOP_ACT";
    private Button persegi, lingkaran, segitiga, kubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persegi = (Button) findViewById(R.id.gambar_persegi1);
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), Persegi.class);
                startActivity(intent);
            }
        });

        lingkaran = (Button) findViewById(R.id.gambar_lingkaran1);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), Lingkaran.class);
                startActivity(intent);
            }
        });

        segitiga = (Button) findViewById(R.id.gambar_segitiga1);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), Segitiga.class);
                startActivity(intent);
            }
        });

        kubus = (Button) findViewById(R.id.gambar_kubus1);
        kubus.setOnClickListener(v -> {
            Intent intent = new Intent (getApplicationContext(), Kubus.class);
            startActivity(intent);
        });
    }
}


///* Intasiasi manual/cara lama
//        psg.panjang = 10;
//        //psg.lebar = 5;
//        //psg.hitungLuas(false);
//        //Log.i(TAG, "Luas dari Persegi tersebut adalah: "+psg.getLuas());*/
//
//    //Instasiasi class Persegi
//    Persegi psg = new Persegi(10, 10);
//        psg.hitungBidang();
//
//                //Instasiasi class Lingkaran
//                Lingkaran ling = new Lingkaran(10);
//                ling.hitungBidang();
//
//                //Instasiasi dengan Array List<>
//                ArrayList<BidangDatar> dataBidang = new ArrayList<>();
//        dataBidang.add(new Persegi(5,5));
//        dataBidang.add(new Lingkaran(7));
//        dataBidang.add(new Persegi( 10,9));
//        dataBidang.add(new Persegi(8, 5));
//        dataBidang.add(new Lingkaran(9));
//        dataBidang.add(new Segitiga(9, 8));
//        dataBidang.add(new Segitiga(8, 5));
//
//        //Pemanggilan fungsi menggunakan foreach
//        for(BidangDatar bidang:dataBidang){
//        if(bidang.getNamaBidang().equalsIgnoreCase("Lingkaran")) {
//        Log.i(TAG, "Diameter Lingkaran: "+((Lingkaran)bidang).getDiameter());
//                /*Untuk mendapatkan atau mengambil nilai dari diameter, karena kita tidak bisa
//                mengambil nilainya dari class 'BidangDatar' maka kita harus meng-casting atau
//                memaksakan agar variable 'bidang' berubah orientasi ke class Lingkaran agar bisa
//                mengambil nilai diameter tsb.*/
//        }
//        bidang.hitungBidang();
//        Log.i(TAG, "======================");
//        }