
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a-->0)
		{
		    int b=sc.nextInt();
		    int[] c=new int[b];
		    int[] d=new int[b];
		    for(int i=0;i<b;i++)
		    {
		        c[i]=sc.nextInt();
		        d[i]=c[i];
		    }
		    Arrays.sort(d);
		    for(int i=0;i<b;i++)
		    {
		        for(int j=0;j<b;j++)
		        {
		            if(c[i]==d[j])
		            {
                        
		                if(j+1!=b)
		                {
		                    if(d[j]==d[j+1])
		                    {
		                    	
		                    }
		                    else
		                    {
		                    	System.out.print(d[j+1]+" ");
		                    	break;
		                    }
		                }
		                else if(j==(b-1)) 
		                {
		                	System.out.print("_"+" ");
		                	break;
	                	}
		            }
		        }
		    }
		    System.out.println();
		}
	}
}