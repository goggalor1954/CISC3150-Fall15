//James Roesemann
//Cisc3150 HW1 Question3


import java.util.*;

public class RandMonth{

		// do not enter a number that is not 1-12 in this, will cause an error
	String whatMonth(int month ){
		switch (month){
			case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
			default: return "You did not enter a number between 1-12. Howed you do that?";
		}
	}
		
	void go(){
		Random rnd = new Random();
		System.out.println(whatMonth(rnd.nextInt(12)+1));
	}

	public static void main(String args[]){
		RandMonth Go = new RandMonth();
		Go.go();
	}
}
