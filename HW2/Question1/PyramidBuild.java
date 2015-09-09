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
	void printPry(int numVal){
		String pyrFrontStack="", pyrBackStack="\n";
		String formating="%"+(numVal*2)+"s";
		//this loop generates each layer of the pyramid
		for(int i=1; i<=numVal; i++){
			//asignes new value to the back for front stack, prints out front and back stack, adds the cuvent value of i to the front of the back stack.
			pyrFrontStack=pyrFrontStack+i+" ";
			System.out.printf(formating,pyrFrontStack);
			System.out.print(pyrBackStack);
			// still dont quit understant how to format printf corectly
			pyrBackStack=i+" "+pyrBackStack;
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
