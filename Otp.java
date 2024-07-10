import java.util.Random;
class Otp
{
	public static void main(String args[])
	{
		Random rand=new Random();
		int num1,num2,num3;
		num1=100+rand.nextInt(900);
		num2=100+rand.nextInt(900);
		num3=100+rand.nextInt(900);
		int otp=new Generator().otpGeneration(num1,num2,num3);
		System.out.println("Your 4 digit OTP is: "+otp);
	}
}
class Generator
{
	int otpGeneration(int x,int y,int z)
	{
		int num1[]=new int[3];
		int num2[]=new int[3];
		int num3[]=new int[3];
		for(int i=2;i>=0;i--)
		{
			num1[i]=x%10;
			num2[i]=y%10;
			num3[i]=z%10;
			x=x/10;
			y=y/10;
			z=z/10;
		}
		int otp[]=new int[4];

		if(num1[2]>num2[2] && num1[2]>num3[2])
			otp[3]=num1[2];
		else if(num2[2]>num1[2] && num2[2]>num3[2])
			otp[3]=num2[2];
		else
			otp[3]=num3[2];

		if(num1[1]>num2[1] && num1[1]>num3[1])
			otp[2]=num1[1];
		else if(num2[1]>num1[1] && num2[1]>num3[1])
			otp[2]=num2[1];
		else
			otp[2]=num3[1];

		if(num1[0]>num2[0] && num1[0]>num3[0])
			otp[1]=num1[0];
		else if(num2[0]>num1[0] && num2[0]>num3[0])
			otp[1]=num2[0];
		else
			otp[1]=num3[0];

		if(num3[0]>num3[1] && num3[0]>num3[2])
			otp[0]=num3[0];
		else if(num3[1]>num3[0] && num3[1]>num3[2])
			otp[0]=num3[1];
		else
			otp[0]=num3[2];
		int num=otp[0];
		for(int i=1;i<4;i++)
			num=num*10+otp[i];
		return num;
	}
}