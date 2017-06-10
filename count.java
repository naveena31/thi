import java.io.*;
import java.util.*;
class count
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int temp=a;
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		System.out.println("count");
	}
}
	
