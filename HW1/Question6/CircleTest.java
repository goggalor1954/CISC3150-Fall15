//Cisc3150 HW1 Question4
//Start time:  8/31/15
//End Time:

import java.util.*;
import java.math.*;

public class CircleTest{

	public class CircleObj{
		double x, y, radius, radiusSum, radiusDiff;
	}
	// qhT I NEED TO DO
	//prompt user***done***
	//take input(makesure its the right input)***done***
	// somehow test and show if the circles are touching, overlaping , completly with in eachother and are seprate.


	CircleObj readData(Scanner readIn){
		CircleObj circleVal = new CircleObj();
		if(readIn.hasNextDouble()){
			circleVal.x=readIn.nextDouble();
		}
		else{
			System.out.println("You did not enter an appropriate number.");
			System.exit(1);
		}
		if(readIn.hasNextDouble()){
			circleVal.y=readIn.nextDouble();
		}
		else{
			System.out.println("You did not enter an appropriate number.");
			System.exit(1);
		}
		if(readIn.hasNextDouble()){
			circleVal.radius=readIn.nextDouble();
		}
		else{
			System.out.println("You did not enter an appropriate number.");
			System.exit(1);
		}
		return circleVal;
	}
	//finds the radius diffrence from the two circles
	double findRadiusDiff(CircleObj1, CircleObj2){
		if(circle1.radius>circle2.radius){
			return=circle1.radius-circle2.radius;
		}
		else{
			return=circle2.radius-circle1.radius;
		}
		
	// tests to see of the edgess of the circle touch.
	boolean testTouch(CircleObj cirlce1, CircleObj cirlce2){
		double radiusSum, radiusDiff;
		if(Math.sqrt(Math.pow((circle2.x-circle1.x),2)+Math.pow((circle2.y-circle1.y),2)==circle1.radiusSum||circle1.radiusDiff){
			System.out.ptintln("The circles Touch.");
			return true;
		}
		else{
			System.out.println("the circles do not touch.");
			return false;
		}
	}
	//tests wether the circles overlap one another
	boolean testOverlap(CircleObj cirlce1, CircleObj cirlce2){
		if(Math.sqrt(Math.pow((circle2.x-circle1.x),2)+Math.pow((circle2.y-circle1.y),2)<circle1.radiusSum && > circle1.radiusDiff){
			System.out.println("The circle overlap.");
			return true;
		}
		else{
			System.out.println("The circles do not overlap");
			return false;
		}
	}
	boolean testWithin(CircleObj cirlce1, CircleObj cirlce2){
	}
	void testSeprate(CircleObj cirlce1, CircleObj cirlce2){
		if(testTouch(circle1, circle2)==true || testOverlap(circle1, circle2)==true || testWithin(circle1, circle2)==true ){
			System.out("Because the circles either touch, overlap, or one is completly within the ohter the two circles are completly not seprate from each other.");
		}
		else{
			System.out.println("Because the circles do not touch, overlap, and one is not with the other, they are completly seprate from each other.");
		} 		
	}


	void go{
		System.out.println("Please enter the center coordinates and radius of two circles.");
		Scanner readIn = new Scanner(System.in);
		CircleObj circle1 = new CircleObj();
		CircleObj circle2 = new CircleObj();
		circle1=readData(readIn);
		circle2=readData(readIn);
		circle1.radiusSUm=circle2.radiusSum=circle1.radius+circle2.radius;
		circle1.radiusDiff=circle2.RadiusDiff=findRadiusDiff(circle1, circle2);
		testSeprate(circle1, circle2);
	}

	public static void main(String args[]){
		CircleTest Go = new CircleTest();
		Go.go();
	}
}
