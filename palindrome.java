import java.util.*;
import java.lang.*;

class Palindrome
{
	String p;
	Palindrome()
	{
		System.out.println("\nEnter a String\n");
		Scanner sc = new Scanner(System.in);
		p = new String(sc.nextLine());
	}

	boolean isPalindrome()
	{
		int l = p.length();
		int i;
		for(i=0;i<l/2;i++)
			if(p.charAt(i) != p.charAt(l-i-1))
				return false;
		return true;
	}
}

class PalindromeDemo
{
	public static void main(String args[])
	{
		Palindrome p1 = new Palindrome();
		if(p1.isPalindrome())
			System.out.println("\nString is a Palindrome\n");
		else
			System.out.println("\nString is NOT a Palindrome\n");
	}
}
