/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sacksfifth;
import java.util.Scanner; 
/**
 *
 * @author Anastasia Surogina ST10448021
 */
public class SacksFifth {

    public static void main(String[] args) {
        
        //variables 
        int donationType; 
        String volunteer; 
        final int CLOTHING_CODE = 1; 
        final int OTHER_CODE = 2; 
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER= "Marco"; 
        String message; 
        
        
        Scanner input = new Scanner (System.in); 
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE  + "for anything else.."); 
        donationType = input.nextInt(); 
       
        if (donationType == CLOTHING_CODE)
            volunteer = CLOTHING_PRICER;
        else 
            volunteer = OTHER_PRICER; 
            
        System.out.println("You've entered " + donationType); 
        System.out.println("the volunteer who will price this item is "+ volunteer);
    }
}
