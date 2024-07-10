import java.util.Scanner;
class Frequency
{
	static int digits[]=new int[10];
	static int digit(int size,int arr[])
	{
		int num;
		for(int i=0;i<size;i++)
		{
			num=arr[i];
			while(num>0)
			{
				int n=num%10;
				digits[n]=digits[n]+1;
				num=num/10;
			}
		}
		int max=digits[0],n=0;
		for(int i=1;i<10;i++)
		{
			if(digits[i]>max)
			{
				max=digits[i];
				n=i;
			}
			else if(digits[i]==max)
				n=i;
		}
		return n;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int size,m;
		System.out.printf("Enter size of the Array:");
		size=input.nextInt();
		int list[]=new int[size];
		System.out.printf("Enter numbers:");
		for (int i=0;i<size;i++ ) 
		{
			list[i]=input.nextInt();	
		}
		m=digit(size, list);
		System.out.println(m);
	}
}