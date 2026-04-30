
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pomuch12
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        for (int n=1; n<=30; n++) {
        System.out.print("Teclee el año actual:");
        int año_act = scanner.nextInt ();
        
        System.out.print ("Teclee el año de nacimiento:");
        int año_nac = scanner.nextInt();
        
        int edad = año_act - año_nac;
                
        System.out.println ("Su edad es:" + edad);
                
    }
        scanner.close ();
    }
    
}
