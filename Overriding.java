package april21;
 
class Overriding {

	void display() {
		System.out.println("in OverRiding");
	}
}

 class Overridingchild extends Overriding{

		void display() {
			System.out.println("in OverRidingChild");
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Overriding r=new Overridingchild();
			Overriding r1=new Overriding();
			
			r.display();
			r1.display();
	}

}
