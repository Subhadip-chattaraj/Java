import java.io.*;
class SumString{
	private static String sum(String n1,String n2)
	{
		char res[]=new char[Math.max(n1.length(),n2.length())];
		int i=n1.length()-1;
		int j=n2.length()-1;
		int carry=0;
		int k=res.length-1;
		while(i>=0 & j>=0){
			int x=n1.charAt(i)-'0';
			int y=n2.charAt(j)-'0';
			int z=x+y+carry;
			carry=z/10;
			res[k]=Character.forDigit(z%10,10);
			i--;
			j--;
			k--;
		}
		while(i>=0){
			int x=n1.charAt(i)-'0';
			int z=x+carry;
			carry=z/10;
			res[k]=Character.forDigit(z%10,10);
			i--;
			k--;
		}
		while(j>=0){
			int x=n2.charAt(j)-'0';
			int z=x+carry;
			carry=z/10;
			res[k]=Character.forDigit(z%10,10);
			j--;
			k--;
		}
		
		String ans=new String(res);
		
		if(carry!=0)
			ans="1"+ans;

		return ans;
	}
	public static void main(String argus[]) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("Enter 1st Number:");
		String num1=bf.readLine();
		System.out.printf("Enter 2nd Number:");
		String num2=bf.readLine();
		System.out.println("SUM is:"+sum(num1,num2));
	}
}