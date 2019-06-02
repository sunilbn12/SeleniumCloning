package JavaBasics;

import org.testng.annotations.Test;

public class StringToInteger {
	
	@Test
	public void StrToInt()
	{
		String s="10";
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		System.out.println(Integer.valueOf(s));
		
		System.out.println(Integer.toString(i).length());
		
		System.out.println(Integer.toString(i).indexOf("0"));
	}

}
