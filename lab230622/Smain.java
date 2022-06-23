package lab230622;

import java.util.Arrays;

public class Smain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Rutik","Big data",76);
		Student s2 = new Student(4,"rohit","uid",59);
		Student s3 = new Student(7,"vishal","Pm",50);
		Student s4 = new Student(22,"omkar","ioe",62);
		Student s5 = new Student(4,"sid","Big data",68);
		
		Student[] arr = {s1,s2,s3,s4,s5}; 
		
		Arrays.sort(arr,new Ncomp());
		for(Student s : arr)
		{
			System.out.println(s+ " ");
			
		}
		
		
		Arrays.sort(arr,new tcomp());
		
		for(Student s : arr) {
			System.out.println(s+ " ");
		}
			
}

	}


