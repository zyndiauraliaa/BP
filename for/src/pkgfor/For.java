/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s =new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        int x = s.nextInt();
        for (int i=1; i<= x; i++) {
            if(i%2==1) 
            System.out.println(""+i);
        }
    }
}

