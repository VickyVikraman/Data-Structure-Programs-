import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int m=sc.nextInt();
            int b[]=new int[m];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<m;i++)
                b[i]=sc.nextInt();
            int i=n-1;
            int j=m-1;
            int k=0;
            int ans[]=new int[1000];
            int carry=0;
            while(i>=0 && j>=0)
            {
                int s=carry+a[i]+b[j];
                i--;
                j--;
                carry=s/10;
                ans[k++]=s%10;
            }
            while(i>=0)
            {
                int s=carry+a[i];
                i--;
                carry=s/10;
	        ans[k++]=s%10;
            }
            while(j>=0)
	    {
	        int s=carry+b[j];
	        j--;
	        carry=s/10;
	        ans[k++]=s%10;
	    }
            if(carry>0)
	    ans[k++]=carry;
            
            for(int p=k-1;p>=0;p--)
            {
                System.out.print(ans[p] + " ");
            }
            System.out.println();
        }
    }
    
}
