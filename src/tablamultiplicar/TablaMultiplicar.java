/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;
import java.util.Scanner;
/**
 *
 * @author Marco Argueta
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        int contador = 0;
        int n;
        System.out.print("¿Que tabla desea hacer? ");
        n = leer.nextInt();
        while (contador < 10) {
            //System.out.println("Count es: " + count);
            contador++;
            System.out.println(n + " por " + contador + " igual " + (n*contador));
            //count++;
        }
    }
    
}