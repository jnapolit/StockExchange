/** 
* This class is used to create the methods of a Queue and
*it utalizes a singly linked list 
*/

public class Queue{
        
        public QNode front;	//declares a QNode front varaiable
        public QNode rear;		//declares a QNode rear variable
        public int size;		//declares an int size variable

/** 
* This is the constructor method: it sets the size to 0, 
*the front node to null as well as the rear	
*/
        public Queue(){
                size=0;
                front=null;
                rear=null;
        }

/** 
* This method displays all the items in the list
*/	
	public void display(){		
		QNode cur = front;
		while (cur !=null)		//loop throught the list
		{
			System.out.println(cur.entry);	//print out the current item
			cur = cur.next; 		//go to the next one
		}
	}

/** 
* This method enqueues a stock to the queue
*@param
*			price
*/	
        
        public void enqueue(double price){		
                QNode n = new QNode (price,null);	//create a new QNode
		if (front==null)				//if their is nothing in the list
		{
			front = n;		//both front and rear are now equal to this new QNode
			rear = n;
		}
                
		else
		{
			rear.next=n;		//otherwise put this new QNode after the currently existing rear
			rear=n;		//and set this new QNode to be the rear
		}
		
                size++;		//increase the size
        }
	
/** 
* This method dequeues a stock to the queue
*@return
*		the thing you dequeued
*/	
                
        public double dequeue(){		
                double temp;
		if (front==null)		//if the list is empty
		{
			return -999999; 			//return a very large negative number
		}	
		else
		{
			temp=front.entry;	//otherwise save out the front entry to a varaiable called temp
			front = front.next; 	//set the next node in the list to be front
			size --; 		//decrease the size
			if (size ==0)		//if the size is now zero
			{
				rear = null; 		//set the rear to be null
			}
			return temp;		//return what you dequeued
		}
	}


/** 
* @return 
*		front's entry
*@return
*		or if the list is empty it returns a very large negative number
*/	
	
	public double front() {		//had to add this method so that had access to front in the CapGain class
		if (front != null){		
			return front.entry;	
		}
		else
		{
			return -999999;
		}
	}
		
	
	public static void main(String args[]){
		Queue v = new Queue (); 
		v.enqueue(2); 
		double returned = v.dequeue();
		v.display(); 
		System.out.println(returned);
		v.enqueue(3);
		double frontvalue = v.front();
		System.out.println(frontvalue);
		
	}
}
