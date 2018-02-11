/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class otraopcion {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int dias=teclado.nextInt();
        int contador = 0;
        int hs = 0;
        int ms = 0;
        int ss = 0;
        while (contador < dias){
            System.out.println("Tiempo Trabajado");
            int h=teclado.nextInt();
            int m=teclado.nextInt();
            int s=teclado.nextInt();
            ss = ss+s;
            if(ss>=60){
                ss = ss-60;
                ms = ms+1; 
            }
            ms = ms+m;
            if (ms>=60){
                ms = ms-60;
                hs = hs+1;
            }
            hs = hs+h;
            contador++;
        }
    }
}
