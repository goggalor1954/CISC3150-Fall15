//Cisc3150 HW1 Question4
//Start time:  8/31/15
//End Time:

import java.util.*;
import java.math.*;

public class CircleTest{

	//object containing on point on a 2d plane
	public class CircleObj{
		double x, y, radius;
	}

//i wasnt sure what what you mment by seprate, so i took that as the circle either touching or one being inside the other.


	//reads data in, creating a circle object, and closed the program if somehting incorect is entered.
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
	//returns the distance of two points
	double findDistance(CircleObj circle1, CircleObj circle2){
		return Math.sqrt(Math.pow(circle2.x-circle1.x, 2)+Math.pow(circle2.y-circle1.y, 2));
	}
	// tests to see of the edgess of the circle touch.
	boolean testTouch(CircleObj circle1, CircleObj circle2, double distance){
		if(distance==(circle1.radius+circle2.radius) || distance==Math.abs(circle1.radius-circle2.radius)){
			System.out.println("The circles touch.");
			return true;
		}
		else{
			System.out.println("the circles do not touch.");
			return false;
		}
	}
	//tests wether the circles overlap one another
	boolean testOverlap(CircleObj circle1, CircleObj circle2, double distance){
		if(distance<(circle1.radius+circle2.radius) && distance > Math.abs(circle1.radius-circle2.radius)){
			System.out.println("The circle overlap.");
			return true;
		}
		else{
			System.out.println("The circles do not overlap");
			return false;
		}
	}
	//tests if once circle is with another
	boolean testWithin(CircleObj circle1, CircleObj circle2, double distance){
		if(distance<=Math.abs(circle1.radius-circle2.radius)){
			System.out.println("One of the circles is entirely inside the other.");
			return true;
		}
		else{
			System.out.println("One of the circles is not entirely inside the other.");
			return false;
		}			
	}
	//tests if once of the circles is within the other.
	void testSeprate(CircleObj circle1, CircleObj circle2, double distance){
		boolean circlesTouch=testTouch(circle1, circle2, distance);
		boolean circlesOverlap=testOverlap(circle1, circle2, distance);
		boolean circlesWithin=testWithin(circle1, circle2, distance);
		if(circlesTouch==true || circlesOverlap==true || circlesWithin==true ){
			System.out.println("The circles are not seprate from each other.");
		}
		else{
			System.out.println("The circles are completly seprate from each other.");
		} 		
	}

	// i prefer to seprate all my statments that would normaly go in main into a a method names go.
	void go(){
		System.out.println("Please enter the center coordinates and radius of two circles.");
		double distance;
		Scanner readIn = new Scanner(System.in);
		CircleObj circle1 = new CircleObj();
		CircleObj circle2 = new CircleObj();
		circle1=readData(readIn);
		circle2=readData(readIn);
		distance=findDistance(circle1, circle2);
		testSeprate(circle1, circle2, distance);
	}

	public static void main(String args[]){
		CircleTest Go = new CircleTest();
		Go.go();
	}
}
