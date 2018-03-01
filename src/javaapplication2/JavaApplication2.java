/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner calc = new Scanner (System.in);
        System.out.println("How many chocolate cookies?");
        double chocolateCookies=calc.nextDouble();
        
        
        double vanillaCookies = 10;
        System.out.println(chocolateCookies+"+"+vanillaCookies+"=");
        double totalCookies = chocolateCookies + vanillaCookies;
        System.out.println("Total Cookies = "+totalCookies);
        
        //single price
        double chocolatePrice= 1.5;
        double vanillaPrice= 1.2;
        
        //total price for each category  
        double TotPrice1= chocolateCookies * chocolatePrice;
        System.out.println(TotPrice1);
        double TotPrice2= vanillaCookies * vanillaPrice;
        System.out.println(TotPrice2);
        
        //bill
        double bill= TotPrice1 + TotPrice2;
        System.out.println("The Bill is"+" "+ bill);
        
         
        double averagePrice= bill/totalCookies;
        System.out.println("The avarage Price is"+" "+ averagePrice);
        System.out.println("The avarage Price is"+" "+String.format ("%.2f", averagePrice ));
    
        
        if (averagePrice > 3) 
            System.out.println("High Price");
        else if (averagePrice>=1)
            System.out.println("Good Price");
        else 
            System.out.println("Low Price");
        
        boolean cookiesAreGood=true;
        if (cookiesAreGood) {
            String You= "You";
            String like= "like";
            String cookies= "cookies";
            String[] stringBox= new String[3];
            stringBox[0]=You;
            stringBox[1]=like;
            stringBox[2]=cookies;
            System.out.println(stringBox[0]+" "+stringBox[1]+" "+stringBox[2]);
        }else {
            System.out.println("You don't like cookies");
        }
        
    }
    
}
