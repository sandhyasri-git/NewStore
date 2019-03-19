package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student> {

	 int stuid;
	 public int getStuid() {
		return stuid;
	}

	public String getName() {
		return name;
	}

	public int getTotal() {
		return total;
	}

	String name;
	 int total;

	public Student(int stuid, String name, int total) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.total = total;
	}

	@Override
	public int compareTo(Student o) {
		/*if (total == o.total) {
			return 0;
		} else if (total > o.total) {
			return 1;
		} else if (total < o.total) {
			return -1;
		}

		return 0;*/
		return (name.compareTo(o.name));
	}

}

public class ComparableEx {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Ajay", 122);

		Student s2 = new Student(1, "jay", 122);
		Student s3 = new Student(1, "Ajay1", 122);
		Student s4 = new Student(1, "bbb", 122);
		ArrayList<Student>a1=new ArrayList<Student> ();
		
	a1.add(s1);
	a1.add(s2);
	a1.add(s3);
	a1.add(s4);	
	
Object obj[]=new Object[a1.size()];
	a1.toArray(obj);
	Arrays.sort(obj);
	System.out.println(Arrays.toString(obj));
	System.out.println(obj.toString());
	}



	
	
}






















