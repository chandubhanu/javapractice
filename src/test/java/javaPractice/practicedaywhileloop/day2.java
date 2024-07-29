package javaPractice.practicedaywhileloop;

import org.testng.annotations.Test;

public class day2 {

	//Write a program to print numbers from 1 to 10.
	@Test
public void numbers() {
		int i=1;
		int n=10;
		System.out.println("----------First--------------");
		do {
			
			System.out.println(i);
			i++;
		}
		while(i<=n);
		{
			
			
		}
		
	}
	//Write a program that prompts the user to input a positive integer. 
	//It should then print the multiplication table of that number.
	@Test
	public void multiply()
	{
		
		int n=2;
		int i=1;
		int c = 2;
		do
		{
			c=n*i;
			System.out.println(c);
			i++;
		}
		while(i<=10);
		{
			
		}
		
	}
	
	
	//1 2 3 4 
	//5 6 7 
	//8 9
	//10
	@Test
	public void pattern() {
		System.out.println("----------Patterns--------------");
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(k);
				k++;
				
			}
			System.out.println(" ");
		}
	}
	
	//1
	//2 3
	//4 5 6 
	//7 8 9 10
	@Test
	public void pattern2() {
		
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println(" ");
		}
	}
	//1
	//1 2
	//1 2 3
	//1 2 3 4
	@Test
	public void pattern3() {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("  ");
		}
	}
	//3
	//6 9
	//12 15 18
	@Test
	public void pattern4()
	{
		System.out.println("-------4---------");
		int k=3;
		for(int i=1;i<4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(k);
				k=k+3;
				
			}
			System.out.println(" ");
		}
	}
}
