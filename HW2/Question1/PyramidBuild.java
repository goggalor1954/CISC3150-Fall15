//James Roesemann
//HW2 Question1

import java.util.*;
	
public class PyramidBuild{
	
	int askNum(){
		Scanner readIn = new Scanner(System.in);
		System.out.println("How tall do you want your pryamid to be? Enter one number.");
		while( readIn.hasNext()){
			if(readIn.hasNextInt()){
				return readIn.nextInt();
			}
			else{
				System.out.println("You did not enter an apropriate number.");
				System.exit(1);
			}
		}
		return-1;
	}
	// the idea here is to first create the string for the particular line, then figure out what you want the spaceing to be, then print out the line with the correct spaceing using printf. i could either create a new sring each time or midify an existing string. creating a new one seams easier. try creating the correct string first then work on the formating. this works. i would loe to figure out how to numbert oend up in the right side of the prompt so i get a better looking triangle.
	//it looks like i need to create 2 strings, one for the everything befroe and one for everthing after the main number
	void printPry(int numVal){
		String pyrStack;
		String width="%"+numVal+"s %n";
		//this loop generates each layer of the pyramid
		for(int i=1; i<=numVal; i++){
			//need to use nested loop here, dont want to, should thingk of another way to do this
			pyrStack="";
			//this nested loop generates the "bricks", ie numbers in the current layer.
			for(int j=1; j<i*2; j++){
				if(j<=i && i !=1){
					pyrStack=pyrStack+j;
				}
				else{
					pyrStack=pyrStack+(i*2-j);
				}
			}
		//	pyrStack=pyrStack+"\n";
		//	print formating is only working for the first line for some reason
			System.out.printf(width,pyrStack);
			// still dont quit understant how to format printf corectly
		}
	}





	void go(){
	printPry(askNum());
	System.out.println("everything went ok");
	}
	public static void main(String args[]){
	PyramidBuild Go = new PyramidBuild();
	Go.go();
	}
}	
