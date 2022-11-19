// Lecture #17 - Object Oriented Programming 10/24/2022
// In class live demo for Inheritance
// 6/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 

// Lecture #18 - Object Oriented Programming 10/26/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 


import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Inherited/sub/child class from the Base class
// Base/super/parent/root class: BasicBike
// Inherited class: MountainBike

class MountainBike extends BasicBike
{
	// public variables
	public int seatHeight;
	public boolean fullSuspension;
	public boolean flatProofTyres;
	
	// protected variable
	
	// private variables
	
	// Constructors  - only one is used here - you can have multiple constructors if you want to
	MountainBike(int SH, boolean FS, boolean FPT, int S, int G, String C, String SF)
	{
		//Passing the base class parameters to the base class constructor
		// "super" is a keyword
		// Make sure this is the first line in any inherited class' constructor
		super(S, G, C, SF);
		
		this.seatHeight = SH;
		this.fullSuspension = FS;
		this.flatProofTyres = FPT;
	}


	// Methods 
	
	// getters and setters
	
	// behavior methods
	
	// Polymorphism (run time) - this inherited class method OVERRIDES the base class method
	
	public String getInfo()
	{
		String msg;
		msg = "Bike Info 1/2: {Max speed setting  " + maxSpeed + ", No of gears " + noOfGears + ", Frame color " + paintColor + ", Safety features " + safetyFeatures + "}\n";
		msg = msg + "Bike Info 2/2: {Seat Height " + seatHeight + ", Full Suspension " + fullSuspension + ", Flat Proof Tyres " + flatProofTyres + " }\n";
		return msg;
	}

} // End class MountainBike
