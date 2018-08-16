/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet_11;
import java.util.Locale;
public class Operasi_String01 {
    public static void main(String[] args) {
    String identitas = "Rafi Raihan Firdaus / X RPL 2 / 26";
    System.out.println("Identitas : " + identitas);
    String x = "operasi";
        System.out.println("isi variable x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variable y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
    }
}
