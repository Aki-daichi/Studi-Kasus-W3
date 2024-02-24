/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus_1;

/**
 *
 * @author dzaka
 */
public class Makanan {
    // Instance Fields
    private String nama;
    private double harga;
    private int stock;
    private int sisaS;
    private static byte id = 0;
    
    // Constructors
    public Makanan (String nama, double harga, int stock){
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
        this.sisaS = stock;
        this.id = (byte) ++id;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }

    public void minusStock(int jml) {
        if (jml <= sisaS) {
            sisaS -= jml;
        } else {
            System.err.println("Tak Cukup Stock.");
        }
    }
    // Return override
    @Override
    public String toString() {
        return nama + "[" + stock + "/" + sisaS +"]" + "\tRp. " + harga;
    }
}

