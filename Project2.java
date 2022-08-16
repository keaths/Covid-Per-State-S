import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * This class is responsible for reading and parsing the user's csv file, "States2.csv",
 * creating new State objects with values seperated by our delimiter, assigning 
 * each object to certain priority queues based on their Death Rate, and finally removing
 * each of those State objects from the priority queues and pushing them into a newly declared 
 * stack of State objects. 
 * 
 * @author Keath Sawdo
 * @version <2/18/21>
 */

public class Project2 
{

	public static void main(String[] args) 
	{
		System.out.println("COP3530 Project 2");
		System.out.println("Instructor: Xudong Liu\n");
		
		System.out.println("Stacks and Priority Queues");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the file name: ");
		String fileName = scan.next();
		System.out.println(fileName);
		String header = (String.format("%-15s", "Name")) + (String.format("%-15s", "MHI")) + (String.format("%-15s", "VCR")) + 
				(String.format("%-15s", "CFR")) + (String.format("%-17s", "Case Rate")) + (String.format("%-15s", "Death Rate"))		//header to seperate each priority queue / stack
				+ ("\n-------------------------------------------------------------------------------------");
		Scanner inFile = null;
		try
		{
			inFile = new Scanner(new File(fileName));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nCould not open file!");
			System.exit(1);
		}
		
		PriorityQueue Vgood = new PriorityQueue(50); 					//declaring the 4 priority queues
		PriorityQueue Good = new PriorityQueue(50); 
		PriorityQueue Fair = new PriorityQueue(50); 
		PriorityQueue Poor = new PriorityQueue(50); 
		
		
		inFile.useDelimiter(",|\n");
		inFile.nextLine();
		Stack stateStack = new Stack(50);								//declaring the final state Stack
		
		while(inFile.hasNext())
		{
			String name = inFile.next();
			String capital = inFile.next();
			String region = inFile.next();
			int USHouse = inFile.nextInt();
			int population = inFile.nextInt();											
			int cases = inFile.nextInt();
			Double caseRate = (double) cases/population * 100000;		//unprovided attributes are directly calculated based off of related attribute values, no methods.
			int deaths = inFile.nextInt();
			Double deathRate = (double) deaths/population * 100000;
			Double caseFatalityRate = (double) deaths/cases;
			int medianHouseholdIncome = inFile.nextInt();
			double crimeRate = Double.parseDouble(inFile.next());
			
			State s = new State(name, capital, region, USHouse, population, cases, deaths, medianHouseholdIncome,		//creating the new state object.
					crimeRate, caseFatalityRate, caseRate, deathRate);
			
			
			
			if (s.getDeathRate() < 50)
			{
				Vgood.insert(s);
			}
			if (s.getDeathRate() > 50 && s.getDeathRate() < 100)			//inserting the state objects into their corresponding priority
			{																//queue's, depending on their Death Rate value
				Good.insert(s);
			}
			if (s.getDeathRate() > 100 && s.getDeathRate() < 150)
			{
				Fair.insert(s);
			}
			if (s.getDeathRate() > 150)
			{
				Poor.insert(s);
			}
		}
		
		System.out.println("\n\n\nPOOR Priority Queue Contents:\n\n");		//printing each of the queue's using the print method
		System.out.println(header);											//inserting the header for ease of reading
		Poor.PrintQueue();
		System.out.println("\n\n\nFAIR Priority Queue Contents:\n\n");
		System.out.println(header);
		Fair.PrintQueue();
		System.out.println("\n\n\nGOOD Priority Queue Contents:\n\n");
		System.out.println(header);
		Good.PrintQueue();
		System.out.println("\n\n\nVGOOD Priority Queue Contents:\n\n");
		System.out.println(header);
		Vgood.PrintQueue();
		
		
		while ( !Poor.isEmpty())											//removes the values from each priority queue, as long as they
		{																	//are not empty
			State value = Poor.remove();
			stateStack.push(value);											//pushing the removed value into the final state Stack
		}
		
		while ( !Fair.isEmpty())
		{
			State value = Fair.remove();
			stateStack.push(value);
		}
		
		while( !Good.isEmpty())
		{
			State value = Good.remove();
			stateStack.push(value);
		}
		
		while( !Vgood.isEmpty())
		{
			State value = Vgood.remove();
			stateStack.push(value);
		}
		
		System.out.println("\n\n\nStack Contents: \n\n");
		System.out.println(header);
												//poping the state values from the stack...
		stateStack.printStack();
			
													//...and displaying them to main.
		
		
		
		scan.close();
	}
}