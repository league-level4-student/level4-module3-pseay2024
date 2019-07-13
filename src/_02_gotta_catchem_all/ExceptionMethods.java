package _02_gotta_catchem_all;

public class ExceptionMethods {
	//2. In the ExceptionMethods class, write a method called divide that takes
		//   two doubles as parameters and returns their quotient as a double. This method 
		//   should throw an IllegalArgumentException if the denominator is 0.0.
	public double divide(double a, double b) throws IllegalArgumentException
	{
		if (b == 0.0) throw new IllegalArgumentException();
		return a/b;
	}
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
		//   String and returns the reverse of that String. It should throw an IllegalStateException
		//   if the String passed in is empty
	public String reverseString (String s) throws IllegalStateException
	{
		if (s == "") throw new IllegalStateException();
		return new StringBuilder(s).reverse().toString();
	}
}
