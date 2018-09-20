package euler;

public class project5 {
      
	 final static int max = 20;

	    static int gcd(int a, int b) {
	        while (b != 0) {
	            int t = a;
	            a = b;
	            b = t % b;
	        }
	        return a;
	    }
	
	public static void main(String[] args) {
		int result = 1;
        for (int i = 1; i <= max; i++) {
            int currentGcd = gcd(i, result);
            result = result / currentGcd * i;
        }
        System.out.println(result);
    }

	}


