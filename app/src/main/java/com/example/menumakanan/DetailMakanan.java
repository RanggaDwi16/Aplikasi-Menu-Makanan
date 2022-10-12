package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {
    ImageView gambar;
    TextView namamakanan, harga, deskripsi;
    RatingBar ratingbar;

    String namaMakanan, hargaM, deskripsiM;
    int foto;
    Float rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        namamakanan = findViewById(R.id.namamakanan);
        harga = findViewById(R.id.harga);
        deskripsi = findViewById(R.id.deskripsi);
        gambar = findViewById(R.id.gambar);
        ratingbar = findViewById(R.id.ratingBar);

        Bundle bundle = getIntent().getExtras();
        foto = bundle.getInt(String.valueOf("foto"));
        gambar.setImageResource(foto);

        Bundle bundle1 = getIntent().getExtras();
        rating = bundle1.getFloat(String.valueOf("rating"));
        ratingbar.setRating(rating);

        getInputExtra();
    }

    private void  getInputExtra() {
        namaMakanan = getIntent().getStringExtra("nama");
        hargaM = getIntent().getStringExtra("harga");
        deskripsiM = getIntent().getStringExtra("deskripsi");
        rating = getIntent().getFloatExtra("rating", rating);

        setDataActivity(namaMakanan, hargaM, deskripsiM, rating);
    }

    private void setDataActivity(String namaMakanan, String hargaM, String deskripsiM, float rating) {
        namamakanan.setText(namaMakanan);
        deskripsi.setText(deskripsiM);
        harga.setText(hargaM);
    }
}