package lab1606;

import  java.util.Scanner;

public class vowel {
	
	private static void Count() {       
		int count = 0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String s =sc.nextLine();                  
		
		for(int i=0;i<s.length();i++) {    
			
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| 
						s.charAt(i)=='o' || s.charAt(i)=='u' ) {
					count++;                
				}					
		}								
		System.out.println("The Number of Vowels in given String is : "+count);
	}


	public static void main(String[] args) {
		Count();          
	}
}
