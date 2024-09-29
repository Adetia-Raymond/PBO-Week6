/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum.praktikumpbo_6;

/**
 *
 * @author Raymond
 */
public class PraktikumPBO_6 {

    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku1 = new Buku("Buku Pemrograman Java", 50000);
        Produk elektronik1 = new Elektronik("Laptop", 7000000);
        Produk pakaian1 = new Pakaian("Jaket", 100000);

        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(elektronik1);
        keranjang.tambahProduk(pakaian1);

        keranjang.tampilkanKeranjang();

        double totalHargaSetelahDiskon = keranjang.TotalHargaSetelahDiskon();
        System.out.println("Total Harga Setelah Diskon: " + totalHargaSetelahDiskon);
    }
}
