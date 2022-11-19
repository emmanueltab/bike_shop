// Lecture #19 - Object Oriented Programming 10/31/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 


import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Inherited/sub/child class from the Base class
// Base/super/parent/root class: MountainBike
// Inherited class: EBike

class EBike extends MountainBike
{
	
	public int rangeMiles;
	public String batteryType; // Li-ion, NiMH, SLA, AGM, LiPo
	public int batterySize; // A-hours
	public int batteryVolt; // 12/24/36/48 
	public double motorPower; // in KW 0.5. 1.0 etc
	
	
	// Constructors 
	EBike(int RM, String BTy, int BSz, int BVt, double MP, int SH, boolean FS, boolean FPT, int S, int G, String C, String SF )
	{
		//Call the super i.e. base class' constructor
		super(SH, FS, FPT, S, G, C, SF);
		
		this.rangeMiles = RM;
		this.batteryType = BTy;
		this.batterySize = BSz;
		this.batteryVolt = BVt;
		this.motorPower = MP;		
		
	}
	
	public String getBatteryInfo()
	{
		String msg = "";
		msg = "Battery Type: " + this.batteryType + ", Battery Size: " + this.batterySize + ", Battery Voltage: " + this.batteryVolt;
		return msg;
	}
	
	
	public String getInfo()
	{
		String msg;
		msg = "Bike Info 1/4: {Max speed setting  " + maxSpeed + ", No of gears " + noOfGears + ", Frame color " + paintColor + ", Safety features " + safetyFeatures + "}\n";
		msg = msg + "Bike Info 2/4: {Seat Height " + this.seatHeight + ", Full Suspension " + this.fullSuspension + ", Flat Proof Tyres " + this.flatProofTyres + " }\n";
		msg = msg + "Bike Info 3/4: {" + getBatteryInfo() + " }\n";
		msg = msg + "Bike Info 4/4: {Range in miles " + this.rangeMiles + ", Motor Power " + this.motorPower + " }\n";
		return msg;
	}

}
