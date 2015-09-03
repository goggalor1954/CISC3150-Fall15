//James Roesemann
//Cisc3150 HW1 Question2


import java.util.*;
import java.math.*;

public class AreaCircle{

	//calculates the area of a circle
	double areaCalc(double radVal){
		return Math.PI*Math.pow(radVal, 2.0);
	}	


	void go(){
		String enteredText=""; 
		double rad;
		Scanner readIn = new Scanner(System.in);
		while(readIn.hasNext()){
			if(readIn.hasNextDouble()){
				rad=readIn.nextDouble();
				System.out.println("The area of a circle with a radius of "+rad+" is:"+areaCalc(rad));

			}
			else{
				enteredText=readIn.next();
				//System.out.println("You did not enter an apropriate number.");

			}
		}
	return;
	}
	// I prefer to keep most of my code out of main.
	public static void main(String args[]){

	AreaCircle Go = new AreaCircle();
	Go.go();
	}
}
