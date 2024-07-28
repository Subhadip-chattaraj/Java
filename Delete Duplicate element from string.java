import java.util.Scanner;
import java.util.*;
class Solution 
{
    String str;
    static int arr[]=new int[26];
    String removeDups() 
    {
        char ch[]=str.toCharArray();
        char newstr[]=new char[(ch.length)];
        int j=0;
        for(char i:ch)
        {
            int index=i-'a';
            if(arr[index]==0)
            {
                arr[index]++;
                newstr[j]=i;
                j++;
            }   
        }
        return new String(newstr);
    }
    Solution(String s)
    {
        str=s;
    }
}
class Main
{
    public static void main(String argus[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
        Solution obj=new Solution(str);
        System.out.println("Now: "+obj.removeDups());
    }
}