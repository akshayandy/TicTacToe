import java.util.Scanner;
public class TicTacToe {
	public static void main(String[] args) {
		System.out.println("Enter the size of the game");
		Scanner size = new Scanner(System.in);
		int n = size.nextInt();
		int[][]board=new int[n][n];
		Scanner sc = new Scanner(System.in);
		int player=1;
		int winner=0;
		while(winner==0)
		{
			System.out.println("player"+player+" ,it's your turn");
			System.out.println("enter row");
			int row=sc.nextInt();
			System.out.println("enter column");
			int col=sc.nextInt();
			if(board[row][col]==0)
				board[row][col]=player;
			else
			{
				System.out.println("place already occupied..!");
				continue;
			}
			printBoard(board);
			int rowScore=0,colScore=0,diagScore=0,crossDiagScore=0;
			for(int i=0;i<board[0].length;i++)
			{
				if(board[row][i]==player)
					rowScore++;
			}
			for(int i=0;i<board.length;i++)
			{
				if(board[i][col]==player)
					colScore++;
			}
			for(int i=0,j=0;i<board.length && j<board[0].length;i++,j++)
			{
				if(board[i][j]==player)
					diagScore++;
		}
			for(int i=0,j=board[0].length-1;i<board.length && j>0;i++,j--)
			{
				if(board[i][j]==player)
					crossDiagScore++;
			}
			if(rowScore==n || colScore==n || diagScore==n || crossDiagScore==n)
			{
				winner=player;
				System.out.println("winner is "+player);
			}
			else
			{
				if(player==1)
					player=-1;
				else
					player=1;
			}
			}
			}
	private static void printBoard(int[][] board) {
		for(int i=0;i<board.length;i++) 
		{
			for(int j=0;j<board[0].length;j++) 
			{
				System.out.print(board[i][j]+" ");
			}
		System.out.println(" ");
		}
	}
}