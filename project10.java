package euler;
import java.util.Scanner;
public class project10 {

	public static void main(String[] args) {
		 long r, sum=0;
	        System.out.print("Enter Range:");
	        @SuppressWarnings("resource")
			Scanner get = new Scanner(System.in);
	        r = Long.parseLong(get.next());
	        System.out.println();
	        for(long i=2;i<r;i++)
	        {
	            long flag=0;
	            for(long j=2;j<i;j++)
	            {
	                if(i%j==0)
	                    flag=1;
	            }
	            if(flag==0)
	            {
	                
	                sum=sum+i;
	            }
	        }
	        System.out.println("Sum = "+sum);
	}

}
