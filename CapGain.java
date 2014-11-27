/** 
* This class is used to handle and record all transactions 
*/

public class CapGain{
	
        public double totCapGain;		//the current total captial gain or loss in dollars
        public Queue sharesHeld;		//a queue of the purchase prices of all shares currently held 
        
/** 
* This is the constructor method: sets the totCapGain to be zero
*and creates a new queue
*/	
	
        public CapGain(){
                totCapGain=0;
                sharesHeld = new Queue();		
        }

/** 
* This method prints out the main menu
*/
	
        public void mainMenuPrompt(){
		System.out.println(" "); 
		System.out.println("Menu--Please pick a number from the options below: ");
                System.out.println("1. Buy");
                System.out.println("2. Sell");
                System.out.println("3. Total Capital Gain So Far");
                System.out.println("4. Quit");
		System.out.println("----------------------------------");
        }
  
/** 
* This method adds a number of shares at a price to the queue
*@param
*			numShares
*@param
*			price
*/
	
        public void buy(int numShares, double price){
                for(int i=0;i<numShares;i++){				//add however many nodes that there are numShares. They all
												//will have the same price which was passed through as a param
                        sharesHeld.enqueue(price);
                }
		System.out.println(" ");
                System.out.println("successfully bought "+numShares+" shares at $"+price);		//let the user know this was successful
		System.out.println(" ");
        }
	
  
/** 
* This method removes a certain number of shares from the queue, calculating
* gain/loss for each share(based on the price it was purchased for and the price
* it is being sold for), and updating the totCapGain
*@param
*		numShares
*@param
*		price
*@return
*		totCapGain
*/
	
        public void sell(int numShares, double price){
                double singCapGain=0;
                if (numShares>sharesHeld.size){			//if the number of shares you hold is less than the number you are selling
											//let the user know they do not have enough to do that transaction
			System.out.println(" "); 
                        System.out.println("error:not enough shares held");
			System.out.println(" ");
                }
                else{
                        for(int i=0;i<numShares;i++){					//loop through the number of shares we have
                                totCapGain=totCapGain+price-sharesHeld.front();		//calculate the total Captial Gain 
                                singCapGain=singCapGain+price-sharesHeld.front();		//calculate the single gain from this one transaction
                                sharesHeld.dequeue();							//dequeue those shares
                        }
			System.out.println(" "); 
                        System.out.println("successfully sold "+numShares+" shares at $"+price);		//let the user know the transaction was completed
                        System.out.println("Capital gain from this transaction is $"+singCapGain);
			System.out.println(" ");
                }
        }
  
	
/** 
* @return 
*		totCapGain
*/
	
        public double getTotalCapGain(){
		System.out.println(" "); 
                System.out.println("Your total capital gain up to now is $"+totCapGain);
		System.out.println(" ");
                return totCapGain;
        }
	
	
	
	public static void main(String args[])
	{
		CapGain v = new CapGain(); 
		v.mainMenuPrompt();
		v.buy(100,20);
		v.buy(20,24);
		v.buy(200,36);
		v.sell(150,30);
		v.getTotalCapGain();
		
		
	}
	
}
