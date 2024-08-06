import java.util.*;

class ValidateIP {

    public boolean isValid(String str) {
        char ip[]=str.toCharArray();
        int dig,num=0,len=0,dec=0;
        
        for (char ch :ip)
        {
            dig=Character.getNumericValue(ch);   
            if(dig>=0 && dig<=9)
            {
                num=num*10+dig;
                len++;  
            }
            else if(ch=='.')
            {
                if(num<0 || num>255 || len==0)
                    return false;
                num=0;
                len=0;
                dec++;
            }
            else
                return false;
        }

        if(num<0 || num>255 || len==0 || dec<3)
                    return false;

        return true;
    }
}

class IpAddress{
    public static void main(String argus[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the IP:");
        String str=sc.nextLine();
        ValidateIP ans=new ValidateIP();
        System.out.println(ans.isValid(str));
    }
}