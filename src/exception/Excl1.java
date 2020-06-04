/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Asus
 */
import java.io.IOException;
public class Excl1 {
    public static void main (String [] args) {
        int n = 0;
        try {
            n = System.in.read();
        } catch (IOException e){
            System.out.println("Kesalahan membaca dari pengguna");
        }
        System.out.println("Hasil : " + (char) n);
    }
}
