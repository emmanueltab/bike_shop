// Lecture #21 - Object Oriented Programming 11/9/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 


// Lecture #23 - Object Oriented Programming 11/16/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 

import java.util.*;



public class USTBikeShopPro
{
	public static KeyboardReader myKBR = new KeyboardReader();
	public static final int MAX_INVENTORY_SIZE = 500;
		
	// Max limit for bikes of a certain type
	public static final int MAX_INVENTORY_SIZE_PER_TYPE = 100;
	
	// This is a settings variable for descriptive messages
	public static boolean verboseMode = false;

	public static ArrayList <BasicBike> basicBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);
	//public static BasicBike[] basicBikeArray = new BasicBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
	
	public static ArrayList <MountainBike> mountainBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);
	//public static MountainBike[] mountainBikeArray = new MountainBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
	public static ArrayList<RoadBike> roadBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);
	//public static RoadBike[] roadBikeArray = new RoadBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
	public static ArrayList<EBike> eBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);

	//public static EBike[] eBikeArray = new EBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
	public static ArrayList<RoadEBike> roadEBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);


	public static void main(String[] args)
	{

		/* 
		for(int i = 0; i < MAX_INVENTORY_SIZE_PER_TYPE; i++)
		{
			basicBikeArray[i] = new BasicBike();
			
			mountainBikeArray[i] = new MountainBike(0, false, false, 0, 0, "", "");
			
			roadBikeArray[i] = new RoadBike(0, 0, "", "", false);
			
			eBikeArray[i] = new EBike(0, "", 0, 0, 0.0, 0, false, false, 0, 0, "", "");
			
			roadEBikeArray[i] = new RoadEBike(false, 0, 0, "", "", false);
		}
		*/
		
		// This is for the user interface (text based) 
		int count = 0;
		String choice;
		boolean exitnow = false;
		// Use a do-while loop to remain in the program until user explicitly exits the program
		while(exitnow != true)
		{
			// Display user options
			System.out.println("number of runs: " + count);
			System.out.println("display options: ");
			System.out.println(" 1 - display Basic bike Stock\n 2 - display Mountain bike Stock");
			System.out.println(" 3 - display Road bike Stock\n 4 - display E bike Stock");
			System.out.println(" 5 - display Road E bike Stock");
		// changes: add bikes to inventory:
			System.out.println("\n 6 - add a basic bike");
			System.out.println(" 7 - add a mountain bike");
			System.out.println(" 8 - add a road bike");
			System.out.println(" 9 - add a E-bike");
			System.out.println(" 10 - add a road E-bike");
			System.out.println(" 11 - exit");
			
			// Wait for user choice
			choice = myKBR.getKeyboardInput();
			
			// Call the methods here according to user choice
			switch (choice)
			{
				case ("1"): displayBasicBikeStock(MAX_INVENTORY_SIZE_PER_TYPE, basicBikeArray, verboseMode);
							break;
				case ("2"): displayMountainBikeStock(MAX_INVENTORY_SIZE_PER_TYPE, mountainBikeArray, verboseMode);
							break;
				case ("3"): displayRoadBikeStock(MAX_INVENTORY_SIZE_PER_TYPE, roadBikeArray, verboseMode);
							break;
				case ("4"): displayEBikeStock(MAX_INVENTORY_SIZE_PER_TYPE, eBikeArray, verboseMode);
							break;
				case ("5"): displayRoadEBikeStock(MAX_INVENTORY_SIZE_PER_TYPE, roadEBikeArray, verboseMode);
							break;
				case("6"):addBasicBike();
							break;
				case ("11"): exitnow = true;
							break;
				
				default: exitnow = true;
							break;
				
			}
			
			
			count++;
			
		} 
	
		
			
	} // End PSVM
	
// methods that will add, remove, and modify bikes(will need graphics)-------------------------------------------------------------

	public static void addBasicBike()
	{
		int speed;
		int gears;
		String color;
		String safeFeatures;
		System.out.println("enter the specs for this basic bike: ");
		while(true)
		{
				try {
					System.out.println("max speed: ");
					speed = myKBR.getKeyboardInt();
	
					System.out.println("number of gears: ");
					gears = myKBR.getKeyboardInt();
					
				} catch (Exception e) {
					System.out.println("only integers.");
					continue;
				}
				System.out.println("color: ");
				color = myKBR.getKeyboardInput();

				System.out.println("safety features: ");
				safeFeatures = myKBR.getKeyboardInput();
				break;
		}
		BasicBike e = new BasicBike(speed, gears, color, safeFeatures); 
		basicBikeArray.add(e);
		System.out.println("bike was added to the inventory!");


	}
	




// methods that display bike info (will need graphics)-----------------------------------------------------------------------------
	// Note: I have to send the enitre copy of the array to this method: pass by value in Java


	public static void displayBasicBikeStock(int maxSize, ArrayList<BasicBike> arr, boolean verbose )
	{
		int i = 0;

		// List contents of basic bike array
		for(BasicBike bike: arr)
		{

			System.out.println("Basic Bike slot #"+i+": "+bike.getInfo());
			i ++;
		}

		
	}
	
	
	public static void displayMountainBikeStock(int maxSize, ArrayList<MountainBike> arr, boolean verbose )
	{
		// List contents of basic bike array

		for(int i = 0; i < maxSize; i++)
		{
			if(arr.get(i) == null){
				break;
			}
			System.out.println("Mountain Bike slot #"+i+": "+arr.get(i).getInfo());		
		}
		
	}
	
	
	public static void displayRoadBikeStock(int maxSize, ArrayList<RoadBike> arr, boolean verbose )
	{
		// List contents of basic bike array
		for(int i = 0; i < maxSize; i++)
		{
			if(arr.get(i) == null){
				break;
			}
			System.out.println("Road Bike slot #"+i+": "+arr.get(i).getInfo());		
		}
		
	}
	
	
	public static void displayEBikeStock(int maxSize, ArrayList<EBike>arr, boolean verbose )
	{
		// List contents of basic bike array
		for(int i = 0; i < maxSize; i++)
		{
			if(arr.get(i) == null){
				break;
			}
			System.out.println("E Bike slot #"+i+": "+arr.get(i).getInfo());		
		}
		
	}
	
	
	public static void displayRoadEBikeStock(int maxSize, ArrayList<RoadEBike> arr, boolean verbose )
	{
		// List contents of basic bike array
		for(int i = 0; i < maxSize; i++)
		{
			if(arr.get(i) == null){
				break;
			}
			System.out.println("Road E Bike slot #"+i+": "+arr.get(i).getInfo());		
		}
		
	}
	// END OF methods that display bike info (will need graphics)-----------------------------------------------------------------------------


} // End public class USTBikeShopPro
