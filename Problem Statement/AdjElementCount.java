import java.util.Scanner;

public class AdjElementCount {
    public static void main(String[] args) {
        // we Are Implementing the adj matrix count.
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Rows and Columns : ");
        int m=s.nextInt();
       
        int n=s.nextInt();
        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter "+i+" th Row and "+j+"  Th column  : ");
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter Position to be Searched : ");
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println("The Element present at the location of array["+x+"]"+"and ["+y+"] is."+arr[x][y]);

    }
    
}
