/********
 Author:Anye'a Pinnock
 Program: Money class - program assignment #1
 Due Date:02/03/2020
 Purpose:
 ********/

import java.util.*;
import java.text.*;

public class Money
{
    // declare class variables
    private double total; 
    private double transaction;
    private int hundreds, tens, fives, ones, quarters, nickles, dimes, nickels, cents; 
    private int remainingCents;
     // used to store the Money value as a double precision floating point number like 34.2
    // you will need more variables declared here to handle each of the currency types; for example int hundreds to keep track of how many hundred dollar bills 
    
    // this one will help you print floating point values in US currency format like $10.50
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    
    // convert current currency values to a string
    public String toString()
    {
      return hundreds+" hundreds "+tens+" tens "+fives+" fives "+ones+" ones"+quarters+" quarters "+dimes+
      " dimes"+nickels+" nickles "+cents+" cents "+" pennies ";
    }

    // converts amount to US currency format
    public String toCurrency(double amount)
    {
      return nf.format(Math.round(amount * 100.0) / 100.0);
    }
    
    // convert currency to float
    // read currency values from Scanner s and compute value
    // output results
    public void processChange(Scanner s)
    {
    
      hundreds = s.nextInt();
      tens=s.nextInt();
      fives=s.nextInt();
      ones=s.nextInt();
      quarters=s.nextInt();
      dimes=s.nextInt();
      nickels=s.nextInt();
      cents=s.nextInt();
      total= ( hundreds*100 + tens*10 + ones*1 + quarters*.25 + dimes*.10 + nickels*.05 + cents*.01);
      System.out.println("$" + total);
      
    }

    // read from Scanner s and process float command
    // convert float to change
    // output results
    public void processFloat(Scanner s)
    {
      total= s.nextDouble();
      hundreds= intialTotal;
      initialTotal= total;
      hundreds = (int)total/100;
      tens= (int)total/10;
      total= total-tens*10;
      fives= (int)total/5;
      total= total- fives * 5;
      ones= (int)total/1;
      total=total*100;
      quarters= (int)(total/25);
      total= total-quarters*25;
      total= total - dimes*10;
      nickels = (int)(total/5);
      total = total - nickels*5;
      cents = (int)(total/1);
      int change = (int)Math.round((total - initialTotal) * 100);
      System.out.println(toCurrency(intialTotal) + " = " + hundreds + " hundreds" + tens + " tens " + fives + " fives " + ones + " ones " + quarter + " quarters " + dimes + " dimes" + nickels + " nickels " + cents + " cents ");
    
    
    }

    // read from Scanner s and process check command
    // convert float to dollar words & cents
    // output results
    public void processCheck(Scanner s)
    { 
      total = s.nextDouble();
//       hundreds= (int)total/100;
//       total= total- hundreds*100;
//       tens= (int)total/10;
//       total= total-tens*10;
//       fives= (int)total/5;
//       total= total-fives*5;
//       ones= (int)total/1;
//       total= total-ones*1;
//       total=total*100;
//       quarters= (int)total/25;
//       total= total-quarters*25;
//       total= total*100;
//       dimes= (int)total/10;
//       int dollars= hundreds* 100+ tens * 10 + fives* 5+ ones* 1;
//       int change= quarters * 25 + dimes *10 + nickels * 10 + cents * 01;   

         int dollars = (int)total;
         int change  = (int)Math.round((total - dollars)*100);
      
      System.out.println( dollars + " dollars and  " + change + " cents");
        

    }

    // read from Scanner s and process change-float command
    // read float of customer payment
    // read float of transaction cost
    // calculate difference and compute change values
    // output the results
    public void processChangeFloat(Scanner s)
    {
      System.out.println("how many hundreds");
      hundreds = s.nextInt();
      System.out.println("how many tens");
      tens=s.nextInt();
      System.out.println("how many fives");
      fives=s.nextInt();
      System.out.println("how many ones");
      ones=s.nextInt();
      System.out.println("how many quarters");
      quarters=s.nextInt();
      System.out.println("how many dimes");
      dimes=s.nextInt();
      System.out.println("how many nickels");
      nickels=s.nextInt();
      System.out.println("how many cents");
      cents=s.nextInt();
      total= ( hundreds*100 + tens*10 + ones*1 + quarters*.25 + dimes*.10 + nickels*.05 + cents*.01);
      System.out.println(total);

    }

    // read from Scanner s and process change-change command
    // read change of customer payment
    // read float of transaction cost
    // calculate difference and compute change values
    // output the results
    public void processChangeChange(Scanner s)
    {
    
      System.out.println("how many hundreds");
      hundreds = s.nextInt();
      System.out.println("how many tens");
      tens= s.nextInt();
      System.out.println("how many fives");
      fives=s.nextInt();
      System.out.println("how many ones");
      ones= s.nextInt();
      System.out.println("how many quarters");
      quarters = s.nextInt();
      System.out.println("how many dimes");
      dimes = s.nextInt();
      System.out.println("how many nickels");
      nickels = s.nextInt();
      System.out.println("how many cents");
      cents = s.nextInt();
      float dollars = s.nextFloat();
      float total = (float)( hundreds*100 + tens*10 + fives*5 + ones*1 + quarters*.25 + dimes*.10 + nickels*.05 + cents*.01);
      float original = total;
      total-= dollars;
      float total2 = total;
      hundreds = (int)total/100;
      total= total - hundreds * 100; 
      tens = (int)total/10;
      total = total - tens*10;
      fives = (int)total/5;
      total = total - fives * 5;
      ones = (int)total/1;
            
      // total = total * 100
      quarters = (int)(total/25);
      total= total - quarters*25;
      dimes = (int)(total/10);
      total = total - dimes*10;
      nickels = (int)(total/5);
      total = total - nickels*5;
      cents = (int)(total/1);
      total = total - cents*1;
      System.out.println(" change back on $ " + original + " for purchase of " + dollars + " is " + total2 + " which is " + hundreds + " hundreds " + tens + " tens " + fives + " fives " + ones + " ones " + quarters + " quarters " + dimes + " dimes " + nickels + " nickels " + cents + " cents ");
    }
}
