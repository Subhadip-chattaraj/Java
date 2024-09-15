import java.io.*;
class StringToNum{
	private static int findnum(String S)
	{
		int i=0,j=S.length()-1;
		int ans=0;

		while(j>i){
			int pos1,pos2;

			if(S.charAt(i)>64 & S.charAt(i)<91)
				 pos1=S.charAt(i)-64;
			else
				 pos1=S.charAt(i)-96;
			
			if(S.charAt(j)>64 & S.charAt(j)<91)
				 pos2=S.charAt(j)-64;
			else
				 pos2=S.charAt(j)-96;
			
			int dis=pos1-pos2;
			ans=ans+Math.abs(dis);
			i++;
			j--;
		}

		if(i==j){
			int pos;
			if(S.charAt(i)>64 & S.charAt(i)<91)
				 pos=S.charAt(i)-64;
			else
				 pos=S.charAt(i)-96;

			ans=ans+pos;
		}
		return ans;
	}
	private static int[] toNum(String S)
	{
		String []arrofstrings=S.split(" ");
		int ans[]=new int[arrofstrings.length];
		int i=0;
		for(String word:arrofstrings){
			ans[i]=findnum(word);
			i++;
		}
		return ans;
	}
	public static void main(String []argus) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("Enter your sentence:");
		String str=bf.readLine();
		int arr[]=toNum(str);
		for(int i:arr)
			System.out.printf("%d",i);
	}
}