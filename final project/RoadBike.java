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
// Inherited class: RoadBike

class RoadBike extends BasicBike
{
	// This is a private variable for data encapsulation example
	private boolean flatHandleBar;
	
	// Getter
	public boolean isFlatHandleBar()
	{
		return flatHandleBar;
	}
	
	// Setter
	public void setFlatHandleBar(boolean type)
	{
		flatHandleBar = type;
	}
	
	// Constructor
	public RoadBike(int S, int G, String C, String SF, boolean FHB)
	{
		super(S, G, C, SF);
		flatHandleBar = FHB;		
	}
	
	// Methods
	
	public String getInfo()
	{
		String msg;
		msg = "Bike Info 1/2: {Max speed setting = " + this.maxSpeed + ", No of gears = " + this.noOfGears + ", Frame color = " + this.paintColor + ", Safety features = " + this.safetyFeatures + "}\n";
		msg = msg + "Bike Info 2/2: {Flat Handle Bar: " + flatHandleBar + " }\n";
		return msg;
	}

	
}
