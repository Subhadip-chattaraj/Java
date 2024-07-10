import java.util.Scanner;
class sereise
{
	int term;
	void sereise()
	{
		int i,j,k;
		i=0;
		j=1;
		for(k=1;k<term;k++)
		{
			System.out.printf("%d ",i);
			System.out.printf("%d ",j);
			i=i+j;
			j=i+j;
		}
	}
	sereise(int d)
	{
		term=d;
	}
}
class inputsereise
{
	static public void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		sereise s1=new sereise(data);
		s1.sereise();
	}
}