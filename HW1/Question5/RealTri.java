//James Roesemann
//Cisc3150 HW1 Question4
//Start time:  8/31/15
//End Time:

import java.util.*;
import java.math.*;
	// was not sure if you wanted the length of the sides to be output or only if the triagle is real.
	//.....you know im having a hard time coming up with a fake triangle. i can't figure out 3 points that wont make a triangle.
	public class RealTri{

	// object representing a point.
	class TriPoint{
		double x, y;
	}
	//reads in the values of the x and y cordinates
	TriPoint readData(Scanner readNum){
		TriPoint pointVal = new TriPoint();
		if( readNum.hasNextDouble()){
			pointVal.x=readNum.nextDouble();
		}
		else{
			System.out.println("You did not enter an aproprate value.");
			System.exit(1);
		}
		if( readNum.hasNextDouble()){
			pointVal.y=readNum.nextDouble();
		}
		else{
			System.out.println("You did not enter an aproprate value.");
			System.exit(1);
		}
		return pointVal;
	}
	
	//determines the length of the sides 
	double sideLength(double x1, double y1, double x2, double y2){
		return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	}
	// compares the lenghts of the sides and determines if the triangle is real.
	void isRealTri(double side1, double side2, double side3){
		if( side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
			System.out.println("The triangle is real.");
		}
		else{
			System.out.println("The triangle is not real.");
		}
	}

	void go(){
		double side1, side2, side3;
		TriPoint a, b, c;
		Scanner readNum = new Scanner(System.in);
		a=readData( readNum);
		b=readData( readNum);
		c=readData( readNum);
		side1=sideLength(a.x, a.y, b.x, b.y);
		side2=sideLength(b.x, b.y, c.x, c.y);
		side3=sideLength(c.x, c.y, a.x, a.y);
		isRealTri(side1, side2, side3);
	}

	public static void main(String[] args){
		RealTri Go = new RealTri();
		Go.go();
	}
}
