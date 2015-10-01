//James Roesemann
//HW4 Question1

//this is a verion of the string class, MyString class.
//it is an imutible object that should have all the functionality of the regular string class.

import java.math.*;
import java.lang.*;

public final class MyString{
	//primative data types
	private final char head;
	//private final int sizeOf;
	private final MyString tail;
	
	//default constructor
	// i may need to set this to private later
	public MyString(){
		tail=null;
		head='\0';
	}
	// creates a default end of MyString
	public MyString( char newHead, MyString oldList){
		this.tail=oldList;
		this.head=newHead;
	}
	//creates a MyString from a single character
	public MyString( char newHead){
		this.tail=new MyString();
		this.head=newHead;
	}
	//creates a MyString from an array of characters
	public MyString(char[] chars){
		MyString newMyString = new MyString();
		newMyString=createMyString(chars, new MyString(), chars.length);
		this.tail=newMyString.getTail();
		this.head=newMyString.getHead();
	}
	//method that creates a MyString from an array of characters
	public MyString createMyString(char[] chars, MyString oldList, int charLeft){
		if (charLeft==0){
			return oldList;
		}
		MyString newMyString = new MyString(chars[charLeft-1], oldList);
		newMyString=createMyString(chars, newMyString, charLeft-1);
		return newMyString;
	}
	//returns the character at the position
	public char charAt(int index){
		if(index<0) throw new ArrayIndexOutOfBoundsException(index);
		return charAtIndex( index, this);
	}
		
	//loops through MyString untill it finds the index, returns that char, companion to charAt
	public char charAtIndex(int index, MyString nextTail){
		if(index>0 && nextTail.getTail()==null) throw new ArrayIndexOutOfBoundsException(index);
		if(0==index) return nextTail.getHead();
		return charAtIndex(index-1, nextTail.getTail());
	}
	//returns the length
	public int length(){
		return lengthIter(this);
	}
	//iterates the char MyString untill it reaches the end, returns the length
	public int lengthIter(MyString newTail){
		if (newTail.getTail()==null) return 0;
		return 1+lengthIter(newTail.getTail());
	}
	//prints out the substring
	public MyString substring( int begin, int end){
		return subStringIter( begin, end, this, 0);
	}
	//iterates through the Mystring print out the subString
	public MyString subStringIter(int begin, int end, MyString oldTail, int curIndex){
		if(curIndex==end) return new MyString(oldTail.getHead());
		if(curIndex>=begin) return new MyString(oldTail.getHead(), subStringIter( begin, end, oldTail.getTail(), curIndex+1));
		return subStringIter( begin, end, oldTail.getTail(), curIndex+1);
	}
	//returns a version of the current mystring object where all the characters are lower case
	public MyString toLowerCase(){
		return toLowerIter( this);
	}
	//iterates through the string untill the end ,replaceing the MyString objects with upper case objects to lowercase obcects
	public MyString toLowerIter(MyString nextTail){
		if(nextTail.getTail()==null) return nextTail;
		if(nextTail.getHead()>='A' && nextTail.getHead()<='Z'){
			int changeVal=(int)nextTail.getHead()+32;
			return new MyString ((char)changeVal, toLowerIter(nextTail.getTail()));
		}
		return new MyString( nextTail.getHead(), toLowerIter(nextTail.getTail()));
	}
	//returns a version of the current mystring object where all the characters are uppercase 
	public MyString toUpperCase(){
		return toUpperIter( this);
	}
	//iterates through the string untill the end ,replaceing the MyString objects with lower case characters to upper case characters
	public MyString toUpperIter(MyString nextTail){
		if(nextTail.getTail()==null) return nextTail;
		if(nextTail.getHead()>='a' && nextTail.getHead()<='z'){
			int changeVal=(int)nextTail.getHead()-32;
			return new MyString ((char)changeVal, toUpperIter(nextTail.getTail()));
		}
		return new MyString( nextTail.getHead(), toUpperIter(nextTail.getTail()));
	}
	//boolean that returens true if all the characters in the MyStringare the same
	public boolean equals(MyString s){
		return equalsIter(this, s);
	}
	//iteratesthrough the MyStrings untill the end or a diffrent character is detected, returns the apropriate boolean value
	public boolean equalsIter( MyString orignal, MyString other){
		if(orignal.getHead()==other.getHead() && orignal.getTail()==null && other.getTail()==null) return true;
		if(orignal.getHead()!=other.getHead()) return false;
		return equalsIter(orignal.getTail(), other.getTail());
	}	
	// i missed class last week i'm not sure what getMyString() is saposed to be. i'm working under the asumption that it's saposed to be like getChars in the java string class so i'll be basing this next method off of that.
	public char[] getMyString(){
		return getMyStringIter(this, 0);
	}
	//iterates through the MyString, when it reaches the end it creates ana array of the apropriate sise and stick in the characters from the back recursivly, it ises the cound variable to determine how large to make the array.
	public char[] getMyStringIter(MyString myStrObj, int count){
		if( myStrObj.getTail()==null){
			char[] myStrArr = new char[count+1];
			myStrArr[count]=myStrObj.getHead();
			return myStrArr;
		}
		char[] myStrArr = getMyStringIter(myStrObj.getTail(), count+1);
		myStrArr[count]=myStrObj.getHead();
		return myStrArr;
	}
	//returns the string value of the the myString object
	public String toString(){
		return toStringIter(this);
	}
	//iterates through the MyString object untill the end, returning the string values the characters of theMyString object
	public String toStringIter(MyString myStrObj){
		if( myStrObj.getTail()==null) return new String()+myStrObj.getHead();
		return new String(myStrObj.getHead()+toStringIter(myStrObj.getTail()));
	}
	//returns a MyString made from the interger value that was input 
	public static MyString valueOf( int i){
		 //returns a character array, in the proper order, from the given integer
		int numSize = (int)Math.log10(Math.abs(i))+1;
		char[] myIntArr = valueOfIter((Math.abs(i)), new char[numSize], 0);
		if(i>=0){
			return new MyString(myIntArr);
		}
		return new MyString('-', new MyString(myIntArr));
	}
		//iterates through the integer, adding the first digit to its apropriate place in the array
	static public char[] valueOfIter(int i, char[] charArr, int count){
		if(count==charArr.length-1){
			charArr[0]=(char)(i+'0');
			return charArr;		
		}
		charArr[charArr.length-1-count]=((char)(i%10+'0'));
		return valueOfIter(i/10, charArr, count+1);
	}


	//returns primative values
	public char getHead(){
		return head;
	}
	public MyString getTail(){
		return tail;
	}
}
 
