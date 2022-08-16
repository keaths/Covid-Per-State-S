/**
 * This class is responsible for handling the final implemented State Stack.
 * This class successfully pushes, pops, peeks and checks whether the stack
 * is full or empty. Final stack stays true to priority queue's remove method
 * as well.
 * 
 * @author Keath Sawdo
 * @version 2/18/21
 */
public class Stack
{
	public int maxSize;													
	public State[] stackArray;
	public int top;
	
	public Stack(int s)
	{
		maxSize = s;											//declaring Stack constructor
		stackArray = new State[maxSize];
		top = -1;												//signifies that the stack is empty,
	}
	/**
	 * 	adds state to top of stack									
	 * @param s
	 */
	public void push(State s)
	{
		if(isFull())															//pushes states into stack, but not before checking whether
		{																		//or not the stack exceeds the maxSize-1;
			System.out.println("Full stack. Item "+s+" is not pushed.");
		}
		else
		{
			stackArray[++top] = s;												//adds object to top(technically bottom) of stack.
		}
	}
	/**
	 * removes state from top of stack
	 * @return
	 */
	public State pop()
	{																	//removes object from stack, but not before checking whether
		if(isEmpty())													//or not the stack is empty.
		{
			System.out.println("Empty stack. Item \"-1\" is return.");
			return null;
		}
		else
		{
		return stackArray[top--];												//takes object from top(technically bottom) of stack
		}
	/**
	 * views state at top of stack, without removing like pop
	 */
	}
	public State peek()															//returns the top object in the stack
	{
		return stackArray[top];
	}
	/**
	 * checks if the stack is empty
	 * @return
	 */
	public boolean isEmpty()													//checks whether or not the stack is empty
	{
		return (top == -1);
	}	
	/**
	 * checks if the stack is full
	 * @return
	 */
	public boolean isFull()														//checks whether or not stack is full
	{
		return (top == maxSize-1);
	}
	/**
	 * prints the full stack from the top down
	 */
	public void printStack()
	{
		int i;
		for(i = top; i >= 0; i--)												//prints stack from the top down
		{
			System.out.print(stackArray[i]);
		}
	}
}
