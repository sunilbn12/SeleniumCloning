package JavaBasics;

public class StringReverse {
	
	public static void main(String[] args) 
	{
		String name="Sunil Nad";
		
		String revrseWord="";
		
		String[] words=name.split(" ");
		
		String reverse="";
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				System.out.print(reverse+word.charAt(j));
			}
			
			revrseWord=revrseWord+reverse+"  ";
		}
		
		System.out.print(revrseWord);
	}

}
