// Lecture #14 - Object Oriented Programming 10/12/2022
// Creating an application with a GUI only, demo for UX (user experience)
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj

// Lecture #15 - Object Oriented Programming 10/17/2022
// Creating an application with a GUI only, demo for UX (user experience)
// 7/9 students in attendance, Instrutor: Dr. Charles Thangaraj

// Standard imports
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Standard imports for GUI 
import javax.swing.*; // We will use JFrames to hold the GUI elements and JFrames is found in swing
import java.awt.*; 	// We will use Graphics class found here to pick and choose buttons, radio boxes etc
import java.awt.event.*;					// Canvas is found here as well

// The class MyCalculator is (an extension of) a child class of the parent class JFrame
// ALSO the class MyCalculator (implements) is a neice of the ActionListener class 
// This done this way to avoid any class having two parent classes

public class MyCalculator extends JFrame implements ActionListener
{
	// Define a frame to hold the GUI elements
	static JFrame f;
	
	// Define a textbox to be placed inside the frame
	static JTextField tf;
	
	// When doing calculations we will need two variable or values and one operator to use these values 
	// For instance, 5 * 7, here operand1 = 5, operand2 = 7 and operator = *
	String operand1, operand2, operator;
	
	// Construtors 
	MyCalculator()
	{
		operand1 = operand2 = operator = "";
	}
	
	MyCalculator(String one, String two, String three)
	{
		operand1 = one;
		operand2 = two;
		operator = three;
	}
	
	
	public static void main(String[] args)
	{
		f = new JFrame("Welcome folks of FA 2022 OOP class !!");
		// What to do when the x button on the window frame in clicked
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try
		{
			//Set some defaults for the GUI
			// Instructing the JVM how to deal with the OS
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		} catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		
		// Creating an object of the MyCalculator class
		MyCalculator myCalcGUI = new MyCalculator();
		
		tf = new JTextField(64); // 64 is the width of the text field
		tf.setEditable(false); // read only
		tf.setText("Welcome OOP Class FA 2022");
		
		// Declaring all the buttons we would need for the Calculator GUI
		// Buttons
		JButton b0, b1, b2, b3, b4, b5; // Declare 
		JButton b6, b7, b8, b9, bdot, bequ;
		JButton badd, bsub, bmult, bdiv, bclr;
		
		// Creating the buttons and setting their unique text values
		// so the actionListener can recognize which button was pressed
		b0 = new JButton("0"); 
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bdot = new JButton(".");
		
		
		badd = new JButton("+");
		bsub = new JButton("-");
		bmult = new JButton("*");
		bdiv = new JButton("/");
		bclr = new JButton("C");
		bequ = new JButton("=");

		
		// Adding components to the panel 
		// A frame can have multiple panels
		
		JPanel p0 = new JPanel(); // Declare and create a panel i.e. a sub panel
		p0.add(tf);
			
		JPanel p1 = new JPanel(); // Declare and create a panel i.e. a sub panel
		
		p1.add(b0);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(bdot);
		
		JPanel p2 = new JPanel(); // Declare and create a panel i.e. a sub panel
		
		p2.add(badd);
		p2.add(bsub);
		p2.add(bmult);
		p2.add(bdiv);
		p2.add(bclr);
		p2.add(bequ);
		
		JPanel mainPanel = new JPanel(); // Declare and create a main panel
		mainPanel.setLayout(new GridLayout(3, 1)); // Setting how the three sub-panels must be arranged in a grid
		
		// Adding all the 3 sub panels to the main panel with the chosen layout
		mainPanel.add(p0);
		mainPanel.add(p1);
		mainPanel.add(p2);
		
		// Adding the main panel to the frame
		f.add(mainPanel);
		
		f.setSize(600,250);
		//f.show(); // make the frame visible to the user
		f.setVisible(true);
		
		// Here we are tagging the GUI components for the action listener methods to
		// monitor for any actions to act upon 
		b0.addActionListener(myCalcGUI);
		b1.addActionListener(myCalcGUI);
		b2.addActionListener(myCalcGUI);
		b3.addActionListener(myCalcGUI);
		b4.addActionListener(myCalcGUI);
		
		b5.addActionListener(myCalcGUI);
		b6.addActionListener(myCalcGUI);
		b7.addActionListener(myCalcGUI);
		b8.addActionListener(myCalcGUI);
		b9.addActionListener(myCalcGUI);
		bdot.addActionListener(myCalcGUI);
		
		badd.addActionListener(myCalcGUI);
		bsub.addActionListener(myCalcGUI);
		bmult.addActionListener(myCalcGUI);
		bdiv.addActionListener(myCalcGUI);
		bclr.addActionListener(myCalcGUI);
		
		bequ.addActionListener(myCalcGUI);
		
		
	} // End PSVM
	
	
	// Just redefining and customizing the generic method to suit our needs and our GUI
	// We need to tell this method what to do when the action that should listened to, just happened
	// Describe the behavior(s) for the specific action(s)
	public void actionPerformed(ActionEvent e)
	{
		
		// What just happenned ? 
		// This variable holds the text identifier for the button that was pressed (the action) 
		// prompting the call to this method
		String actionString = e.getActionCommand();
		
		// Just to explain what is going on, this is not part of the GUI application
		//System.out.println("You pressed the " + actionString + " button.");
		
		// Based upon the most recent button press do the following
		
		// Was any of the digits(and dot) button pressed?
		// Location ID: 00001
		// Convert the actionString to a character i.e. "0" to '0'
		if((actionString.charAt(0) >= '0' && actionString.charAt(0) <= '9') || actionString.charAt(0) == '.' )
		{		
			// 0-9 or . was pressed
			// Operand1 or Operand2 is null 
			
			if(!operator.equals(""))
			{
				// operator is NOT null i.e. what is being entered is the second operand
				operand2 = operand2 + actionString; // concatinating the string to form the operand2 for display
			}
			else
			{
				// operator is null
				operand1 = operand1 + actionString; // concatinating the string to form the operand1 for display
			}
			
			// Update the GUI
			tf.setText(operand1 + " " + operator + " " + operand2);
			
			
		} // End 0-9 or '.'
		// End Location ID: 00001
		// Location ID: 00002 
		else if (actionString.charAt(0) == 'C') // Was the clear button pressed?
		{
			operand1 = operand2 = operator = "";
			// To reflect that the clear operation was performed
			// We need to update the GUI as well
			tf.setText(operand1 + " " + operator + " " + operand2 + "Cleared");
		}
		// End Location ID: 00002
		// Location ID: 00003 
		else if (actionString.charAt(0) == '=') // Was the equals to button pressed?
		{
			if(operand1.equals("") || operand2.equals("") || operator.equals(""))
			{
				tf.setText("Error 001: Incomplete info provided");
			}
			else
			{
				// All necessary inputs are available and we can proceed to do the mathematical calculations
				
				double result = 0.0; // This will hold the results of the calculation
				
				// These will hold the double (converted from string) values
				double tempOperand1, tempOperand2;
				
				tempOperand1 = Double.parseDouble(operand1);
				tempOperand2 = Double.parseDouble(operand2);
				
				if(operator.equals("+"))
					result = tempOperand1 + tempOperand2;
				else if (operator.equals("-"))
					result = tempOperand1 - tempOperand2;
				else if (operator.equals("*"))
					result = tempOperand1 * tempOperand2;
				else if (operator.equals("/"))
					result = tempOperand1 / tempOperand2;
				else
					result = 0123456789.9876543210;
				
				// Now the result has the correct value, update the GUI for the user to see
				tf.setText(operand1 + " " + operator + " " + operand2 + " = " + Double.toString(result) );
			}
		}
		// End Location ID: 00003
		// Location ID: 00004
		else if ( (actionString.charAt(0) == '+') || (actionString.charAt(0) == '-') || (actionString.charAt(0) == '*') || (actionString.charAt(0) == '/') ) // Were any of the operator buttons pressed? 
		{
			// Check to see if the operator button was pressed out of order
			// i.e. First enter operand1 then press the operator and then enter operand2,
			// followed by the '=' button. This is the correct order of inputs.
			if(operand1.equals(""))
			{
				tf.setText("Error 002: Please enter the first number");
			}
			else
			{
				// Operand1 is not null AND an operator has not already been selected and
				// it is null
				if (operator.equals(""))
				{
					operator = operator + actionString.charAt(0);
					
				}	
				// Update the GUI
				tf.setText(operand1 + " " + operator + " " );
			}
		}
		// End Location ID: 00004
		// Location ID: 00005
		else
		{
			// The 0-9 digits or the '.' or the 'C' or the '=' or an of the '+', '-', '*', '/' was pressed
			tf.setText("Error 003: Please perform a valid operation");
		}
		// End Location ID: 00005
		
	} // End actionPerformed()
	
} // End class MyCalculator
