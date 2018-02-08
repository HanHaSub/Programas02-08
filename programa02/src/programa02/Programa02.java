/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa02;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Programa02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad=0;
               Scanner Scanner=new Scanner(System.in);
               System.out.println("Dame tu edad");
		edad=Scanner.nextInt();
		if (edad>=20){
		    System.out.println("Mayor de Edad");
		}
		else{
		     System.out.println("Eres Menor de Edad");
		}
    }
    
}
