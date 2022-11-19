// Lecture #21 - Object Oriented Programming 11/9/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 


// Lecture #23 - Object Oriented Programming 11/16/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


public class USTBikeShopPro
{
	public static void main(String[] args)
	{
		
		// We do all the global setting or initializations here
		// These setting can be constants for the entire program
		
		// This is intented to capture the size limit of the shop floor
		final int MAX_INVENTORY_SIZE = 500;
		
		// Max limit for bikes of a certain type
		final int MAX_INVENTORY_SIZE_PER_TYPE = 100;
		
		// This is a settings variable for descriptive messages
		boolean verboseMode = false;
		
		
		// Create the backbone data structure (something that holds the data for the 
		// bikes) such that it is easy to add, delete, modify, search and list the contents of.
		
		BasicBike[] basicBikeArray; // Declare 
		basicBikeArray = new BasicBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
		
		MountainBike[] mountainBikeArray; // Declare 
		mountainBikeArray = new MountainBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
		
		RoadBike[] roadBikeArray; // Declare 
		roadBikeArray = new RoadBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
		
		EBike[] eBikeArray; // Declare 
		eBikeArray = new EBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
		
		RoadEBike[] roadEBikeArray; // Declare 
		roadEBikeArray = new RoadEBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
		
		
		// Initialize the basic bike array
		for(int i = 0; i < MAX_INVENTORY_SIZE_PER_TYPE; i++)
		{
			basicBikeArray[i] = new BasicBike();
			
			mountainBikeArray[i] = new MountainBike(0, false, false, 0, 0, "", "");
			
			roadBikeArray[i] = new RoadBike(0, 0, "", "", false);
			
			eBikeArray[i] = new EBike(0, "", 0, 0, 0.0, 0, false, false, 0, 0, "", "");
			
			roadEBikeArray[i] = new RoadEBike(false, 0, 0, "", "", false);
		}
		
		
		// This is for the user interface (text based) 
		int count = 0;
		int choice;
		boolean exitnow = true;
		KeyboardReader myKBR = new KeyboardReader();
		// Use a do-while loop to remain in the program until user explicitly exits the program
		do
		{
			// Display user options
			System.out.println("I am here: run " + count);
			System.out.println(" display options: ");
			System.out.println("Enter action number: \n 1 - display Basic bike Stock\n 2 - display Mountain bike Stock");
			System.out.println(" 3 - display Road bike Stock\n 4 - display E bike Stock");
			System.out.println(" 5 - display Road E bike Stock");
		// changes: add bikes to inventory:
			System.out.println("\n6 - add a basic bike");
			System.out.println("7 - add a mountain bike");
			System.out.println("8 - add a road bike");
			System.out.println("9 - add a E-bike");
			System.out.println("10 - add a road E-bike");
			System.out.println("11 - exit");
			
			// Wait for user choice
			choice = myKBR.getKeyboardInt();
			
			// Call the methods here according to user choice
			switch (choice)
			{
				case (1): displayBasicBikeStock(MAX_INVENTORY_SIZE_PER_TYPE, basicBikeArray, verboseMode);
							break;
				case (2): displayMountainBikeStock(MAX_INVENTORY_SIZE_PER_TYPE, mountainBikeArray, verboseMode);
							break;
				case (3): displayRoadBikeStock(MAX_INVENTORY_SIZE_PER_TYPE, roadBikeArray, verboseMode);
							break;
				case (4): displayEBikeStock(MAX_INVENTORY_SIZE_PER_TYPE, eBikeArray, verboseMode);
							break;
				case (5): displayRoadEBikeStock(MAX_INVENTORY_SIZE_PER_TYPE, roadEBikeArray, verboseMode);
							break;
				case (6): exitnow = false;
							break;
				
				default: exitnow = false;
							break;
				
			}
			
			
			count++;
			
		} while ( exitnow );
	
		
			
	} // End PSVM
	

// methods that display bike info (will need graphics)-----------------------------------------------------------------------------
	// Note: I have to send the enitre copy of the array to this method: pass by value in Java
	public static void displayBasicBikeStock(int maxSize, BasicBike[] arr, boolean verbose )
	{
		// List contents of basic bike array
		for(int i = 0; i < maxSize; i++)
		{
			System.out.println("Basic Bike slot #"+i+": "+arr[i].getInfo());		
		}
		
	}
	
	
	public static void displayMountainBikeStock(int maxSize, MountainBike[] arr, boolean verbose )
	{
		// List contents of basic bike array
		for(int i = 0; i < maxSize; i++)
		{
			System.out.println("Mountain Bike slot #"+i+": "+arr[i].getInfo());		
		}
		
	}
	
	
	public static void displayRoadBikeStock(int maxSize, RoadBike[] arr, boolean verbose )
	{
		// List contents of basic bike array
		for(int i = 0; i < maxSize; i++)
		{
			System.out.println("Road Bike slot #"+i+": "+arr[i].getInfo());		
		}
		
	}
	
	
	public static void displayEBikeStock(int maxSize, EBike[] arr, boolean verbose )
	{
		// List contents of basic bike array
		for(int i = 0; i < maxSize; i++)
		{
			System.out.println("E Bike slot #"+i+": "+arr[i].getInfo());		
		}
		
	}
	
	
	public static void displayRoadEBikeStock(int maxSize, RoadEBike[] arr, boolean verbose )
	{
		// List contents of basic bike array
		for(int i = 0; i < maxSize; i++)
		{
			System.out.println("Road E Bike slot #"+i+": "+arr[i].getInfo());		
		}
		
	}
	// END OF methods that display bike info (will need graphics)-----------------------------------------------------------------------------


} // End public class USTBikeShopPro
