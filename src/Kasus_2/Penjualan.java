/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus_2;

/**
 *
 * @author dzaka
 */
public class Penjualan {
    // Instance Fields
    private String nama_produk;
    private int qty;
    private double harga_total;
    
    // Constructors
    public Penjualan(String nama, int qty, double harga){
        this.nama_produk = nama;
        this.qty = qty;
        this.harga_total = harga;
    }

    public String getNama(String nama){
        return nama_produk;
    }
    
    public int getQty(){
        return qty;
    }
    
    public double getTotHarga(){
        return harga_total;
    }

    public void jumBiaya(double harga){
        this.harga_total += harga;
    }
}

