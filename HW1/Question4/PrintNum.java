//James Roesemann
//Cisc3150 HW1 Question4
//Start time:  8/31/15
//End Time:

import java.util.*;
import java.io.*;

public class PrintNum{

// I'm not quite sure what was wanted here. If the point of this exersise was to print the whoile file or just the individual tokenns, so I went with the most literal interpretation.
	void go(){
		Scanner readNum = new Scanner(System.in);
		while(readNum.hasNext()){
			System.out.println(readNum.next());
		}
	}

	public static void main(String[] args){
	PrintNum Go = new PrintNum();
	Go.go();
	}
}
