package JavaBasics;

 class Singleton {
	
	private static Singleton getSingle;
	
	public static Singleton getInstance()
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

public class SingletonDemo{
	public static void main(String[] args) {
		Singleton X=Singleton.getInstance();
		
		System.out.println(X.str);
	}
}
