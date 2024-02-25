/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus_2;
import java.util.Scanner;

/**
 *
 * @author dzaka
 */
public class Menu {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Mutators
    Produk[] listmenu = new Produk[10];
    listmenu[0] = new Produk("Batagor", 5_000, 10);
    listmenu[1] = new Produk("Roti Bakar", 12_000, 10);
    listmenu[2] = new Produk("Indomie+Telor", 10_000, 10);
    listmenu[3] = new Produk("Kwetiaw", 12_000, 10);
    listmenu[4] = new Produk("Nasi Goreng", 12_000, 10);
    listmenu[5] = new Produk("Air Mineral", 3_000, 10);
    listmenu[6] = new Produk("Teh Manis", 4_000, 10);
    listmenu[7] = new Produk("Jus Alpukat", 8_000, 10);
    listmenu[8] = new Produk("Teh Botol", 5_000, 10);
    listmenu[9] = new Produk("Kopi", 3_000, 10);

    System.out.println("=====================");
    System.out.println("Daftar Menu Makanan");
    System.out.println("=====================");
    for(int i=0; i<listmenu.length; i++){
        System.out.println((i+1) + ". " + listmenu[i].getNama() + "\tRp. " + listmenu[i].getHarga());
    }

    Penjualan jual = new Penjualan("", 0, 0);
    boolean Order = true;
    while(Order){
        System.out.println("--------------------");
        System.out.print("Pilih produk: ");
        int milih = input.nextInt();
        System.out.print("Jumlah pesanan: ");
        int jml = input.nextInt();
        if(milih <= 0 || milih > listmenu.length){
            System.out.println("Pilihan tidak tersedia!");
            continue;
        }
            if(jml <= 0 || jml > listmenu[milih-1].getQty()){
            System.out.println("Tak Cukup Stock.");
            continue;
        }

    Produk pesanan = listmenu[milih-1];
    double total = pesanan.getHarga()*jml;
    jual.jumBiaya(total);
    pesanan.qetSisaQ(jml);

    System.out.println("Pesanan: " + jml + " " + pesanan.getNama() + " seharga Rp. " + total);
    System.out.print("Apakah ingin memesan lagi? (Ya/Tidak) ");
    String jwb = input.next();
    if(!jwb.equalsIgnoreCase("Ya")){
        Order = false;
    }

    System.out.println("---------------------");
    System.out.println("Total Bayar: " + jual.getTotHarga());
    }
    
    System.out.println("Terima kasih sudah memesan!");
    }
}

