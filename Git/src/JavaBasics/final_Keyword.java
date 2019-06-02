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
	
	
	/*
	 * finally is a keyword is used for exception handing along with try-catch block. finally block always executed whether exception is raised or exception is handled.
	 */
	try {
		
	}
	catch (Exception e)
	{
		
	}
	
	finally {
		
	}
	/*
	  		finalize() Method :
			finalize() method is a protected method of java.lang.Object class. It is inherited to every class you create in java.
 			This method is called by garbage collector thread before an object is removed from the memory
	 */

}
}