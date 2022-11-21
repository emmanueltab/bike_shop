// Lecture #19 - Object Oriented Programming 10/31/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 


// Lecture #20 - Object Oriented Programming 11/02/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 



// Inherited/sub/child class from the Base class
// Base/super/parent/root class: RoadBike
// Interface class i.e. uncle or aunt class: EBike
// Inherited class: RoadEBike

// To get some (NOT ALL) features from the uncle/aunt class i.e. EBike 
// We have to define an interface to the uncle/aunt class
// An interface is a set of variable and or methods that we want to inherit
// HOWEVER: these variable values cannot be changed and they are final values
// SIMILARLY: methods should not be defined but ONLY declared i.e. the methods in 
// an interface CANNOT have a body. These are called abstract methods

interface EBikeInterface 
{
	// Variable in an interface must have a default value, which is not changeable
	public int rangeMiles = 100;
	public String batteryType = "Li-ion"; // Li-ion, NiMH, SLA, AGM, LiPo
	public int batterySize = 25; // A-hours
	public int batteryVolt = 48; // 12/24/36/48 
	public double motorPower = 0.75; // in KW 0.5. 1.0 etc
	
	// Methods in an interface cannot have a body and must be declarations only i.e. abstract method
	// The intentions is for any class that implements this interface to redefine these methods
	public String getBatteryInfo();
	public String getInfo();
}

class RoadEBike extends RoadBike implements EBikeInterface
{
	// This variable belongs to the RoadEBike class ONLY
	public boolean hybridComfortBike;
	
	// Constructor
	
	RoadEBike(boolean HCB, int S, int G, String C, String SF, boolean FHB)
	{
		super(S, G, C, SF, FHB);
		this.hybridComfortBike = HCB;		
		//this.rangeMiles = 200; 
		// We cannot do this because the interface variables are final and cannot change their values.
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
		msg = msg + "Bike Info 2/4: {Hybrid comfort bike " + hybridComfortBike + "}\n";
		msg = msg + "Bike Info 3/4: {" + getBatteryInfo() + " }\n";
		msg = msg + "Bike Info 4/4: {Range in miles " + this.rangeMiles + ", Motor Power " + this.motorPower + " }\n";
		return msg;
	}


}
