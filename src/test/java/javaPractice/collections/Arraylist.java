package javaPractice.collections;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Arraylist {

	//Arraylist
	@Test
	public void arraylist()
	{
	
		ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	Iterator it=a.iterator();
	while(it.hasNext())
	{
		System.out.print(it.next()+" ");
	}
	}

}
