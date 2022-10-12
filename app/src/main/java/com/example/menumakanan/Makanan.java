package com.example.menumakanan;

public class Makanan {
    private String nama, harga, deskripsi;
    private int id_gambar;
    private float rating;

    public Makanan(String nama, String harga, String deskripsi, int id_gambar, float rating) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.id_gambar = id_gambar;
        this.rating = rating;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getId_gambar() {
        return id_gambar;
    }

    public void setId_gambar(int id_gambar) {
        this.id_gambar = id_gambar;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
