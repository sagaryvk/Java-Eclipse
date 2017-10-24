package co.edureka.exceptions;

import java.util.Scanner;

public class ThrowsException {
	
	public void voteEligibilty(int age)
	{
		try
		{
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
		throw new Exception("You need to be at age 10 to attain eligibilty");	
		}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ThrowsException obj = new ThrowsException();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		obj.voteEligibilty(age);
		/*try
		{
			int a = 250;
			int b = 2;
			if(b==0)
			{
				throw new Exception("No zero in denominator is accepted ");
			}
			int c = a/b;
			System.out.println("result: "+ c);
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
*/
}
}
