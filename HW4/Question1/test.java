import java.util.*;


public class test {

	public static void main(String[] args){
		test Go = new test();
		Go.go();
	}

	void go(){
		char[] testChars = {'D', 'O', 'n', 'N', 'a'};
		//char[] otherTestChars={'K','e','l','S','O'};
		//char[] otherTestChars={'D', 'O', 'n', 'N'};
		MyString testString = new MyString(testChars);
		//MyString otherTestString = new MyString(otherTestChars);

		//System.out.println(testString.length());
		//MyString testSubstring=testString.substring(1, 3);

		//printChars(testString.toUpperCase());
		//System.out.println(testString.equals(otherTestString));

		char[] otherTestChar=testString.getMyString();
		printArr(otherTestChar);
	}	
	void printChars( MyString newMyString){
		if( newMyString.getTail()==null) return;

		System.out.println(newMyString.getHead());
		printChars(newMyString.getTail());
	}
	void printArr( char[] charArr){
		for(int i=0; i< charArr.length; i++){
			System.out.printf("%c",charArr[i]);
		}
		System.out.printf("\n");
	}
}

