package JavaBasics;


class Super{
	
	final  void m1()
	{
		
	}
}

class Subclass extends Super{
	//Compile time error due to final in Super class 
	
	/*final  void m1()
	{
		cannot override final method
	}*/
}
public class final_Keyword {
	
	static final int i=10;
	
	public static void main(String[] args) {
	//	i=20;  //Compile time error, Value can not be changed
	}
	
	
	

}
