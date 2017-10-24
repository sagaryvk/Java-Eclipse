package co.edureka.exceptions;

public class TestClass {
	public static void main(String[] args) {

//InvalidPfException obj = new InvalidPfException();
int pf = 1;
try
{
	if(pf<10||pf>12)
	{
		throw new InvalidPfException("PF value should be between 10 and 13");
	}
	else
	{
		System.out.println("Vaild PF");
	}
	}
catch(Exception e)
{
	System.out.println(e.toString());
	}
	}
}
