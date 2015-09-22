//James Roesemann
//HW3 Question1
// nQueens
// the purpose of this program is to rcive a numerical number less then(find out that number)
//that will represent the number of queens on the board. the program will processs all possible board configurations, 
// so, will print out if the configuration is aceptable, and record the number of aceptable configuraaitons.
// now i need to figure out the most eficent way of generating the queens based on the number input.

import java.util.*;

public class nQueen{

	public static void main(String[] args){
	nQueen Go = new nQueen();
	Go.go();
	}
	
	void go(){
	//array representing the board
		Piece[][] chessBoard = new Piece[8][8];
		//testing nisize, reset to 8
		int nSize=8;
		createBoard(chessBoard, nSize);
		testIfSafe(chessBoard, nSize);
		setBoard(chessBoard);
		
		//testing
		/*
		swap(chessBoard, 0, 0, 1, 3);
		testIfSafe(chessBoard, nSize);
		setBoard(chessBoard);*/
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
	//void setQueens(){
	// this method will eventually populate the board with the next seqence of queens. by initiall populating the board with n number of queens in a sequential row. .it then moves the queens acordingly
	// initlization is now done in anohter method, will shivt values after tthe pieces are tested.

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
	boolean safeHorizontal(Piece[][] board, int rowA, int colA){
		board[rowA][colA].safe=true;
			// if the piece is on the edge
		if(colA==0 || colA==7) return true;
			//if you have a piece that is on each oppisite side
		if(board[rowA][colA-1].pieceName=="Q" && board[rowA][colA+1].pieceName=="Q") return true;
		// else if there is any other piece in your path you are not safe
		for(int i=0; i<8; i++){
			if(board[rowA][i].pieceName=="Q" && i!=colA){
				board[rowA][colA].safe=false;
				return false;
			}
		}
		return true;
	}
	boolean safeVertical(Piece[][] board,  int row, int col){
		board[row][col].safe=true;
		if(row==0 || row==7) return true;
		if(board[row-1][col].pieceName=="Q" && board[row+1][col].pieceName=="Q") return true;
		for(int i=0; i<8; i++){
			if(board[i][col].pieceName=="Q" && i!=row){
				board[row][col].safe=false;
				return false;
			}
		}
		return true;
	}
	boolean safeDiagnal(Piece[][] board, int row, int col){
		board[row][col].safe=true;
		//ill need to incase each in a (if your not in the corner) before they bother running the loop.
		int currentRow = row-1, currentCol=col-1;
		//if in a corner
		if(row==0 && col==0 || row==7 && col==0 || row==7 && col==7 || row==0 && col==7){
			return true;
		}
		//if surounded( first testing if on an edge)
		if(row!=0 && row!=7 && col!=0 && col!=7){
			if(board[row-1][col-1].pieceName=="Q" && board[row+1][col-1].pieceName=="Q" && board[row-1][col+1].pieceName=="Q" && board[row+1][col+1].pieceName=="Q") return true;
		}
		//i'm doing it this way because i don't know where the orignal point is so i can't just stat in the corner. i'd have to do a loop to get ot the edge anyway so i might as well check
		//check left up 
		while(currentRow>=0 && currentCol>=0){
			if(board[currentRow][currentCol].pieceName=="Q"){
				board[row][col].safe=false;
				return false;
			}
			currentRow--; currentCol--;
		}
		//check right down
		currentRow=row+1; currentCol=col+1;
		while(currentRow>=7 && currentCol>=7){
			if(board[currentRow][currentCol].pieceName=="Q"){
				board[row][col].safe=false;
				return false;
			}
			currentRow++; currentCol++;
		}
		//check left down
		currentRow=row+1; currentCol=col-1;
		while(currentRow<=7 && currentCol>=0){
			if(board[currentRow][currentCol].pieceName=="Q"){
				board[row][col].safe=false;
				return false;
			}
			currentRow++; currentCol--;
		}
		//check right up
		currentRow=row-1; currentCol=col+1;
		while(currentRow>=0 && currentCol<=7){
			if(board[currentRow][currentCol].pieceName=="Q"){
				board[row][col].safe=false;
				return false;
			}
			currentRow--; currentCol++;
		}
		return true;
	}
	void testIfSafe(Piece[][] board, int numSize){
		int queenCount=0; //will eventually equal numSize when i put it in later
		boolean safeQueen=true;
		tooManyQueens:
		for(int i =0; i<8; i++){
			for (int j=0; j<8; j++){
				if(board[i][j].pieceName=="Q"){
					safeQueen=safeHorizontal(board, i, j);
					safeQueen=safeVertical(board, i, j);
					safeQueen=safeDiagnal(board, i, j);
					if(safeQueen==false){
						System.out.println("the queen at row "+i+" collumn "+j+" is not safe.");
						return;
					}
					queenCount++;
				}
				if(queenCount==numSize) break tooManyQueens;
			}
		}
	}
}
