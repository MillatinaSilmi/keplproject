/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator2;

import java.util.Scanner;

/**
 *
 * @author bpdas
 */
public class Calculator2 {

   
    
    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();

        System.out.println("Selamat datang di Aplikasi Kalkulator Sederhana!");
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        System.out.println("Pilih operasi:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        try {
            switch (pilihan) {
                case 1 -> System.out.println("Hasil penjumlahan: " + calculator.tambah(angka1, angka2));
                case 2 -> System.out.println("Hasil pengurangan: " + calculator.kurang(angka1, angka2));
                case 3 -> System.out.println("Hasil perkalian: " + calculator.kali(angka1, angka2));
                case 4 -> System.out.println("Hasil pembagian: " + calculator.bagi(angka1, angka2));
                default -> System.out.println("Pilihan tidak valid.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

}
