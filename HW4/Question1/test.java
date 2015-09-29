import java.util.*;


public class test {

	public static void main(String[] args){
		test Go = new test();
		Go.go();
	}

	void go(){
		char[] testChars = {'d', 'o', 'n', 'n', 'a'};
		MyString testString = new MyString(testChars);


		//System.out.println(testString.length());
		MyString testSubstring=testString.substring(1, 3);
		printChars(testSubstring);
	
	}	
	void printChars( MyString newMyString){
		if( newMyString.getTail()==null) return;

		System.out.println(newMyString.getHead());
		printChars(newMyString.getTail());
	}
}

