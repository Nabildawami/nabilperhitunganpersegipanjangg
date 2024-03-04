package com.example.nabilperhitunganpersegipanjang;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Ambil data dari intent
        Intent intent = getIntent();
        double luas = intent.getDoubleExtra("luas", 0);
        double  Keliling = intent.getDoubleExtra("keliling", 0);
        double panjang = intent.getDoubleExtra("panjang", 0);
        double lebar = intent.getDoubleExtra("lebar", 0);

        // Setel nilai pada TextView
        TextView tvLuas = findViewById(R.id.tvLuas);
        TextView tvKeliling = findViewById(R.id.tvKeliling);
        TextView tvpanjang = findViewById(R.id.tvpanjang);
        TextView tvlebar = findViewById(R.id.tvlebar);

        tvLuas.setText(": " + luas );
        tvKeliling.setText(": " + Keliling );
        tvpanjang.setText(": " + panjang );
        tvlebar.setText(": " + lebar );
    }
}
