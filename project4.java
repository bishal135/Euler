package euler;

public class project4 {
	
	static int Palindrome(int n) 
    { 
        int max = 0; 
      
        // Loop to calculate upper bound 
        // (largest number    of n-digit) 
        for (int i=1; i<=n; i++) 
        { 
            max *= 10; 
            max += 9; 
        } 
      
        // largest number of n-1 digit.  
        // One plus this number  
        // is lower limit which is  
        // product of two numbers. 
        int min = 1 + max / 10; 
      
        // Initialize result 
        int max_product = 0; 
          
        for (int i = max; i >= min; i--) 
        { 
            for (int j = i; j >= min; j--) 
            { 
                // calculating product of two  
                // n-digit numbers 
                int product = i * j; 
                if (product < max_product) 
                    break; 
                int number = product; 
                int reverse = 0; 
      
                // calculating reverse of product 
                // to check whether it is  
                // palindrome or not 
                while (number != 0) 
                { 
                    reverse = reverse * 10 + number % 10; 
                    number /= 10; 
                } 
      
                // update new product if exist and if 
                // greater than previous one 
                if (product == reverse && product > max_product) 
                    max_product = product; 
            } 
        } 
        return max_product; 
    } 

	public static void main(String[] args) {
		  int n = 3; 
	        System.out.print(Palindrome(n));

	}

}
