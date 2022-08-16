/**
 * This class is responsible for handling the 4 priority queues created in main.
 * This class successfully inserts states (using an O(1) method), as well as removes
 * them (using the O(N) method), checks to see if the queue is empty or full, and 
 * provides a print method for the queue's contents.
 *
 * @author Keath Sawdo
 * @version 2/19/21
 */
public class PriorityQueue 
{
	public int maxSize;
	public State[] queArray;
	public int nItems;
	
	public PriorityQueue(int s)
	{
		maxSize = s;														//declaring priorityQueue constructor
		queArray = new State[maxSize];
		nItems = 0;
	}
	/**
	 * inserts state at top of queue
	 * @param s
	 * @return
	 */
	public State insert(State s)											//inserts states at back of the queue using
	{																		//O(1) method.
		return queArray[nItems++] = s;
	}
	/**
	 * removes state with high priority on lower values
	 * @return
	 */
	public State remove()													//removes states from queue using O(2) method.
	{
		int i;
		if(nItems == 1)
		{
			nItems = 0;
			return queArray[0];
		}
		
		for(i = nItems-1; i > 0; i--)													//loops through queue from back of queue
		{
			if(queArray[i-1].getDeathRate() < queArray[nItems-1].getDeathRate())		//if the second to last value is less than the
			{																			//last value...
				State temp = queArray[i-1];
				queArray[i-1] = queArray[nItems-1];										//a copy of the second to last value is made,
				queArray[nItems-1] = temp;												//second to last value equals the last value,
			}																			//last value equals the copy of the second to last value.
			else
			{																			//essentially pushes lowest value to back
																					
			}																			//if no more sorts, continue.
			
		}
		return queArray[--nItems];														//returns last value in queue
	}
	/**
	 * checks whether queue is empty
	 * @return
	 */
	public boolean isEmpty()
	{
		
		return (nItems == 0);															//notifies user the stack is empty
	}
	/**
	 * prints queue elements
	 */
	public void PrintQueue()
	{
		int i;																			//prints all states in priorityQueue
		for(i = 0; i <= nItems-1; i++)
		{
			System.out.print(queArray[i] + "\t\t " + i);
		}
	}
	
}
