/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Original_Case;

/**
 *
 * @author dzaka
 */
public class Restaurant {
    public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stock;
    public static byte id = 0;
    
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stock = new int[10];
    }
    
    public void tambahMenuMakanan (String nama, double harga, int stock) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stock[id] = stock;
    }
    
    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i ++) {
            if (!isOutOfStock(i)) {
                System.out.print(nama_makanan[i] + "[" + stock[i] + "]" +  "\tRp. " + harga_makanan[i] + "\n");
            }
        }
    }
    
    public boolean isOutOfStock(int id) {
        if (stock[id] == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void nextId() {
        id++;
    }
}