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
	//method that prints the "bricks" of the pyramid.
	void printPry(int numVal){
		String brickSize="1";
		//loop to print each row, starts out printing spaces, then moves to an inner loop that prints the numbers.
		for(int rowCount=1; rowCount<=numVal; rowCount++){
			//prints out space
			for(int blankSpace=0; blankSpace<(numVal-rowCount)*2; blankSpace++){
				System.out.printf("%"+1+"s", "");
			}
			//prints the top brick
			if(rowCount==1){
				System.out.printf("%"+brickSize+"d", rowCount);
			}
			else{
			//prints out the front row
				for(int frontPyrBrick=1; frontPyrBrick<=rowCount; frontPyrBrick++){
					System.out.printf("%"+brickSize+"d", frontPyrBrick);
					System.out.printf("%"+brickSize+"s", "");
				}
			//prints out the back of the row, so long as it is not the top of the pyramid
				for(int backPryBrick=rowCount-1; backPryBrick>0; backPryBrick--){
					System.out.printf("%"+brickSize+"d", backPryBrick);
					System.out.printf("%"+brickSize+"s", "");
				}
			}
			System.out.printf("%1s", "\n");
		}
	}





	void go(){
	printPry(askNum());
	}
	public static void main(String args[]){
	PyramidBuild Go = new PyramidBuild();
	Go.go();
	}
}	
