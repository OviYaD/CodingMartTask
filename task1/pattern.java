package task1;
import java.util.*;


class pattern{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>0;i--)
        {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print((n - i + j) - (n - 1) +" ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = n - 1; j > 0; j--) {
                if (j >= i) {
                    System.out.print(j - i + 1 +" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if (j >= i) {
                    System.out.print(((n - i + j) - (n - 1))*((n - i + j) - (n - 1))-1+" ");
                } else {
                    System.out.print("  ");
                }
            }
            for(int j=n-1;j>0;j--)
            {
                if(j>=i)
                {
                    System.out.print((j-i+1)*(j-i+1)-1+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}