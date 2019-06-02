package JavaBasics;

public class CountAllChars {
	
	public static void main(String[] args) {
		int digits=0;
		int lower=0;
		int upper=0;
		int special=0;
		
		String str="Sunil123@isagood man";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upper++;
			}
			else if(Character.isLowerCase(ch))
			{
				lower++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else {
				special++;
			}
		}
		
		System.out.println("Upper  "+upper*100/(str.length()));
		System.out.println(lower*100/(str.length()));
		System.out.println(special*100/(str.length()));
		System.out.println(digits*100/(str.length()));
		
		
		StringBuffer sb=new StringBuffer();
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)>='0'&&str.charAt(j)<='9')
			{
				//System.out.print(str.charAt(j));
				sb.append(str.charAt(j));
			}
		}
		
		System.out.println(sb);
	}

}
