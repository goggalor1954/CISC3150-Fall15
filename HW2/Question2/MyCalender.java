//James Roesemann
//HW2 Question 2

	// for this program i know that we are suposed to ask the user for the day the first of january fell on, as well as the year, but that seams kind of unreasonable. i know the first of january 1900 is a pretty consistant date used in these kinds of programs, so im going to be basing everything off of that date, and just ignore whatever the user tell me the first is.
	//see if i can add functonality later for years before 1900 and posibly before ce
	// you know what, inorder to build this i need to build what he aked for anyway, let me try that first and if i have time i can add to it.
import java.util.*;
import java.math.*;

public class MyCalender{
	
	public static void main(String args[]){
		MyCalender Go = new MyCalender();
		Go.go();
	}
	void go(){
		FirstDay jan1;
		jan1=enteredDate();
		System.out.println(jan1.day);
	}
	
	class FirstDay{
		int year;
		String day;
		}
	
	//this is a method to check a switch statment to see of the entered ext matches any day of the week.
	String CorrectDay(String readIn){
	//I was going to put in every possible spelling of every day, but i'm not a masochist.
		switch(readIn){
			case "Sunday": return "Su";
			case "Monday": return "Mo";
			case "Tuesday": return "TU";
			case "Wednesday": return "WU";
			case "Thursday": return "TH";
			case "Friday": return "FR";
			case "Saturday": return "Sa"; 
			default: { 
				System.out.println("You did not enter i day I recognized.");
				System.exit(1);
				}
		}
		return "something went wrong";
	}
					
	// receives the entered year and what day the first of January falls on.
	FirstDay enteredDate(){
		FirstDay jan1 = new FirstDay();
		Scanner readIn = new Scanner(System.in);
		//while(readIn.hasNext()){
			System.out.println("Please enter the year you want to see?");
			if(readIn.hasNextInt()){
				jan1.year=readIn.nextInt();
			}
			else{
				System.out.println("I did not recognize that as a year.");
				System.exit(1);
			}
			System.out.println("Now enter the day of the week the first of January falls on.");
			jan1.day=CorrectDay(readIn.next());	
		}
		
		
		
		//what do i need to do now
		// i need to create a loop and a subloop
		// need to determine the number of days
		starting from the first day , print the month, then the days, then figure out what days next based on the previous day, then it has to be formated crecly, 
			
				
			
	

}