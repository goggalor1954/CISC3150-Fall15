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
		//number of queens on the board.
		int nSize=8;
		//array representing the board
		String[][] chessBoard = new String[8][8];
		createBoard(chessBoard, nSize);
		//testIfSafe(chessBoard, nSize);
		//setBoard(chessBoard);
		
		//testing
		moveLastQueen(chessBoard, 0, 7);
		moveLastQueen(chessBoard, 0, 6);
		/*
		swap(chessBoard, 0, 0, 1, 3);
		testIfSafe(chessBoard, nSize);
		setBoard(chessBoard);*/
	}
	// denotes  piece on the board, will be used of either queens or blank spaces
	//dont think i need this class anymore, im going to comment uit out for now
	/*
	class Piece{
		String pieceName;
		boolean safe;
	}*/
	
	//this method will print the top/bottom boarder of the board
	void chessEdge(){
		for(int i=0; i<8; i++){
			System.out.printf("%s", "----");
		}
		System.out.printf("%s","-\n");
	}
	//this method prints out the boxs of the chess board. it is given the array for the board and and in that represents the current row.
	void chessBox(String[][] board, int row){
		for (int collumn=0; collumn<8; collumn++){
				System.out.printf("%s", "| "+board[row][collumn]+" ");
		}
		System.out.printf("%s", "|\n");
	}
	//method that prints the chess board using methods chessEdge and chessBox. it is passed the array representing he board layout.
	void setBoard(String[][] board){
		for(int i=0; i<8; i++){
			chessEdge();
			chessBox(board, i);
		}
		chessEdge();
	}
	//void setQueens(){
	// this method will eventually populate the board with the next seqence of queens. by initiall populating the board with n number of queens in a sequential row. .it then moves the queens acordingly
	// initlization is now done in anohter method, will shivt values after tthe pieces are tested.

	void swap(String[][] board, int rowA, int colA, int rowB, int colB ){
		String temp;
		temp=board[rowA][colA]; 
		board[rowA][colA]=board[rowB][colB]; 
		board[rowB][colB]=temp;
	}
	void createBoard(String[][] board, int nSize){
		int row=0, collumn=0;
		int nQueens=0;
		String boxVal;
		for(int i=0; i<64; i++){
			if(nQueens<nSize){ 
				boxVal="Q";
				nQueens++;
			}
			else boxVal=" ";
			//dont know if i need this part now that its not an array of objects
			board[row][collumn]=new String();
			board[row][collumn]=boxVal;
			collumn++;
			if(collumn==8){
				row++; collumn=0;
			}
		}
	}
	boolean safeHorizontal(String[][] board, int rowA, int colA){
			// if the piece is on the edge
		if(colA==0 || colA==7) return true;
			//if you have a piece that is on each oppisite side
		if(board[rowA][colA-1]=="Q" && board[rowA][colA+1]=="Q") return true;
		// else if there is any other piece in your path you are not safe
		for(int i=0; i<8; i++){
			if(board[rowA][i]=="Q" && i!=colA){
				return false;
			}
		}
		return true;
	}
	boolean safeVertical(String[][] board,  int row, int col){
		if(row==0 || row==7) return true;
		if(board[row-1][col]=="Q" && board[row+1][col]=="Q") return true;
		for(int i=0; i<8; i++){
			if(board[i][col]=="Q" && i!=row){
				return false;
			}
		}
		return true;
	}
	boolean safeDiagnal(String[][] board, int row, int col){
		//ill need to incase each in a (if your not in the corner) before they bother running the loop.
		int currentRow = row-1, currentCol=col-1;
		//if in a corner
		if(row==0 && col==0 || row==7 && col==0 || row==7 && col==7 || row==0 && col==7){
			return true;
		}
		//if surounded( first testing if on an edge)
		if(row!=0 && row!=7 && col!=0 && col!=7){
			if(board[row-1][col-1]=="Q" && board[row+1][col-1]=="Q" && board[row-1][col+1]=="Q" && board[row+1][col+1]=="Q") return true;
		}
		//i'm doing it this way because i don't know where the orignal point is so i can't just stat in the corner. i'd have to do a loop to get ot the edge anyway so i might as well check
		//check left up 
		while(currentRow>=0 && currentCol>=0){
			if(board[currentRow][currentCol]=="Q"){
				return false;
			}
			currentRow--; currentCol--;
		}
		//check right down
		currentRow=row+1; currentCol=col+1;
		while(currentRow>=7 && currentCol>=7){
			if(board[currentRow][currentCol]=="Q"){
				return false;
			}
			currentRow++; currentCol++;
		}
		//check left down
		currentRow=row+1; currentCol=col-1;
		while(currentRow<=7 && currentCol>=0){
			if(board[currentRow][currentCol]=="Q"){
				return false;
			}
			currentRow++; currentCol--;
		}
		//check right up
		currentRow=row-1; currentCol=col+1;
		while(currentRow>=0 && currentCol<=7){
			if(board[currentRow][currentCol]=="Q"){
				return false;
			}
			currentRow--; currentCol++;
		}
		return true;
	}
	void testIfSafe(String[][] board, int numSize){
		int queenCount=0; //will eventually equal numSize when i put it in later
		boolean safeQueen=true;
		tooManyQueens:
		for(int i =0; i<8; i++){
			for (int j=0; j<8; j++){
				if(board[i][j]=="Q"){
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
	/*
	void moveQueens(String[][] board){
	// move the last piece untill it gets to the end or runs into another piece. then reset and move the last 2 pieces once, then the last pieceuntill the end, then the piece before that untill it reaches the las piece. reset and move the last 3 pieces and so on.
		int queenStage=0, curQueenRow=0, currQueenCol=0;
		//set stage;
		for(int row=7; row>=0; row--){
			for(int collumn=7; collum>=0){
				if(board[row][collumn]=="Q"){
					//set which queen to move
					if(collUm-queenStage<0){
					}
					else{
					}
			
	}*/

	//then there will be antoher method to reset the queens, i can probably use this to reset a row as well when the time comes
	//then i will have a mothod that moves base case which then calls the mthosd to move the last queen untill each queen tin the seklection reaches its end.
	//also keep in mind that within each of these moves the new board must then be tested.
	//moves the last queen in a selection , untill it reaches the end of the chess board or another queen.
	void moveLastQueen(String[][] board, int row, int col){
		//while the current queen is not in the last position and the next spot down the line does not ocntain a queen.
		while(row!=7 && col!=7 || row<7 && col==7 && board[row+1][0]!="Q" || col!=7 && board[row][col+1]!="Q"){
			if(col==7 && row!=7){
				swap(board, row, col, row+1, 0);
				row=row+1;
				col=0;
			}
			else{
				swap(board, row, col, row, col+1); 
				col++;
			}
		}
	}
	// passed the board, a selected position, and the number of queens, and moves that selection over one, allows moveLastQueen untill all of them have been moved to the end, then resets then swaps the queens on the end with a position over 1 further, untill the selection is swaping with itself, then resets tyhe board to what it was given. 
	void moveSelectedQueens(String[][] board, int row, int col, int numQueens){
		int currentRow=row, currentCol=col;
		while(currentRow!=7 && currentRow+row<7){
			
}
