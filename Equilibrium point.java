import java.util.*;
import java.util.Scanner;
class main
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.printf("Enter size of the list:");
        int n;
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.printf("Enter %d elements in the list:",n);
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        Solution pos=new Solution(arr);
        int poin=pos.equilibriumPoint();
        if(poin!=-1)
            System.out.println("Equilibrium Point in list is:"+poin);
        else
            System.out.println("No Equilibrium point");
    }
}
class Solution 
{
    // arr: input array
    // Function to find equilibrium point in the array.
    int arr[];
    Solution(int newarr[])
    {
        arr=newarr;
    }
    int equilibriumPoint() 
    {
        // Your code here
        if(arr.length==1)
            return 1;
        long sum=Arrays.stream(arr).sum();
        long sub=0;
        int pos=1;
        for(long i:arr)
        {
            sum=sum-i;
            if(sum==sub)
                return pos;
            
            sub=sub+i;
            pos++;
        }
        return -1;
    }
}