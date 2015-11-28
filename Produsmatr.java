import java.io.*;
import java.util.Scanner;

public class Produsmatr {
	
	public static void main(String[] args)throws IOException {
	
		FileReader in = new FileReader("in.txt");
		FileWriter out = new FileWriter("out.txt");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Introduceti numarul de linii si numarul de coloane:");
		int n = input.nextInt();
		int m = input.nextInt();
		int [][]a = new int[m][n];
		
		//read matrix from keyboard
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				a[i][j] = input.nextInt();
		
		//print matrix
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++)
				System.out.println(a[i][j] + "  ");
	
		}
	}
	
	public static int[][] ReadMatr(String filename)throws Exception
	{
		File inFile = new File(filename);
		Scanner in = new Scanner(inFile);
		
		int intlenght = 0;
		String[] length = in.nextLine().trim().split("\\s+");
		
		for(int i = 0; i < length.length(); i++)
		{
			intlenght++;
		}
		
		
		
	}
}
