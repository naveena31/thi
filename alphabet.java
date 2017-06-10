import java.io.*;
import java.util.*;
class alphabet
{
	public static void main(String args[])
	{
		char a;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character:");
		a=scan.next() .charAt(0);
		if(a>='a'&&a<='z')
		{
		System.out.println("it is an alphabet");
		}
		else
		{
		System.out.println("it is not an alphabet");
		}
	}
}
	
