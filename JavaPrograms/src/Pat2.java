/*
import java.util.Iterator;
import java.util.Scanner;
class Pat2
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int digit;
        while (n>0) 
        {
            digit = n % 10;
            sum = (int) (sum+Math.pow(digit,3));
            n = n/10;
        }
       	System.out.println(sum);
    }
}
*/
/*
import java.util.Scanner;
class Pat2
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = Math.abs(n); 
        char num='A';
        if(n>0)
        {
            for(int i=1;i<=rows;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(num+" ");
                    num++;
                    
                }
            System.out.println();
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}

*/

import java.util.Scanner;
class Pat2
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = Math.abs(n);
        char num='A';
        if(n!=0)
        {
            if(n>=1 || n<=6)
            {
                for(int i=1;i<=rows;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(num+" ");
                        num++;
                        
                    }
                System.out.println();
                }
            }
            else
            {
                System.out.println("Range Exceeded");
            }
        }
        else
        {
             System.out.println("Invalid Input");
        }
    }
}