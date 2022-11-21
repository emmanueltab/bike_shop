// Lecture #17 - Object Oriented Programming 10/24/2022
// In class live demo for Inheritance
// 6/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 




// Define the properties and features of the basic bike type 
// This file is not intended for execution so there is no need for a PSVM

// BasicBike is the base class or (parent class) or (super class) or (root class) for all the other 4 
// classes we will be writing

// Base class is used to describe the common attributes for all the bikes we want to include
// In general the base class must be the least common demonimator or storts for all the classes
// one would want to define. This would depend on the problem one is attempting to solve. 

// What is the problem we are trying to solve?
// We want to create an inventory management system for a bike shop 
// This implies we need a way to model a bike for sale that is in the shop
// We need to know the types of bikes that are in the shop

// We can then create a class for each bike type and then create objects when ever new inventory 
// arrives at the shop or delete the objects when the bikes are sold or lost

// Base class or Root or Parent class or Super class are name that are all used interchangeably

class BasicBike
{
	// Public member (fellow) variables - inheriatable
	public int maxSpeed; // This is the max safe operating speed
	public int noOfGears; // No of gears for the bike
	public String paintColor; // Frame color for the bike
	public String safetyFeatures; // List of safety features
	public int currSpeed; //A variable to hold the current speed (when testing) 
	

	
	// Protected member variable - Selectively inheritable
	protected int justAnOtherExample;
	
	
	// Constructors
	
	// Null 
	public BasicBike()
	{
		maxSpeed = 0;
		noOfGears = 0;
		paintColor = "";
		safetyFeatures = "";
		currSpeed = 0;
	}
	
	public BasicBike(int S)
	{
		maxSpeed = S;
		noOfGears = 0;
		paintColor = "";
		safetyFeatures = "";
		currSpeed = 0;
	}
	
	public BasicBike(int S, int G)
	{
		maxSpeed = S;
		noOfGears = G;
		paintColor = "";
		safetyFeatures = "";
		currSpeed = 0;
	}
	
	public BasicBike(int S, int G, String C)
	{
		maxSpeed = S;
		noOfGears = G;
		paintColor = C;
		safetyFeatures = "";
		currSpeed = 0;
	}
	
	public BasicBike(int S, int G, String C, String SF)
	{
		maxSpeed = S;
		noOfGears = G;
		paintColor = C;
		safetyFeatures = SF;
		currSpeed = 0;
	}
	
	// The above multiple constructors for a class is an example of PolyMorphism
	// Poly = Many and Morp = forms i.e. the same method having many forms (different list of 
	// arguments being passed to it) this is aka method signature
	
	// Methods 
	// Public methods - These are inheritable methods
	// These methods are open to access by anyone
	
	public void applyBrake(int decrement)
	{
		if(currSpeed > 0)
			currSpeed -= decrement;
		if (currSpeed < 0)
			currSpeed = 0;
	}
	
	public void speedUp(int increment)
	{
		if(currSpeed < maxSpeed)
			currSpeed += increment;
		if(currSpeed > maxSpeed)
			currSpeed = maxSpeed;		
	}
	
	public String getInfo()
	{
		String msg;
		msg = "Bike Info: {Max speed setting = " + maxSpeed + ", No of gears = " + noOfGears + ", Frame color = " + paintColor + ", Safety features = " + safetyFeatures + "}\n";
		return msg;
	}
	
	// Private methods - These methods are NOT inheritable
	// These methods are meant to be used by object of this (base) class ONLY

	// Protected methods - These methods are selectively inheritable
	// These methods are accessable by objects of this (base) class and objects of any interited class
	
	
	public static void main(String[] args)
	{
	
	} // End PSVM

} // End class BasicBike
