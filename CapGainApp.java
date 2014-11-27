/** 
* This class will drive the whole program
*/

import java.io.*;
import java.util.Scanner;	//allows us to scan for the users answer in the terminal 

public class CapGainApp{
	public static void main(String args[])
	{
		CapGain cg=new CapGain();		//creates a new CapGain called cd
		Scanner s = new Scanner(System.in);	//creates a new scanner called s
		int choice=1;					//sets the choice to first be 1
		
		while(choice>0 && choice<4){	//while the choice is between 1 and 3 inclusive
			cg.mainMenuPrompt();		//print the menu
			choice=s.nextInt();			//get the users choice
			
			if(choice==1){				//if they choose buy
				System.out.println("How many shares would you like to buy?");	//find out the number and price 
				int num=s.nextInt();
				System.out.println("At what price?");
				double price=s.nextDouble();
				cg.buy(num,price);					//then pass these through the buy method
				
			}else if(choice==2){		//if they choose to sell
				System.out.println("How many shares would you like to sell?");	//find out the number and price
				int num=s.nextInt();
				System.out.println("At what price?");
				double price=s.nextDouble();
				cg.sell(num,price);		//then pass these through the sell method
				
			}else if(choice==3){		//if the choose to view the Total Captial Gain
				cg.getTotalCapGain();		//run that method
			}		
		}
	}
}
