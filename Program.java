package src.main.java;
//import stuff here
import java.lang.Math.*;
import java.util.Scanner;
//Your code here

public class Program7{
    //Define your final variables here
    // **HINT: Maybe the conversion rates?????**
    double stanleynickels = 0;
    double schrutebuck = 0;
    double klevins = (schrutebuck*2.5);
    double oSb = ((stanleynickels*1000))/(240*schrutebuck);
    
    
    
    
    


  
    
    
    
    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        //implement a function that converts from the old format to the new format
        
        
        
    }
    
    
}

DRIVER:
package src.main.java;
import java.util.Scanner;


/**
 * Write a description of class Program7DRIVER here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program7DRIVER
{
  public static void main(String[] args){
      Scanner myScanner=new Scanner (System.in);  
      System.out.println ("Enter schrute-bucks: ");
      
      int schrutebuck = myScanner.nextInt();
      
      
      Program7 myProg = new Program7();
      
      myProg.schrutebuck = schrutebuck;
    
        
        
    }
}


