import java.util.Scanner;
class Palindrome
{
	static int dig[]=new int[10];
	static boolean isPossiblePalindrome(int num)
	{
		int digitcount=0,n;
		while(num>0)
		{
			n=num%10;
			dig[n]=dig[n]+1;
			num=num/10;
			digitcount++;
		}
		int status=0;
		for(int freq:dig)
		{
			if(digitcount%2==0 && freq%2!=0)
				return false;
			else if(digitcount%2!=0 && status>1)
				return false;
			if(digitcount%2!=0 && freq%2!=0)
				status++;

		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int num;
		System.out.printf("Enter Number:");
		num=in.nextInt();
		boolean res=isPossiblePalindrome(num);
		System.out.println(res);
	}
}