//James Roesemann
//HW3 Question1
// nQueens
// the purpose of this program is to rcive a numerical number less then(find out that number)
//that will represent the number of queens on the board. the program will processs all possible board configurations, 
// so, will print out if the configuration is aceptable, and record the number of aceptable configuraaitons.
// now i need to figure out a way to pass it an array.

import java.util.*;

public class nQueen{

	public static void main(String[] args){
	nQueen Go = new nQueen();
	Go.go();
	}
	
	void go(){
	//testing array
	String chessBoard[][] = new String[8][8];
	setQueens(chessBoard);
	setBoard(chessBoard);
	
	}
	
	//this method will print the top/bottom boarder of the board
	void chessEdge(){
		for(int i=0; i<8; i++){
			System.out.printf("%s", "----");
		}
		System.out.printf("%s","-\n");
	}
	//this method prints out the boxs of the chess board.(will get passed some variable later to print queens)
	void chessBox(String[][] board){
		for (int row=0; row<8; row++){
			for(int collumn=0; collumn<8; collumn++){
				System.out.printf("%s", "| "+board[row][collumn]+" ");
			}
		}
		System.out.printf("%s", "|\n");
	}
	//method that prints the chess board using methods chessEdge and chessBox
	void setBoard(String[][] board){
		for(int i=0; i<8; i++){
			chessEdge();
			chessBox(board);
		}
		chessEdge();
	}
	// this method will eventually populate the board with the next seqence of queens/ just testing that i can populate for now.
	void setQueens(String[][] board){
		for(int row=0; row<board.length; row++){
			for( int collumn=0; collumn< board.length; collumn++){
				if(row==collumn){
					board[row][collumn]="Q";
				}
				else board[row][collumn]=" ";
			}
		}
	}
}