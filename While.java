/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s =new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        int n = s.nextInt();
        int x = 1;
        while(x<=n){
            System.out.println(""+x);
            x+=2;
        }
    }
}
