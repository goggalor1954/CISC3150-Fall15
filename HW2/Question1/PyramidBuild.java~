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
// generate a front stack and a back stack based on the entered text, still dosent work with number >9
// im going to rework this so that it prints out blank spaces in a loop untill it gets to the number.
	void printPry(int numVal){
		//atempt to fix the spaceing issue with double digits;
		String smallBrick="1", largeBrick+"2";
		String brickSize=smallBrick;
		//if(numVal>10) rowCount>=2+"";
		//loop to print each row, starts out printing spaces, then moves to an inner loop that prints the numbers.
		for(int rowCount=1; rowCount<=numVal; rowCount++){
			//if(rowCount>10) brickSize=2+"";
			for(int blankSpace=0; blankSpace<(numVal-rowCount)*2; blankSpace++){
				System.out.printf("%"+brickSize+"s", "");
			}
			if(rowCount==1){
				System.out.printf("%"+brickSize+"s", "");
				System.out.printf("%"+brickSize+"d", rowCount);
			}
			else{
			//prints out the front row
				for(int frontPyrBrick=1; frontPyrBrick<=rowCount; frontPyrBrick++){
					System.out.printf("%"+brickSize+"d", frontPyrBrick);
					System.out.printf("%"+brickSize+"s", "");
				}
			//prints out the back of the row, so long as it is not the top of the pyramid
				for(int backPryBrick=rowCount; backPryBrick>0; backPryBrick--){
					System.out.printf("%"+brickSize+"d", backPryBrick);
					System.out.printf("%"+brickSize+"s", "");
				}
			}
			System.out.printf("%1s", "\n");
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
