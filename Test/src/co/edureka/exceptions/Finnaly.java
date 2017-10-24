package co.edureka.exceptions;

import java.util.Scanner;

public class Finnaly {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		try
		{
		int div = a/b;
		System.out.println("Result = "+div);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
		System.out.println("The application ");
		System.out.println("is executed ");
		}
		System.out.println("Sucessfully ");
	}
}
