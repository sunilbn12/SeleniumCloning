package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayAsList {
	
	
	
	public String toString()
	{
		return "overriddden";
	}
	@Test
	public void ArrayToList()
	{
		Object[] arr= {"Sunil","Sidd",1,new ArrayAsList()};
		
		List<Object> list=new ArrayList<>();
		
		list.addAll(Arrays.asList(arr));
		
		System.out.println(list);
		
		System.out.println("****************************************");
		for(Object s:list.toArray())
		{
			System.out.println(s);
		}
	}

}
