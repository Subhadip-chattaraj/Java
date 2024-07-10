import java.io.*;
import java.util.*;
class Solution 
{
    static int threeSumClosest(int[] array, int target) 
    {
        // code here
        Arrays.sort(array);
        
        int n=array.length;
        int diff=Integer.MAX_VALUE,ans=-1;
        
        for(int i=0;i<=n-3;i++)
        {
            if(i>0 && array[i]==array[i-1]) continue;
           
            int l=i+1,r=n-1;
            
            while(l<r)
            {
                int sum=array[i]+array[l]+array[r];
                int cur_diff=Math.abs(target-sum);
                if(cur_diff<diff)
                {
                    diff=cur_diff;
                    ans=sum;
                }
                else if(cur_diff==diff)
                {
                    ans=Math.max(ans,sum);
                }
                
                if(sum==target)
                {
                    l++;
                    r--;
                }
                else if(sum>target)
                    r--;
                else
                    l++;
            }
        }
        return ans;
    }
}