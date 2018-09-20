package euler;

public class project6 {

	public static void main(String[] args) {
		int sum=0,s=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i*i;
			s=s+i;
		}
		System.out.println(sum-(s*s));

	}

}
