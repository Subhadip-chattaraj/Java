import java.io.*;
import java.lang.*;
import java.util.*;

class kthEmementOfTwoArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] arr1 = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                arr1[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] arr2 = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                arr2[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(k, arr1, arr2));
        }
    }
}

class Solution {
    
    public long kthElement(int k, int arr1[], int arr2[]) {
        int i=0;
        int j=0;
        int n=arr1.length+arr2.length;
        int margearr[]=new int[n];
        int m=0,num;

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                num=arr1[i];
                i++;
            }
            else
            {
                num=arr2[j];
                j++;
            }
            margearr[m]=num;
            m++;
        }
        while(i<arr1.length)
        {
            margearr[m]=arr1[i];
            i++;
            m++;
        }
        while(j<arr2.length)
        {
            margearr[m]=arr2[j];
            j++;
            m++;
        }
        for(int v:margearr)
            System.out.printf("%d ",v);
        System.out.println();
        return margearr[k-1];
    }
}