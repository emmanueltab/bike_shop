// Lecture #21 - Object Oriented Programming 11/9/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 


// Lecture #23 - Object Oriented Programming 11/16/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 

import java.util.*;
import java.awt.Color;
import java.awt.event.*;					
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;


public class USTBikeShopPro extends JFrame implements ActionListener
{

	// Define a frame to hold the GUI elements
	static JTextField tf;
		
	// Max limit for bikes of a certain type
	static KeyboardReader myKBR = new KeyboardReader();

	static final int MAX_INVENTORY_SIZE_PER_TYPE = 100;
	static final int MAX_INVENTORY_SIZE = 500;
	// This is a settings variable for descriptive messages
	static boolean verboseMode = false;

// bike arrays:
	static ArrayList <BasicBike> basicBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);

	static ArrayList <MountainBike> mountainBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);
	static ArrayList<RoadBike> roadBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);
	static ArrayList<EBike> eBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);
	static ArrayList<RoadEBike> roadEBikeArray = new ArrayList<>(MAX_INVENTORY_SIZE_PER_TYPE);
// end of bike arrays-------------------------------------------


	public static void main(String[] args)
	{
	// basic frame settings:
		final int WIDTH = 1780, HEIGHT = 1000;
		JFrame frame = new JFrame("Emmanuel's bike shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(WIDTH, HEIGHT);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
	// ---------------------END OF BASIC FRAME SETTINGS-------------

	// buttons and panel for display bikes:
		JButton d1 = new JButton("display Basic bikes");
		JButton d2 = new JButton("display Mountain bikes");
		JButton d3 = new JButton("display Road bikes");
		JButton d4 = new JButton("display E bikes");
		JButton d5 = new JButton("display Road E bikes");
		JPanel display_panel = new JPanel();
	
		display_panel.add(d1);
		display_panel.add(d2);
		display_panel.add(d3);
		display_panel.add(d4);
		display_panel.add(d5);

	// buttons and panel for add bikes:
		JButton a1 = new JButton("add a basic bike");
		JButton a2 = new JButton("add a mountain bike");
		JButton a3 = new JButton("add a road bike");
		JButton a4 = new JButton("add a E-bike");
		JButton a5 = new JButton("add a Road E-bike");

		JPanel add_panel = new JPanel();
		add_panel.add(a1);
		add_panel.add(a2);
		add_panel.add(a3);
		add_panel.add(a4);
		add_panel.add(a5);
	// buttons and panel for remove bikes:
		JButton r1 = new JButton("remove a basic bike");
		JButton r2 = new JButton("remove a mountain bike");
		JButton r3 = new JButton("remove a road bike");
		JButton r4 = new JButton("remove a E bike");
		JButton r5 = new JButton("remove a Road E bike");

		JPanel remove_panel = new JPanel();
		remove_panel.add(r1);
		remove_panel.add(r2);
		remove_panel.add(r3);
		remove_panel.add(r4);
		remove_panel.add(r5);

	// buttons and panel for modify bikes:
		JButton m1 = new JButton("modify a basic bike");
		JButton m2 = new JButton("modify a mountain bike");
		JButton m3 = new JButton("modify a road bike");
		JButton m4 = new JButton("modify a E bike");
		JButton m5 = new JButton("modify a Road E bike");
		JPanel modify_panel = new JPanel();
		modify_panel.add(m1);
		modify_panel.add(m2);
		modify_panel.add(m3);
		modify_panel.add(m4);
		modify_panel.add(m5);


		JPanel mainPanel = new JPanel(); // Declare and create a main panel
		mainPanel.setLayout(new GridLayout(1, 1));
		mainPanel.add(display_panel);
		mainPanel.add(add_panel);
		mainPanel.add(remove_panel);
		mainPanel.add(modify_panel);
		frame.add(mainPanel);

		frame.setVisible(true);

		int count = 0; boolean exitnow = false;

		while(exitnow != true)
		{
		// Display bikes from inventory:
			System.out.println("number of runs: " + count);
			System.out.println("display options: ");
			System.out.println(" d1 - display Basic bike Stock\n d2 - display Mountain bike Stock");
			System.out.println(" d3 - display Road bike Stock\n d4 - display E bike Stock");
			System.out.println(" d5 - display Road E bike Stock");
		// add bikes to inventory:
			System.out.println("\n a1 - add a basic bike");
			System.out.println(" a2 - add a mountain bike");
			System.out.println(" a3 - add a road bike");
			System.out.println(" a4 - add a E-bike");
			System.out.println(" a5 - add a road E-bike");
			System.out.println(" e - exit");
		// remove bikes frrom inventory:
			
			
			// Call the methods here according to user choice
			String choice = myKBR.getKeyboardInput();

			switch (choice)
			{
				case ("d1"): displayBikes("basic");
							break;
				case ("d2"): displayBikes("mountain");
							break;
				case ("d3"): displayBikes("road");
							break;
				case ("d4"): displayBikes("ebike");
							break;
				case ("d5"): displayBikes("roadEbike");
							break;
				case("a1"): if(basicBikeArray.size()!=MAX_INVENTORY_SIZE_PER_TYPE) {bikeAdder("basic");}
							else {System.out.println("basic bike array is full.");}
							break;
				case("a2"): if(mountainBikeArray.size()!=MAX_INVENTORY_SIZE_PER_TYPE) {bikeAdder("mountain");}
							else{System.out.println("mountainbike array is full.");}
							break;
				case("a3"): if(roadBikeArray.size() != MAX_INVENTORY_SIZE_PER_TYPE) {bikeAdder("road");}
							else{System.out.println("roadbike array is full");}
							break;
				case("a4"): if(eBikeArray.size() != MAX_INVENTORY_SIZE_PER_TYPE) {bikeAdder("ebike");}
							else{System.out.println("ebike array is full");}
							break;
				case("a5"): if(roadEBikeArray.size() != MAX_INVENTORY_SIZE_PER_TYPE) {bikeAdder("roadEbike");}
							 else{System.out.println("roadEbike array is full");}
							 break;
				case ("e"): exitnow = true;
							break;
				
				default: exitnow = true;
							break;
				
			}
			count++;
			
		} 
	
		
			
	} // End PSVM
	
// methods that will add, remove, and modify bikes(will need graphics)-------------------------------------------------------------

	public static void bikeAdder(String type) //type will be basic or road or ebike or roadEbike or mountain
	{
	// specs for basic bike. will apply for all the other bikes:------------------------------------------------------------------
		int speed, gears; String color, safeFeatures;

		System.out.println("enter the basic specs for your bike: ");
		while(true)
		{
				try 
				{ // for specs that are ints
					System.out.println("max speed: "); speed = myKBR.getKeyboardInt(); 
					System.out.println("number of gears: "); gears = myKBR.getKeyboardInt();

				} catch (Exception e) {System.out.println("only integers.");continue;}

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
		else if(type == "road")
		{
			boolean flathandlebar;

			while(true)
			{
				try
				{
					System.out.println("enter true or false for flathandle bar: "); flathandlebar = Boolean.parseBoolean(myKBR.getKeyboardInput());
					break;
	
				}catch(Exception e){System.out.println("enter only true or false");continue;}
			}
	
			RoadBike r = new RoadBike(speed, gears, color, safeFeatures, flathandlebar);
			roadBikeArray.add(r);
		}
// ignore above. its good. work on below.--------------------------------------

		else if(type == "ebike" || type == "roadEbike")
		{
			String battertype;
			int rangemiles, batterysize, voltage;
			double motorpower;
			
			System.out.println("enter battery type: "); battertype = myKBR.getKeyboardInput();

			while(true) // for atributes that apply to ebike and roadEbike:
			{
				try 
				{
					System.out.println("enter range miles as int: "); rangemiles = myKBR.getKeyboardInt();

					System.out.println("enter battery size as int: "); batterysize = myKBR.getKeyboardInt();

					System.out.println("enter battery voltage as int: "); voltage = myKBR.getKeyboardInt();

					System.out.println("enter motor power as double: ");	motorpower = myKBR.getKeyboardDouble();
					break;
	
				} catch (Exception e){System.out.println("enter proper data type.");continue;}
			}	

				if(type == "roadEbike"){
					System.out.println("enter true or false for flathandle bar: "); boolean flathandlebar = Boolean.parseBoolean(myKBR.getKeyboardInput());
					System.out.println("enter true or false for hybridcomfort: "); boolean hybridcomfortbike = Boolean.parseBoolean(myKBR.getKeyboardInput());

					RoadEBike reb = new RoadEBike(hybridcomfortbike, speed, gears, color, safeFeatures, flathandlebar);
					roadEBikeArray.add(reb);

				}

				else if(type == "ebike")
				{
					int seatheight; boolean fullSuspension; boolean flatprooftyres;

					while(true)
					{
						try 
						{
							System.out.println("enter seat height as integer: "); seatheight = myKBR.getKeyboardInt();
		
							System.out.println("enter true or false for full suspension: "); fullSuspension = Boolean.parseBoolean(myKBR.getKeyboardInput());
		
							System.out.println("enter true or false for flatprooftyres: "); flatprooftyres = Boolean.parseBoolean(myKBR.getKeyboardInput());
							break;

				
						} catch (Exception e) {System.out.println("enter proper data types");continue;}
						
			
					}
					EBike eb = new EBike(rangemiles, battertype, batterysize, voltage, motorpower, seatheight, fullSuspension, flatprooftyres, speed, gears, color, safeFeatures);
					eBikeArray.add(eb);
				}
		
			
		}

		else if(type == "mountain")
		{
			int seatheight; boolean fullSuspension, flatprooftyres;

			while(true)
			{
				try 
				{
					System.out.println("enter seat height as integer: "); seatheight = myKBR.getKeyboardInt();
					System.out.println("enter true or false for full suspension: "); fullSuspension = Boolean.parseBoolean(myKBR.getKeyboardInput());
					System.out.println("enter true or false for flatprooftyres: "); flatprooftyres = Boolean.parseBoolean(myKBR.getKeyboardInput());
					break;
		
				} catch (Exception e) {System.out.println("enter proper data types");continue;}
	
			}
			MountainBike m = new MountainBike(seatheight, fullSuspension, flatprooftyres, speed, gears, color, safeFeatures);
			mountainBikeArray.add(m);
		}



		System.out.println("bike was added to the inventory!");
															

	}

	public static void removeBike(String type)
	{

		int bike_position;
		System.out.println("which bike do you want to remove? (enter integer for its position):"); bike_position = myKBR.getKeyboardInt();


		// each if blcck will call its respective display method. and put it on the GUI.
		if(type == "basic")
		{
			try {
				basicBikeArray.remove(bike_position); 
			} catch (Exception e) {
				System.out.println("no bike in that position");
			}
		}
		else if(type == "mountain")
		{
			try {
				mountainBikeArray.remove(bike_position);
			} catch (Exception e) {
				System.out.println("no bike in that position");
			}
		}
		else if(type == "road")
		{
			try {
				roadBikeArray.remove(bike_position);
			} catch (Exception e) {
				System.out.println("no bike in that position");
			}
		}
		else if(type =="ebike")
		{
			try {
				eBikeArray.remove(bike_position);
			} catch (Exception e) {
				System.out.println("no bike in that position");
			}
		}
		else if(type == "roadEbike")
		{
			try {
				roadEBikeArray.remove(bike_position);
			} catch (Exception e) {
				System.out.println("no bike in that position");
			}
		}
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}





	




// methods that display bike info (will need graphics)-----------------------------------------------------------------------------
	// Note: I have to send the enitre copy of the array to this method: pass by value in Java


} // End public class USTBikeShopPro
