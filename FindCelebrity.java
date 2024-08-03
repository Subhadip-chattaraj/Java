import java.util.Arrays;
import java.util.*;


public class FindCelebrity {
	static int celebrity(int mat[][])
	{
		//Two pointer approch O(n)
		/*int n=mat.length;
		int a=0;
		int b=n-1;
		while(a<b)
		{
			if(mat[a][b]==1) 
				a++;
			else  
				b--;
		}
		for(int i=0;i<n;i++)
			if((i!=a)&&(mat[a][i]==1 || mat[i][a]==0))
				return -1;
		return a;*/
		
		//using status matrix O(n^2)
		int n=mat.length;
		boolean status[]=new boolean[n];
		Arrays.fill(status, true);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(mat[i][j]==1)
					status[i]=false;
				else if(i!=j)
					status[j]=false;
			}
		}
		for(int i=0;i<n;i++)
		    if(status[i]==true)
				return i;
		return -1;  
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(celebrity(M));
            t--;
        }

	}

}
