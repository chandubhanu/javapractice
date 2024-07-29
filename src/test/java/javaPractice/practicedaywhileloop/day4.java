package javaPractice.practicedaywhileloop;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class day4 {

	@Test
	public void string1()
	{
		String a="Hello";
		String ab=new String("Hello World");
		System.out.println(a);
		System.out.println(ab);
	}
	
	@Test
	public void String2()
	{
		String b="Bhanu";
		String c="Bhaanu";
	System.out.println(c);
	System.out.println(b.charAt(2));
	
	int index=c.indexOf('a');
	while(index>=0)
	{
		System.out.println("Found 'a' at index: " + index);
		index=c.indexOf('a',index+1);
	}
	}
	@Test
	public void String3()
	{
		System.out.println("---3---");	
		String a="Ali BaBa 40 Thieves";
	System.out.println(a.substring(5, 19));	
	}
	
	@Test
	public void string4()
	{
		String a="Bhanu";
		String b="Prakash";
		//String c=a.concat(b);
		//System.out.println(c);
		System.out.println(a+b);
	}
	@Test
	public void string5()
	{
		System.out.println("-----5-----");
		String a=" Bhanu Prakash ";
		String[] c=a.split(" ");
		String b=a.trim();
		for(int i=0;i<c.length;i++)
		{
		System.out.println(c[i]);
		}
		System.out.println(b);
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.replace(" ", ""));
		
	}
	@Test
	public void String6()
	{
		System.out.println("-----6-----");
		String a ="Bhanu Prakash";
		StringBuffer b=new StringBuffer(a);
		System.out.println(b.reverse());
	}
	
	@Test
	public void String7()
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("BHanu");
		
	a.add("Prakash");
	
	}
}
