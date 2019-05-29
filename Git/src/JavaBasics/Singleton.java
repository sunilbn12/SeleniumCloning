package JavaBasics;

public class Singleton {
	
	private static Singleton getSingle;
	
	private Singleton getInstance()
	{
		if(getSingle==null)
		{
			getSingle=new Singleton();
		}
		
		return getSingle;
	}
	
	public String str;
	
	private Singleton()
	{
		str="Hello I am a string part of Singleton class";
	}

}
