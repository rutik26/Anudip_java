package ABC;

class Shape{
	void draw() {
		System.out.println("drawing");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Draw a circle");
	}
	void colour(){
		System.out.println("Colour a circle");
	}
	
}

public class Runtime {

	public static void main(String[] args) {
		
		Shape S=new Circle();  
		Circle C=(Circle)S;
		
		S.draw();
		C.colour();
		
	


	}

}
