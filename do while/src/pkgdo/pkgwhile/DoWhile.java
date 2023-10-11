/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgdo.pkgwhile;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s =new Scanner(System.in);
        System.out.print("Masukkan bilangan = ");
        int x, n = s.nextInt();
        while (n>=1){
            x=1;
            do{
                System.out.println(""+x);
                x+=2;
            }while(x<=n);
            n++;
            System.out.println("");
            break;
        }
    }
}
  
