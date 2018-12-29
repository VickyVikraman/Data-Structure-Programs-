import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int i=0;
        int temp=n,sum=0,sum1=0,r,ch=0;
        while(i!=5)
        {
            while(temp!=0)
            {
                r=temp%10;
                sum=sum*10+(r);
                temp=temp/10;
            }
            ch=sum+n;
            sum=0;
            int d=ch;
            while(ch!=0)
            {
                r=ch%10;
                sum1=sum1*10+(r);
                ch=ch/10;
            }
            if(sum1==d)
            {
                break;   
            }
            else
            {
                temp=d;
                n=d;
                sum1=0;
            }
        }
        if(i!=5)
        {
            System.out.println(sum1);
        }
        else
        {
            System.out.println("-1");
        }
        
        
    }
}