package april21;

class Animal{             //Super Class
	String Name;
	int kg ;
	
	void disp() {
		System.out.println("Type is Animal");
	}

	
}


class Fish extends Animal{           //child class
	
	void disp() {
		System.out.println("water");
	}
	void anicount() {
		System.out.println("fish or Reptiles are no leg ");
	}
}
	
class Reptiles extends Fish{          //super child
	void kg(int kg) {
		System.out.println("Weigth of Reptiles is "+kg+" KG");
	}
}

class Birds extends Animal {           //child class
	void disp() {
		System.out.println("types of animal");
	}

	
}
public class Hierarchical {

	public static void main(String[] args) {
	
			Animal A =new Animal();
			Fish F =new Fish();
			Birds B =new Birds();
			Reptiles R =new Reptiles();
			
			//hierarchical
			A.disp();        //
			F.disp();       // OverRiding 
			B.disp();       //
			
			//multilevel
			F.anicount();        
			R.anicount();    
			R.kg(20);   
			
		}
	}

	
