package week2;

public class PrimeNumber {

	public static void main(String[] args) {
		 
		int c=13;
		int a,b=0,flag=0;
		b=c/2;
		if(c==0||c==1) 
		{
			System.out.println(c+  "is not a prime number");
		}
		for(a=2; a<=b;a++)
		{
			if(c%2==0)
			{
				System.out.println(c+  "is not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(c+  "is a prime number");
		}
	}

}
