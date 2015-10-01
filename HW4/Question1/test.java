import java.util.*;


//the purpose of this class is to test the methods of the MyString class
public class test {

	public static void main(String[] args){
		test Go = new test();
		Go.go();
	}

	void go(){
		char[] testChars = {'D', 'O', 'n', 'N', 'a'};
		char[] otherTestChars={'K','e','l','S','O'};
		//creates a new MyString 
		MyString testString = new MyString(testChars);
		MyString otherTestString = new MyString(otherTestChars);
		printChars(testString);
		//returns the character at position
		System.out.println("position "+3+" "+testString.charAt(3));
		//returns the length of the MyString
		System.out.println(testString.length());
		//returns a substring in MyString format;
		printChars(testString.substring(2, 4));
		//returns a version of the MyString with all lowercase letters
		printChars(testString.toLowerCase());
		//returns a version of the string with all upercase letters
		printChars(testString.toUpperCase());
		//returns true if the tow myStrings are the same and false if otherwise
		System.out.println(testString.equals(otherTestString));
		System.out.println(testString.equals(testString));
		//im not sure what this one was ment ot be. I thought it might have been based off the getChar() methos from the char class? I'm not sure. I did this one prettty late wedensday and didn't have time to ask. this method returns and array of chars from the MyString object		 
		printArr( testString.getMyString());
		//returns a string composed of the emements of the MyString
		System.out.println(otherTestString.toString());
		//converts an interger value into a MyString;
		printChars(MyString.valueOf(8675309));		
	}	
	//prints out the MyString object ofr testing purposes. 
	void printChars( MyString newMyString){
		if( newMyString.getTail()==null){
			System.out.printf("\n");
			return;
		}
		System.out.printf("%c", newMyString.getHead());
		printChars(newMyString.getTail());
	}
	//prints out an array for testing purposes
	void printArr( char[] charArr){
		for(int i=0; i< charArr.length; i++){
			System.out.printf("%c",charArr[i]);
		}
		System.out.printf("\n");
	}
}

