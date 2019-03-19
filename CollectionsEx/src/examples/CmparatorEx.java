package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1
{
	int rollno;
	String name;
	int age;
	public Student1(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
}
class AgeComparator implements Comparator<Student1>
{

	@Override
	public int compare(Student1 s1, Student1 s2) {
		if(s1.age==s2.age)
		{
			return 0;
		}
		else if(s1.age>s2.age)
		{
			return 1;
		}
		else
		{
		return -1;
		}
	}
	
}
class NameComparator implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
public class CmparatorEx {

	public static void main(String[] args) {
		ArrayList<Student1>list=new ArrayList<Student1>();
		list.add(new Student1(1,"AA",26));
		list.add(new Student1(4,"DDD",23));
		list.add(new Student1(2,"BBB",34));
		Collections.sort(list, new AgeComparator());
		for(Student1 s1:list)
		{
			System.out.println(s1.name+" "+s1.age);
		}
		Collections.sort(list, new NameComparator());
		for(Student1 s1:list)
		{
			System.out.println(s1.name+" "+s1.age);
		}
	}

}
