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
	
	void printPry(int numVal){
		String pryStack;
		for(int i=1; i<numVal; i++){
			//need to use nested loop here, dont want to, should thingk of another way to do this
			pryStack="";
			for(int j=1; j<i*2; j++){
				if(j<=i && i !=1){
					pryStack=pryStack+j;
				}
				else{
					pryStack=pryStack+(i*2-j);
				}
			}
			System.out.printf(%%numVal-i, %n, pryStack);
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
