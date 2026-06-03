package com.example.belajarandroid10pplg02;

public class AudioModel {
    String lagu;
    String pembuat;
    String genre;
    int jumlahpendengar;
    String imgUrl;

    public AudioModel(String lagu, String pembuat, String genre, int jumlahpendengar, String imgUrl) {
        this.lagu = lagu;
        this.pembuat = pembuat;
        this.genre = genre;
        this.jumlahpendengar = jumlahpendengar;
        this.imgUrl = imgUrl;
    }

    public String getLagu() {
        return lagu;
    }

    public String getPembuat() {
        return pembuat;
    }

    public String getGenre() {
        return genre;
    }

    public int getJumlahpendengar() {
        return jumlahpendengar;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
