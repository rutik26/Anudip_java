package lab230622;

import java.util.Comparator;

public class tcomp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
	
		return (int)(o1.t_marks-o2.t_marks);
		
	}

}
