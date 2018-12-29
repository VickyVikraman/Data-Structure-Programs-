import java.util.Scanner;
class Sudoku
 {
     
    public static boolean issafe(int[][] a,int row,int col,int num){
        return !row1(a,row,num)&&!col1(a,col,num)&&!box(a,row-row%3,col-col%3,num);
    } 
    
    public static boolean row1(int[][] a,int row,int num){
        for(int i=0;i<9;i++){
            if(a[row][i]==num)
                return true;
        }
        return false;
    }
    public static boolean col1(int[][] a,int col,int num){
        for(int i=0;i<9;i++){
            if(a[i][col]==num)
                return true;
            
        }
        return false;
    }
    public static boolean box(int[][] a,int row,int col,int num){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i+row][j+col]==num)
                    return true;
            }
        }
        return false;
    }
    
    public static boolean solve(int[][] a)
    {
        for(int row=0;row<9;row++)
        {
            for(int col=0;col<9;col++)
            {
                if(a[row][col]==0)
                {
                    for(int number=1;number<=9;number++)
                    {
                        if(issafe(a,row, col, number))
                        {
                            a[row][col] = number;
                            if(solve(a))
                            {
                                return true;
                                
                            }
                            else
                            {
                                a[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                System.out.print(a[i][j]+" ");
        return true;
    }
    
    public static boolean notassigned(int[][] a){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(a[i][j]==0){
                    
                    return true;
                }
                
            }
        }
        return false;
    }
    
	public static void main (String[] args)
	 {
	 //code
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0)
	    {
	        int[][] a = new int[9][9];
	        for(int i=0;i<9;i++)
	            for(int j=0;j<9;j++)
	                a[i][j] = sc.nextInt();
	        
	        if(solve(a))
	            System.out.println();
	        else
	            System.out.println(-1);
	        
	    }
	 }
}