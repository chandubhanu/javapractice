package javaPractice.practicedaywhileloop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class day1 {

	// Java Program to print all natural numbers from 1 to n using while loop.
	@Test
	public void printnNaturalnumbers() {
		System.out.println("------------------Test1------------------");
		int i = 1;
		int n = 12;
		while (i <= n) {
			System.out.println(i);
			i++;
		}
	}

	// Java Program to print all even numbers between 1 to 100 using while loop.
	@Test
	public void printevennumbers() {
		System.out.println("------------------Test2------------------");
		int i = 1;
		int n = 100;
		while (i <= n) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
			i++;
		}
	}
	
	//Java Program to print all odd number between 1 to 100 using while loop.
	@Test
	public void oddNumbers()
	{
		System.out.println("------------------Test3------------------");
		int i=1;
		int n=100;
		while(i<=n)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	
	//Java Program to print all natural numbers in reverse order using while loop.
	@Test
	public void printnaturalnumbersinreverseorder()
	{
		System.out.println("------------------Test4------------------");
		int i=1;
		int n=100;
		List<Integer> a=new ArrayList<Integer>();
		while(i<=n)
		{
			
			a.add(i);
			i++;
			
		}
		Collections.reverse(a);
		Iterator<Integer> it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
