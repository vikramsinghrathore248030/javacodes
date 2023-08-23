import java.util.Scanner;
public class Str 
{
	/*public static void main(String[] args) 
	{
		String s1 = "hi hello i am the u";
		int count=0;
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i)=='o'|| s1.charAt(i)=='u')
			{
				count++;
				sum = count;
			}
		}
		System.out.println("vowels"+" "+count+" " +sum);
	}
	*/
	public static void main(String[] args) 
	{
		String str ="Elephant";
		int count=0;
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||
					str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') 
			{
				count++;
				sum = count;
			}
		}
		System.out.println("Vowel count ="+count+ " Sum of vowels= "+sum);
	}

}

