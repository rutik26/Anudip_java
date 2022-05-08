package april21;

public class Election {

	public static void main(String[] args) {

		double candidate1 = 1136;
		double candidate2 = 7636;
		double candidate3 = 11628;
		
		double total= candidate1+candidate2+candidate3;
		
		
		if (candidate1>candidate2 && candidate1>candidate3) {
			double winPercent=  (candidate1/total)*100;
			System.out.println("candidate1's winning percentage is " +winPercent);
		}
		else if(candidate2>candidate1 && candidate2>candidate3) {
			double winPercent=  (candidate2/total)*100;
			System.out.println("candidate2's winning percentage is " +winPercent);
		}
		else{
			double winPercent=  (candidate3/total)*100;
			System.out.println("candidate3's winning percentage is " +winPercent);
		}

	}

}
