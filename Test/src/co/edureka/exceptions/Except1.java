package co.edureka.exceptions;

public class Except1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a = Integer.parseInt("10");
			try
			{
				
				int b = Integer.parseInt(args[1]);
				int c = a/b;
				System.out.println(c);	
			}
			catch(ArithmeticException e)
			{
				System.out.println("cannot divide by zero");
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter valid integer " +e.toString());
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter value: " +e.toString());
		}
		
		System.out.println("Exception handled");
		
		
	/* try
		{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println(c);
		
		}*/
		/*catch(ArithmeticException e)
		{
			System.out.println("Cant divided ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide 2 values ");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please provide integers");
		}*/
		/*catch(Exception e)
		{
			System.out.println("Exception occured");
			System.out.println("Message: "+e.getMessage());
			System.out.println(e.toString());
			//e.printStackTrace();
		}
		System.out.println("executed");*/
		
		
	} 
	

}
