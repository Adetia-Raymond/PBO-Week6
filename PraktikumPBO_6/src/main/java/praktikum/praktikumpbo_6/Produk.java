/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.praktikumpbo_6;

/**
 *
 * @author Raymond
 */
import java.util.ArrayList;
import java.util.List;

abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungDiskon();

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
    
}

// Kelas Buku yang merupakan turunan dari Produk
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    // Implementasi hitungDiskon untuk Buku (misalnya 10% diskon)
    @Override
    public double hitungDiskon() {
        return harga * 0.10; // Diskon 10%
    }
}

// Kelas Elektronik yang merupakan turunan dari Produk
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    // Implementasi hitungDiskon untuk Elektronik (misalnya 5% diskon)
    @Override
    public double hitungDiskon() {
        return harga * 0.05; // Diskon 5%
    }
}

// Kelas Pakaian yang merupakan turunan dari Produk
class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    // Implementasi hitungDiskon untuk Pakaian (misalnya 15% diskon)
    @Override
    public double hitungDiskon() {
        return harga * 0.15; // Diskon 15%
    }
}

// Kelas KeranjangBelanja untuk menyimpan daftar produk
class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja() {
        this.produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    public double TotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : produkList) {
            total += (produk.getHarga() - produk.hitungDiskon());
        }
        return total;
    }

    public void tampilkanKeranjang() {
        for (Produk produk : produkList) {
            System.out.println("Produk: " + produk.getNama() + ", Harga: " + produk.getHarga() +
                    ", Diskon: " + produk.hitungDiskon() + ", Harga Setelah Diskon: " + (produk.getHarga() - produk.hitungDiskon()));
        }
    }
}




