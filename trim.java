package string;

public class trim 
{
	public static void main(String[] args) 
	{
		// Java Tutorials for Beginners - How to Use of trim() method with Strings
		int len;
		String s=" Harshad Patel";
		len=s.length();
		System.out.println("Length of String before applying for: "+ len);
		s=s.trim();
		len=s.length();
		System.out.println("Length of String after for: "+ len);
		System.out.print(s);
	}
}