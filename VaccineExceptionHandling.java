package lab1606;

import java.util.Scanner;



public class VaccineExceptionHandling {
	
	static void validateForVaccination(int a , String g ,String nationality) {
		try {
		if(g.equalsIgnoreCase("m") && nationality.equalsIgnoreCase("Indian")) {
			if(a>60) {
				System.out.println("Valid For Booster Dose ");
			}
			else {
				throw new InvalidForVaccinationException(); 
			}
		}
		else if(g.equalsIgnoreCase("f") && nationality.equalsIgnoreCase("Indian")) {
			if(a>50) {
				System.out.println("Valid For Booster Dose ");
			}
			else {
				throw new InvalidForVaccinationException(); 
			}

		}
		else {
			throw new InvalidForVaccinationException();
		}
		}
		catch( InvalidForVaccinationException e) {
			System.out.println("Exception occurs as your " +"Gender is "+g +" age is "+a 
					            +" and nationality is "+nationality );
			
		}
	}	
	
	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in) ;
//			System.out.println("Enter age: ");
//			int a=sc.nextInt();
//			sc.nextLine();
//			System.out.println("Enter Nationality : ");
//			String nationality=sc.nextLine();
//			
//			System.out.println("Enter Gender: ");
//			String g=sc.nextLine();
			validateForVaccination(59, "m", "indian") ;
	}

}
