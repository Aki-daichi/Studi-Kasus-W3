/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus_1;

/**
 *
 * @author dzaka
 */

// Create a Main class
public class Main {
     public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan(new Makanan("Bala-Bala", 1_000, 20));
        menu.tambahMenuMakanan(new Makanan("Gehu", 1_000, 20));
        menu.tambahMenuMakanan(new Makanan("Tahu", 1_000, 0));
        menu.tambahMenuMakanan(new Makanan("Molen", 1_000, 0));
        
        menu.pesanOrder("Gehu", 5);
        
        menu.tampilMenuMakanan();
    }
}

