import java.util.Scanner;
class IsCircularPrime
{
	int number,dig;
	IsCircularPrime(int n,int d)
	{
		number=n;
		dig=d;
	}
	int generateNumber(int num,int div)
	{
		int newnum;
		newnum=num/div;
		num=num%div;
		newnum=num*10+newnum;
		return newnum;
	}
	boolean isPrime(int num)
	{
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
				return false;

		return true;
	}
	boolean check()
	{
		boolean ans;
		ans=isPrime(number);
		if(ans==false)
			return false;
		int div=(int)Math.pow(10,dig-1);
		int num=number;
		dig--;
		while(dig!=0)
		{ 
			num=generateNumber(num,div);
			ans=isPrime(num);
			if(ans==false)
				return false;
			dig--;
		}
		return true;
	}
}
class CircularPrime
{
	public static void main(String argus[])
	{
		int number,num,dig=0;
		Scanner scan=new Scanner(System.in);
		System.out.printf("Enter the Number:");
		number=scan.nextInt();
		num=number;
		while(num>0)
		{
			num=num/10;
			dig++;
		}
		IsCircularPrime obj=new IsCircularPrime(number,dig);
		boolean ans=obj.check();
		if(ans)
			System.out.println("Circular primenumber");
		else
			System.out.println("Not a Circular primenumber");
	}
}