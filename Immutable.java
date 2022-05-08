package ABC;

public class Immutable {

	public static void main(String[] args) 
	{
			int x=5;
			int y=10;
			int z=y/x;
			final int t=x*y;
			
			System.out.println("before changing " +"z="+z);
			System.out.println("before changing " +"t="+t);
			
			z=x+y;
			//t=x-y;        
			System.out.println("after changing " +"z="+z);
			System.out.println("after changing " +"t="+t);
		}
	

	}


