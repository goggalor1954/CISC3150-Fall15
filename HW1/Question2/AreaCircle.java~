//James Roesemann
//Cisc3150 HW1 Question2
//Start time: 13:08 8/31/15
//End Time:

import java.util.*;
//import java.io.*;
import java.math.*;
	//this will be my main class
public class AreaCircle{

		// things i need to do for this program
		//preform everything in a loop untill the user enters ^d(nontorl not he actuall symbol, i think) ***DONE***
		//read in the radius from the user (it's own function or not ***DONE***
		//calculate area of the circle using pi*r^2 with the apropriate math functions (its own function)
		// output to terminal i guess		
	double areaCalc(double radVal){
		return Math.PI*Math.pow(radVal, 2.0);
	}	

	//i prefer to keep main and the body of the the class seprate, so im keeping them im initlizeing the majority of the program in go

	void go(){
		String enteredText=""; 
		double rad;
		Scanner readIn = new Scanner(System.in);
	//	while(enteredText!="^d" || enteredText!="^D"){
		while(readIn.hasNext()){
			if(readIn.hasNextDouble()){
				rad=readIn.nextDouble();
				System.out.println("The area of a circle with a radius of "+rad+" is:"+areaCalc(rad));
			}
			else{
				enteredText=readIn.next();
			}
		}
		System.out.println("out of loop");
	return;
	}
	public static void main(String args[]){

	AreaCircle Go = new AreaCircle();
	Go.go();
	}
}
