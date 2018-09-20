package euler;

public class project2 {

	public static void main(String[] args) {
    int x=0;
    int y=1;
    int z=x+y;
    int s=0;
    while(z<4000000)
    {
    	x=y;
    	y=z;
    	z=x+y;
    	if(z%2==0)
    	{
    		s=s+z;
    	}
    }
     System.out.println("sum= "+s);
	}

}
