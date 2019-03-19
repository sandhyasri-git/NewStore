package examples;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListEx {

	public static void showData()
	{
		String array1[]=new String[5];
		String array2[];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array1.length;i++)
			
		{
			array1[i]=sc.next();
		}
		System.out.println(Arrays.toString(array1));
		List<String>list=Arrays.asList(array1);
		ListIterator<String> it=list.listIterator();
		System.out.println("In Forward Direction");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("In Backward Direction");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		array2=new String[list.size()];
		list.toArray(array2);
		System.out.println(Arrays.toString(array2));
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
	}
	public static void main(String[] args) {
		
		showData();
	}

}
