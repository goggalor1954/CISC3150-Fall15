// James Roesemann
//HW2 Question3
// wow, this one was so much easier then the first two questions.

import java.util.*;

 public class CheckPalindrome{
	public static void main(String args[]){
		CheckPalindrome Go = new CheckPalindrome();
		Go.go();
	}
	
	void go(){
	System.out.println("Please enter a word. Capitlization counts when checking for Palindromes.");
	Scanner readIn = new Scanner(System.in);
		checkBackFront(readIn.next());
	}

	void checkBackFront( String inString){
		StringBuilder revString = new StringBuilder(inString);
		String change="";
		//takes inString, reverses it, converts it to a string and compares its value to the value of instring.
		if(revString.reverse().toString().equals(inString)==false){
			change="not ";
		}
		System.out.println("The Word is "+ change + "a palindrome.");
		// I added this part to show what the  string looks like reversed. also, aparently .reverse() will reverse the order of the StringBuilder, not just return a value equal to it reversed. good to know.
		System.out.println(inString+"\n"+revString.toString());
	}
}	
