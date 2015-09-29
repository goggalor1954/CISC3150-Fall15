//James Roesemann
//HW4 Question1

//this is a verion of the string class, MyString class.
//it is an imutible object that should have all the functionality of the regular string class.



public final class MyString{
	//primative data types
	private final char head;
	//private final int sizeOf;
	private final MyString tail;
	
	//default constructor
	public MyString(){
		tail=null;
		head='\0';
		//sizeOf=-1;
	}
	// creates a default end of MyString
	public MyString( char newHead, MyString oldList){
		this.tail=oldList;
		this.head=newHead;
		//this.sizeOf=oldList.getSizeOf()+1;
	}
	// creates a new string character, may not need this
	/**
	public MyString( char newHead, MyString oldList, int arrSize){
		this.tail=oldList;
		this.head=newHead;

	}
	//creates a MYString object when a MyString objuect is passed, testing
	public MyString( MyString passedString){
		this(passedString);
	}**/
	

	//creates a MyString from a single character
	public MyString( char newHead){
		//MyString newMyString = new MyString();
		this.tail=new MyString();
		this.head=newHead;
		//this.sizeOf=0;
	}
	//creates a MyString from an array of characters
	public MyString(char[] chars){
		MyString newMyString = new MyString();
		newMyString=createMyString(chars, new MyString(), chars.length);
		this.tail=newMyString.getTail();
		this.head=newMyString.getHead();
		//this.sizeOf=newMyString.getSizeOf();
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
	//*********rember to put some kind of out of bounds error here*********
	public char charAt(int index){
		return charAtIndex( index, this);
	}
		
	//loops through MyString untill it finds the index, returns that char, companion to charAt
	public char charAtIndex(int index, MyString nextTail){
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


	//returns primative values
	public char getHead(){
		return head;
	}
	//public int getSizeOf(){
	//	return sizeOf;
	//}
	public MyString getTail(){
		return tail;
	}
}
 