import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
    

        //Scanner
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int num=s.nextInt();
            for(int j=1;j<=num;j++)
            {
                if(j%3==0)
                {
                    if(j%5==0)
                    {
                        System.out.println("FizzBizz");
                    }
                    else
                    {
                        System.out.println("Fizz");
                    }
                }
                else if(j%5==0)
                {
                    System.out.println("Bizz");
                }
                else
                {
                    System.out.println(j);
                }
            }
        }
        

    }
}
