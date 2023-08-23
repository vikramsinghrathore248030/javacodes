import java.util.Scanner;
class Demo
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        int count=0;
        if(n>=1)
        {
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count<=2)
            {
                System.out.print("Prime Number");
            }
            else
            {
                System.out.print("Not a Prime Number");
            }
        }
        else
        {
            System.out.print("Not a valid Input");
        }
    }
}