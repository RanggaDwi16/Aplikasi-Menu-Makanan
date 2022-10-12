package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView itemMakanan;
    private ArrayList<Makanan> listMakanan;
    ImageView listmakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemMakanan = findViewById(R.id.item_makanan);
        initData();

        itemMakanan.setAdapter(new MakananAdapter(listMakanan));
        itemMakanan.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Mie Angel" ,
                "Rp 9.500",
                "Mie Angel diambil dari kata angel dalam bahasa Inggris yang berarti malaikat. " +
                        "Seperti namanya, mie ini lebih ke rasa gurih.\n" +
                        "Mie angel ini cocok untuk kamu yang nggak suka atau nggak kuat makan pedas. " +
                        "Mie ini juga cocok buat disantap untuk anak-anak karena rasanya yang gurih.",
                R.drawable.mieangel, 5));
        listMakanan.add(new Makanan("Mie Iblis" ,
                "Rp 10.500",
                "Mie iblis ini adalah mie yang memiliki rasa pedas dan manis. " +
                        "Jadi, buat kamu yang suka dengan rasa pedas manis ini adalah menu yang cocok.\n" +
                        "Soal tingkat kepedasan, mie iblis ini memiliki 8 tingkat kepedasan. " +
                        "Dari level 1 sampai yang terbesar yakni level 8. Pastinya level 8 ini rasa pedasnya akan lebih dominan.",
                R.drawable.mieiblis, 4));
        listMakanan.add(new Makanan("Mie Setan" ,
                "Rp 9.500",
                "Menu Mie Gacoan yang juga tak kalah pedas dari mie iblis adalah mie setan. " +
                        "Dari namanya saja kita sudah membayangkan pedasnya mie setan ini. " +
                        "Mie setan memiliki rasa pedas dan asin.\n" +
                        "Sama seperti mie iblis, mie setan juga memiliki 8 tingkat kepedasan. " +
                        "Level 1 – 4 cocok untuk kamu yang ingin makan dengan santai.",
                R.drawable.miesetan, 4));
        listMakanan.add(new Makanan("Pangsit Goreng" ,
                "Rp 9.500",
                "Nah, buat kamu yang merasa kurang dengan pangsit gorengnya, kamu bisa memesan pangsit goreng secara terpisah juga. " +
                        "Dengan hanya merogoh kocek Rp 9.500, kamu bisa merasakan kerenyahan pangsit dengan isian ayam/daging yang gurih.",
                R.drawable.pangsit, 4.5F));
        listMakanan.add(new Makanan("Dimsum" ,
                "Rp 8.000",
                "Mie Gacoan juga menyediakan menu selain mie. Ada juga varian dimsum yang nggak kalah nikmat dengan mie-nya. " +
                        "Ada siomay, udang keju, udang rambutan, dan lumpia udang.\n" +
                        "Udang keju adalah udang dengan keju yang dibalut dengan tepung roti lalu digoreng. " +
                        "Memiliki cita rasa gurih dan memiliki tekstur renyah. Cocok juga buat tambahan makan mie.",
                R.drawable.dimsum, 4.5F));
        listMakanan.add(new Makanan("Ceker" ,
                "Rp 8.000",
                "Nah, buat kamu yang suka dengan kuliner pedas, ada juga, nih, menu tambahan yang memiliki cita rasa pedas yakni ceker.\n" +
                        "Menu ceker ini dilumuri dengan bumbu pedas dan ditambah dengan bumbu khas. " +
                        "Rasa pedasnya bisa menggugah selera makan dan cocok juga sebagai menu tambahan untuk mie.",
                R.drawable.ceker, 3.5F));
    }



}