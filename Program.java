package src.main.java;
//import stuff here
import java.lang.Math.*;
import java.util.Scanner;
//Your code here

public class Program7{
    
        //Define your final variables here
        // **HINT: Maybe the conversion rates?????**
        Scanner myScanner = new Scanner(System.in);

    
            public  double convertMoney(double schruteBucks, double stanleyNickels, double klevins){
            //implement a function that converts from the old format to the new format
            final int klevinsInSchrutebuck = 20; //conversion rates
            final int stanleynickelsInKlevin = 12;
            final int stanleynickelsInSchrutebuck = 240;

      
            System.out.println ("Enter old schrute-bucks: ");

            double schrutebucks = myScanner.nextInt();

            System.out.println ("Enter stanley-nickels: ");

            double stanleynickels = myScanner.nextInt();

            System.out.println ("Enter klevins: ");

            double Klevins = myScanner.nextInt();

            //convert money
            double stanleyNickelTotal = Klevins * stanleynickelsInKlevin + stanleynickels;
            double actualSchrutebucks = schrutebucks + (double) stanleyNickelTotal/stanleynickelsInSchrutebuck;
            double finalSchrutebucks = Math.ceil(actualSchrutebucks*100)/100;//round up to nearest hundreths place
            
            
            System.out.print("Decimal Schrute-bucks: " + finalSchrutebucks);
            return finalSchrutebucks;
        }
    }
