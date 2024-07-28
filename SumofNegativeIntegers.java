import java.util.Scanner;
public class SumofNegativeIntegers {
	
	static int sumarr(int []arr)
	{
		int sum=0,prevsum=0,len=0,prevlen=0;
		for(int i:arr)
		{
			if(i<0)
			{
				sum=sum+i;
				len++;
			}
			else if(i>0)
			{
				if(len>prevlen)
				{
					prevsum=sum;
					prevlen=len;
				}
				else if(len==prevlen)
				{
					prevsum=prevsum+sum;
					prevlen=len;
				}
				len=sum=0;
			}
		}
		if(len>prevlen)
			prevsum=sum;
		else if(len==prevlen)
			prevsum=prevsum+sum;
		return prevsum;
	}
	public static void main(String[] args) 
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter Elements in the array:");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.print("Ans="+sumarr(arr));
		sc.close();
	}
}
