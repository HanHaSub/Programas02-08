/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombresyapellidos;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Programa03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, apellido; 
        Scanner entrada = new Scanner (System.in); 
        System.out.println("what's your name?: ");
        nombre=entrada.nextLine();
        System.out.println("and your last name?: ");
        apellido=entrada.nextLine();
        System.out.println("¡have a nice day!!: \n"+nombre + " " + apellido);
    }
    
}
