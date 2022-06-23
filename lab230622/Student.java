package lab230622;

public class Student {
	
	int roll_no;
	String name;
	String sub;
	int t_marks;
	
	public Student(int roll_no, String name, String sub, int t_marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.sub = sub;
		this.t_marks = t_marks;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", sub=" + sub + ", t_marks=" + t_marks + "]";
	}
	

}
