/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dzaka
 */
public class Restaurant {
    // Instance Fields
    private List<Makanan> orders;
    private Makanan[] menu;
    private int count;

    // Constructors
    public Restaurant() {
        menu = new Makanan[10];
        count = 0;
        orders = new ArrayList<>();
    }

    // Methods
    public void tambahMenuMakanan(Makanan makanan) {
        if (count < menu.length) {
            menu[count++] = makanan;
        } else {
            System.err.println("ERROR: Array full");
        }
    }

    public void tampilMenuMakanan() {
        for (Makanan makanan : menu) {
            if (makanan != null && makanan.getStock() > 0) {
                System.out.println(makanan);
            }
        }
    }
    
    private Makanan cariNama(String nama) {
        for (Makanan makanan : menu) {
            if (makanan != null && makanan.getNama().equals(nama)) {
                return makanan;
            }
        }
        return null;
    }
    
    public void pesanOrder(String nama, int jml) {
        Makanan menu = cariNama(nama);
        if (menu != null) {
            menu.minusStock(jml);
            orders.add(menu);
        } else {
            System.err.println("Menu item not found.");
        }
    }
}
