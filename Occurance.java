package ABC;
import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		
		
		String s="Holi is one of the festivals celebrated in India, mainly by the Hindu every year holiHoli is a pleased and joyous festivals that makes everyone happy Holi is a pleased and joyous festivals that makes everyone happy.";
		System.out.println("String is : "+s);
		System.out.println("Enter word for counting: ");
		String w =sc.next();
		String compare="";
		int count =0;
		
		for (int i=0;i<s.length()-1;i++) {
			char ch= s.charAt(i);
			
			if(ch!=' ') {
				compare+=ch;
				
				if(compare.equalsIgnoreCase(w)) {
					count++;
				}			
			}
			else {
				compare="";
			}	
		}		
		System.out.println("Count of user word is "+count);
		sc.close();
	

	}

}
