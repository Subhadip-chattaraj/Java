import java.util.Scanner;

class Solution{
   
    int N ,arr[];
    Solution(int n,int a[])
    {
        N=n;
        arr=a;
    }
    int matrixMultiplication()
    {
        int cost[][]=new int [N][N];
        for(int i=2;i<N;i++)
        {
            int col=i;
            for(int row=0;row<N-i;row++,col++)
            {
                cost[row][col]=Integer.MAX_VALUE;
                for(int k=row+1;k<col;k++)
                    cost[row][col]=Math.min(cost[row][col],cost[row][k]+cost[k][col]+arr[row]*arr[k]*arr[col]);
            }
        }
        return cost[0][N-1];
    }
}

class MatrixChainMultiplication
{
    public static void main(String argus[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.printf("Enter Number of the matrixes:");
        int n=sc.nextInt();
        int dimension[]=new int[n+1];

        System.out.printf("Enter dimensions of the matrixes:");

        for(int i=0;i<=n;i++)
            dimension[i]=sc.nextInt();

        Solution obj=new Solution(n+1,dimension);

        System.out.println("The number of operations are:"+obj.matrixMultiplication());
    }
}