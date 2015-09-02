//James Roesemann
//Cisc3150 HW1 Question4
//Start time:  8/31/15
//End Time:

import java.util.*;
import java.io.*;

public class PrintNum{

	// what i need to do 
	//create file with numbers. ***done***
	//create scanner that reads file based on argument
	//create loop that outputs scanner to screen
	//close scanner at eof
	void go(String[] args){
		//File infile = new File();
		Scanner readNum = new Scanner(System.in);
		while(readNum.hasNext()){
			System.out.println(readNum.next());
		}
	}

	public static void main(String[] args){
	PrintNum Go = new PrintNum();
	Go.go(args);
	}
}
