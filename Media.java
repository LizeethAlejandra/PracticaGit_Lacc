
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pomuch12
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double sum = 0;
        double baja = 9999;
        for (int c=1; c<=40; c++) {
            System.out.print ("Ingrese la calificación del alumno: ");
            int calif = scanner.nextInt();
            sum = sum + calif;
            
            if (calif<baja){
                baja = calif;
                
            }
        }
        double media = sum/40;
        
        System.out.println ("La calificación media es: " + media);
        System.out.println ("La calificación mas baja es: " + baja);
        
        scanner.close ();
                
    }
    
}
