package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {
    ImageView gambar;
    TextView namamakanan, harga, deskripsi;

    String namaMakanan, hargaM, deskripsiM;
    int foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        namamakanan = findViewById(R.id.namamakanan);
        harga = findViewById(R.id.harga);
        deskripsi = findViewById(R.id.deskripsi);
        gambar = findViewById(R.id.gambar);

        Bundle bundle = getIntent().getExtras();
        foto = bundle.getInt(String.valueOf("foto"));
        gambar.setImageResource(foto);

        getInputExtra();
    }

    private void  getInputExtra() {
        namaMakanan = getIntent().getStringExtra("nama");
        hargaM = getIntent().getStringExtra("harga");
        deskripsiM = getIntent().getStringExtra("deskripsi");

        setDataActivity(namaMakanan, hargaM, deskripsiM);
    }

    private void setDataActivity(String namaMakanan, String hargaM, String deskripsiM) {
        namamakanan.setText(namaMakanan);
        deskripsi.setText(deskripsiM);
        harga.setText(hargaM);
    }
}