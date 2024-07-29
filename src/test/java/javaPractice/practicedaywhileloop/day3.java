package javaPractice.practicedaywhileloop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class day3 {

	@Test
	public void array1()
	{
		System.out.println("---------Array1---------");
		int[] a= {1,2,3};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	@Test
	public void array2()
	{
		System.out.println("---------Array2---------");
		int[] a=new int[4];
		a[0]=2;
		a[2]=4;
		a[1]=6;
		a[3]=8;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
@Test
public void array3() {
	System.out.println("---------Array3---------");
	String[] b= {"Bhanu","Banti","Bubbly","anil","Aniket"};
	for(int i=0;i<b.length;i++)
	{
		if(b[i].startsWith("B"))
		{
			System.out.println(b[i]);
		}
	}
}

@Test
public void array4()
{
	System.out.println("---------Array4---------");
int[][] c= {{1,2,3},{4,5,6},{7,8,9}};
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(c[i][j]);	
}
System.out.println(" ");
}
}

@Test
public void array5()
{
	System.out.println("---------Array5---------");
Integer[] d= {4,5,6,6,7};
List<Integer> a=Arrays.asList(d);
List<Integer> f=a.stream().sorted().distinct().collect(Collectors.toList());
f.forEach(System.out::print);
}

@Test
public void max() {
	
	int[][] a= {{2,3,7},{8,7,4},{9,2,1}};
	int max = Integer.MIN_VALUE;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(a[i][j]>max)
			{
				 max = a[i][j];
			}
		}
	}
	System.out.println("---------Array6---------");
	System.out.println(max);
}
}
