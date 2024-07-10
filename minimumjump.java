import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

class GFG 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner input=new Scanner(System.in);
        int size,m;
        System.out.println("Enter the size");
        size=input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter numbers:");
        for(int i=0;i<size;i++)
            arr[i]=input.nextInt();
        System.out.println(new Solution().minJumps(arr, size));
    }
}
class Solution 
{
    static int minJumps(int[] arr, int n) 
    {
        // your code here
        if(arr[0]==0)
            return -1;
        if(arr[0]>=n)
            return 1;
        int i,jmp=0;
        i=0;
        while(true)
        {
            i=arr[i]+i;
            jmp+=1;
            System.out.println("i="+i);
            System.out.println("jmp="+jmp);
            if(i>=n)
                return jmp;
            if(arr[i]==0)
                return -1;
            else if(arr[i]>=n-1)
                return jmp;
        }
    }
}