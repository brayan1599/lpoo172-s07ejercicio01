/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("INGRESE TEMPERATURA EN CELSIUS: ");
        double celsius = input.nextDouble();
        double fahrenheit=9.0/5*celsius+32;
        System.out.println(celsius +"celsius son" + fahrenheit+ "en fahrenheit");
           
    }
    
}
