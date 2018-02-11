/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package another;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class anothernote {
    
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Hora de Entrada");
        int horae=teclado.nextInt();
        int mine=teclado.nextInt();
        int horase=teclado.nextInt();
        int sege=teclado.nextInt();
        int horas=teclado.nextInt();
        int mins=teclado.nextInt();
        int segs=teclado.nextInt();
        if(sege>segs){
            segs+=60;
            mins--;
        }
        int seg=segs-sege;
        if(mine>mins){
            mins+=60;
            horas--;
        }
        int min=mins-mine;
        int hora=horas-horase;
        System.out.println("El timepo transcurrido es:"+min +" "+horas + " "+seg +" ");
                
    }
}
