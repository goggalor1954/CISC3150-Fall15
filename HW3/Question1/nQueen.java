//James Roesemann
//HW3 Question1
// nQueens
// the purpose of this program is to rcive a numerical number less then(find out that number)
//that will represent the number of queens on the board. the program will processs all possible board configurations, 
// so, will print out if the configuration is aceptable, and record the number of aceptable configuraaitons.
// now i need to figure out the most eficent way of generating the queens based on the number input.
// a swap function woulf be good as there will always be the same amount of queens and spaces.
//i think i may need to crate a chess piece object to i can tell if it's safe or not. maybe not.

import java.util.*;

public class nQueen{

	public static void main(String[] args){
	nQueen Go = new nQueen();
	Go.go();
	}
	
	void go(){
	//array representing the board
	Piece[][] chessBoard = new Piece[8][8];
	int nSize=8;
	createBoard(chessBoard, nSize);
	//setQueens(chessBoard, nSize);
	//setBoard(chessBoard);


	setBoard(chessBoard);
	}
	// denotes  piece on the board, will be used of either queens or blank spaces
	class Piece{
		String pieceName;
		boolean safe;
	}
	
	//this method will print the top/bottom boarder of the board
	void chessEdge(){
		for(int i=0; i<8; i++){
			System.out.printf("%s", "----");
		}
		System.out.printf("%s","-\n");
	}
	//this method prints out the boxs of the chess board. it is given the array for the board and and in that represents the current row.
	void chessBox(Piece[][] board, int row){
		for (int collumn=0; collumn<8; collumn++){
				System.out.printf("%s", "| "+board[row][collumn].pieceName+" ");
		}
		System.out.printf("%s", "|\n");
	}
	//method that prints the chess board using methods chessEdge and chessBox. it is passed the array representing he board layout.
	void setBoard(Piece[][] board){
		for(int i=0; i<8; i++){
			chessEdge();
			chessBox(board, i);
		}
		chessEdge();
	}
	// this method will eventually populate the board with the next seqence of queens. by initiall populating the board with n number of queens in a sequential row. .it then moves the queens acordingly
	// initlization is now done in anohter method, will shivt values after tthe pieces are tested.
		}
	}*/
	void swap(Piece[][] board, int rowA, int colA, int rowB, int colB ){
		String temp;
		temp=board[rowA][colA].pieceName; 
		board[rowA][colA].pieceName=board[rowB][colB].pieceName; 
		board[rowB][colB].pieceName=temp;
	}
	void createBoard(Piece[][] board, int nSize){
		int row=0, collumn=0;
		int nQueens=0;
		String boxVal;
		for(int i=0; i<64; i++){
			if(nQueens<nSize){ 
				boxVal="Q";
				nQueens++;
			}
			else boxVal=" ";
			board[row][collumn]=new Piece();
			board[row][collumn].pieceName=boxVal;
			collumn++;
			if(collumn==8){
				row++; collumn=0;
			}
		}
	}
}