/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan37.rataratanilaioo;

import java.util.Scanner;

/**
 *
 * @author programmer
 */
public class Mahasiswa {
    private int byk;
    private double total, rata;
    
    public void setbyk(int byk) {
        this.byk = byk;
    }
    
    private double tampilNilai() {
        for(int i = 1; i<=byk; i++) {
            System.out.print("Nilai mahasiswa ke-"+i+" : ");
            Scanner scanner2 = new Scanner(System.in);
            String nilai = scanner2.next();
            
            total += Integer.parseInt(nilai);
            
        }
        return total;
    }
    
    public void hitungRataRata() {
        total = tampilNilai();
        
        rata = total / byk;
        System.out.println("\nMaka, rata-rata nilainya adalah "+rata);
    }
}
