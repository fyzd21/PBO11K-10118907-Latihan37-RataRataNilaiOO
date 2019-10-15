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
public class PBO11K10118907Latihan37RataRataNilaiOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int byk;
        System.out.print("Masukkan banyaknya mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        String mhs = scanner.next();
        
        byk = Integer.parseInt(mhs);
        
        Mahasiswa m = new Mahasiswa();
        m.setbyk(byk);
        m.hitungRataRata();
        
        System.out.println("\nDeveloped by : Yazid");
    }
    
}
