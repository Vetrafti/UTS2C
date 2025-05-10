/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class lingkaran {
    // Konstanta
    private static final double PI = 3.141592;
    // Method untuk menghitung luas lingkaran
    public void hitungLuas(double r) {
        double luas = PI * r * r;
        System.out.printf("Luas Lingkaran (pecahan): %.6f%n", luas);
        System.out.printf("Luas Lingkaran (bulat): %d%n", (int) luas);
        System.out.printf("Luas Lingkaran (pembulatan): %d%n", (int) Math.round(luas));
    }
}
