//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat[0][0]="X";
		mat[0][1]="X";
		mat[0][2]="X";
		mat[1][0]="O";
		mat[1][1]="O";
		mat[1][2]="X";
		mat[2][0]="O";
		mat[2][1]="X";
		mat[2][1]="O";

	}

	public TicTacToe(String game)
	{
		int letter=0;
		for(int row=0; row<mat.length; row++)
		 for(int col=0; col<mat[row].length; col++)
		  mat[row][col]=game.charAt(letter);
		  letter++;


	}

	public String getWinner()
	{
		int X=0;
		int O=0;
		if(mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2] && mat[0][0]=="O")
			O++;
		else if(mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2] && mat[0][0]=="X")
		 	X++;
		else if(mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0] && mat[0][0]=="O")
			O++;
		else if(mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0] && mat[0][0]=="X")
			X++;
		else if(mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2] && mat[1][0]=="X")
			X++;
		else if(mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2] && mat[1][0]=="O")
			O++;
		else if(mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1] && mat[1][1]=="X")
			X++;
		else if(mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1] && mat[1][1]=="O")
			O++;
		else if(mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2] && mat[1][2]=="O")
			O++;
		else if(mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2] && mat[1][2]=="X")
			X++;
		else if(mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2] && mat[2][2]=="O")
			O++;	
		else if(mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2] && mat[2][2]=="X")
			X++;			

		else
			return "Cat wins";

				






		if(x>1)
		 return "X wins";
		if(O>1)
		 return "O wins";


		return "";
	}

	public String toString()
	{
		String output="";
	for(int row=0; row<mat.length; row++)
	{
		 for(int col=0; col<mat[row].length; col++)
		 {
		 System.out.print(mat[row][col]);
		 }
		 System.out.print("\n");
	}



		return output+"\n\n";
	}
}