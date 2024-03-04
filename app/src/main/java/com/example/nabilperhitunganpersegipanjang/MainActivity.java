package com.example.nabilperhitunganpersegipanjang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edPanjang, edLebar;
    Button btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edPanjang = findViewById(R.id.edPanjang);
        edLebar = findViewById(R.id.edLebar);
        btHitung = findViewById(R.id.btHitung);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double panjang = Double.parseDouble(edPanjang.getText().toString());
                double lebar = Double.parseDouble(edLebar.getText().toString());

                double luas = panjang * lebar;
                double Keliling = 2 * (panjang + lebar);

                // Start activity baru (MainActivity2)
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("luas", luas);
                intent.putExtra("keliling", Keliling);
                intent.putExtra("panjang", panjang);
                intent.putExtra("lebar", lebar);
                startActivity(intent);
            }
        });
    }
}
