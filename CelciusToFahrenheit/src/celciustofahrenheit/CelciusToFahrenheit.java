/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celciustofahrenheit;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CelciusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temperature;
        double Fahrenheit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of temperature");
        temperature=sc.nextFloat();
        Fahrenheit=(temperature*9/50)+32;
        System.out.println("The value of fahrenheit is"+Fahrenheit);
    }
    
}
