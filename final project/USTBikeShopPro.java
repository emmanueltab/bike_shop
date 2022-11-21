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
	static KeyboardReader myKBR = new KeyboardReader();
	static final int MAX_INVENTORY_SIZE = 500;
		
	// Max limit for bikes of a certain type
	static final int MAX_INVENTORY_SIZE_PER_TYPE = 100;
	
	// This is a settings variable for descriptive messages
	static boolean verboseMode = false;

	static ArrayList <BasicBike> basicBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);
	//public static BasicBike[] basicBikeArray = new BasicBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
	
	static ArrayList <MountainBike> mountainBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);
	//public static MountainBike[] mountainBikeArray = new MountainBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
	static ArrayList<RoadBike> roadBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);
	//public static RoadBike[] roadBikeArray = new RoadBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
	static ArrayList<EBike> eBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);

	//public static EBike[] eBikeArray = new EBike[MAX_INVENTORY_SIZE_PER_TYPE]; // Creating
	static ArrayList<RoadEBike> roadEBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);


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
		int count = 0; String choice; boolean exitnow = false;
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
				case ("1"): displayBikes("basic");
							break;
				case ("2"): displayBikes("mountain");
							break;
				case ("3"): displayBikes("road");
							break;
				case ("4"): displayBikes("ebike");
							break;
				case ("5"): displayBikes("roadEbike");
							break;
				case("6"):bikeAdder("basic");
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

	public static void bikeAdder(String type)
	{
	// specs for basic bike. will apply for all the other bikes:------------------------------------------------------------------
		int speed; int gears; String color; String safeFeatures;

		System.out.println("enter the basic specs for your bike: ");
		while(true)
		{
				try 
				{ // for specs that are ints
					System.out.println("max speed: "); speed = myKBR.getKeyboardInt(); 
	
					System.out.println("number of gears: "); gears = myKBR.getKeyboardInt();
					
				} catch (Exception e) {
					System.out.println("only integers.");
					continue;
				}

				System.out.println("color: "); color = myKBR.getKeyboardInput();			

				System.out.println("safety features: "); safeFeatures = myKBR.getKeyboardInput();
				break;
		}
		// END OF specs for basic bike. will apply for all the other bikes:-------------------------------------------------------


		if(type == "basic")
		{
			BasicBike e = new BasicBike(speed, gears, color, safeFeatures); 
			basicBikeArray.add(e);

		}

		else if(type == "mountain" || type == "ebike")
		{
			while(true)
			{
				int seatheight; boolean fullSuspension; boolean flatprooftyres;
				try 
				{
					System.out.println("enter seat height as integer: "); seatheight = myKBR.getKeyboardInt();

					System.out.println("enter true or false for full suspension: "); fullSuspension = Boolean.parseBoolean(myKBR.getKeyboardInput());

					System.out.println("enter true or false for flatprooftyres: "); flatprooftyres = Boolean.parseBoolean(myKBR.getKeyboardInput());
		
				} catch (Exception e) 
				{
					System.out.println("enter proper data types");
					continue;
				}
				if(type == "mountain")
				{
					MountainBike m = new MountainBike(speed, fullSuspension, flatprooftyres, gears, seatheight, color, safeFeatures);
					mountainBikeArray.add(m);
					break;
				}


				if(type == "ebike" || type == "roadEbike")
				{
					String battertype;
					int rangemiles;
					int battersize;
					int voltage;
					double motorpower;
					System.out.println("enter battery type: "); battertype = myKBR.getKeyboardInput();


					while(true)
					{
						try 
						{
							System.out.println("enter range miles as int: "); rangemiles = myKBR.getKeyboardInt();
		
							System.out.println("enter battery size as int: "); battersize = myKBR.getKeyboardInt();
		
							System.out.println("enter battery voltage as int: "); voltage = myKBR.getKeyboardInt();
		
							System.out.println("enter motor power as double: ");	motorpower = myKBR.getKeyboardDouble();
	
		
						} catch (Exception e) 
						{
							System.out.println("enter proper data type.");
							continue;
						}
						if(type == "roadEbike"){
							System.out.println("enter true or false for flathandle bar: "); boolean flathandlebar = Boolean.parseBoolean(myKBR.getKeyboardInput());
							RoadEBike reb = new RoadEBike(flathandlebar, battersize, voltage, color, battertype, flathandlebar);
							roadEBikeArray.add(reb);
							break;

						}
						if(type == "ebike"){

						}
						break;
					}
				}
				break;
	
			}
		}
		else if(type == "road")
		{
			while(true)
			{
				try 
				{
					System.out.println("enter true or false for flathandle bar: "); boolean flathandlebar = Boolean.parseBoolean(myKBR.getKeyboardInput());
					break;

				} catch (Exception e) 
				{
					System.out.println("enter only true or false");
					continue;
				}
			}
		}


		System.out.println("bike was added to the inventory!");
															

	}


	public static void displayBikes(String bikeType)
	{
		int i =0;
		switch(bikeType)
		{
			case("basic"):
				for(BasicBike bike: basicBikeArray){System.out.println("Basic Bike slot #"+i+": "+bike.getInfo());i++;}
		
			case("mountain"):
				for(MountainBike bike: mountainBikeArray){System.out.println("Mountain Bike slot #"+i+": "+bike.getInfo()); i++;}

			case("road"):
				for(RoadBike bike: roadBikeArray){System.out.println("Road Bike slot #"+i+": "+bike.getInfo()); i++;}

			case("ebike"):
				for(EBike bike: eBikeArray){System.out.println("Ebike slot #"+i+": "+bike.getInfo()); i++;}

			case("roadEbike"):
				for(RoadEBike bike: roadEBikeArray){System.out.println("Road Ebike slot #"+i+": "+bike.getInfo()); i++;}


		}
	}

	




// methods that display bike info (will need graphics)-----------------------------------------------------------------------------
	// Note: I have to send the enitre copy of the array to this method: pass by value in Java


} // End public class USTBikeShopPro
