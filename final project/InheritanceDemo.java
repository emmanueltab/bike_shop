// Lecture #18 - Object Oriented Programming 10/26/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 

// Lecture #20 - Object Oriented Programming 11/02/2022
// In class live demo for Inheritance
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 



// Here we are attempting to create objects for the classes that we have defined
// Base class: BasicBike
// Level 1 inherited classes: MountainBike

public class InheritanceDemo
{
	public static void main(String[] args)
	{
		// create an object for the base class
		
		BasicBike basicBike01 = new BasicBike(20, 18, "Pink", "ceramic brakes, titanium");
		
		System.out.println(basicBike01.getInfo());	
		
		MountainBike mountainBike01 = new MountainBike(4, false, true, 8, 36, "Neon", "Mg brakes, titanium, carbon fibre seatpost");
		
		System.out.println(mountainBike01.getInfo());
		
		// I want to change the color of the mountainBike01 
		// 
		
		mountainBike01.paintColor = "green";
		
		System.out.println(mountainBike01.getInfo());
		
		basicBike01.paintColor = "Baby Pink";
		
		System.out.println(basicBike01.getInfo());	
		
		
		System.out.println(mountainBike01.currSpeed);
		
		mountainBike01.speedUp(10);
		
		System.out.println(mountainBike01.currSpeed);
		
		mountainBike01.applyBrake(3);
		
		System.out.println(mountainBike01.currSpeed);
		
		
		// Road bike
		
		RoadBike roadBike01 = new RoadBike(25, 18, "White", "Brakes", true);
		
		System.out.println(roadBike01.getInfo());
		
		// Ebike
		
		EBike eBike01 = new EBike(45, "Li-Ion", 15, 48, 0.5, 5, true, true, 50, 6, "Neon", "disk brakes, fall over cut off, low Bt, blinkers"); 
		
		System.out.println(eBike01.getInfo());
	
		// RoadEBike
		RoadEBike roadEBike01 = new RoadEBike(false, 45, 4, "Flash Red", "Disk brakes, auto stop, ASB, Regen braking", true);
		
		System.out.println(roadEBike01.getInfo());
	}
	
}
