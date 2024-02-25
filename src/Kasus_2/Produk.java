/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus_2;

/**
 *
 * @author dzaka
 */
public class Produk {
    // Instance Fields
    private String nama_produk;
    private double harga_produk;
    private int qty;
    private int sisaq;
    private static byte id = 0;
    
    // Constructors
    public Produk (String nama, double harga, int stock){
        this.nama_produk = nama;
        this.harga_produk = harga;
        this.qty = stock;
        this.sisaq = stock;
        this.id = (byte) ++id;
    }

    public String getNama() {
        return nama_produk;
    }

    public double getHarga() {
        return harga_produk;
    }

    public int getQty() {
        return qty;
    }

    public int qetSisaQ(int jml) {
        if (jml <= sisaq) {
            sisaq -= jml;
        } else {
            System.err.println("Tak Cukup Stock.");
        }
        
        return sisaq;
    }
}
