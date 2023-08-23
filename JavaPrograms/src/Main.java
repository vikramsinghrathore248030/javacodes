import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int sum=0;
        //float avg=0f;
        if(size>=0)
        {
            for(int i=0;i<a.length;i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<a.length;i++)
            {
                
                sum = sum+a[i];
            }
        double avg = sum/size;

        // Format the average to 5 decimal points
        String formattedNumber = String.format("%.5f", avg);
        System.out.println(formattedNumber);
        }
        else
        {
            System.out.print("InValid Array Size.");
        }
	}
}