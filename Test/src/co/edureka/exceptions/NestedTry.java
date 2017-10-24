package co.edureka.exceptions;

import java.util.Scanner;

public class NestedTry {
	
	public void divNum(int a, int b)
	{
		try
		{
		int res = a/b;
		System.out.println("Result = "+ res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled by inner try catch : "+e.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NestedTry obj = new NestedTry();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try
        {
        obj.divNum(num1, num2);
        }
        catch(Exception e)
        {
        	System.out.println("Exception handled by outer catch : "+ e.toString() );
        }
        System.out.println("Application executed");
        
	}

}
