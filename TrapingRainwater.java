import java.util.Scanner;
public class TrapingRainwater {
	static long trappingWater(int arr[]) { 
		int n=arr.length;
		int left[]=new int[n];
		int right[]=new int[n];
		
		left[0]=arr[0];
		right[n-1]=arr[n-1];
		
		for(int i=1;i<n;i++)
			left[i]=Math.max(left[i-1], arr[i]);
		
		for(int i=n-2;i>=0;i--)
			right[i]=Math.max(right[i+1], arr[i]);
		
		int ans=0;
		
		for(int i=0;i<n;i++)
			ans+=(Math.min(left[i], right[i])-arr[i]);
		
		return ans;
			
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size:");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter height:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print(trappingWater(arr));
		sc.close();
	}

}
