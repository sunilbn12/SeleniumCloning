package JavaBasics;

class Fruit{
	
	public void dispaly()
	{
		System.out.println("Fruit");
	}
}

class Apple extends Fruit{
	public void dispaly()
	{
		System.out.println("Apple");
	}
}

class OotyApple extends Apple{
	public void dispaly()
	{
		System.out.println("OotyApple");
	}
}

class Execution{
	
	public static void start(Object o)
	{
		if(o instanceof Fruit)
		{
			((Fruit) o).dispaly();
		}
		else {
			System.out.println("Null pointer passed");
		}
	}
}

public class DynamicDispatch {
	
	public static void main(String[] args) {
		Fruit f=new Fruit();
		Execution.start(f);
		Execution.start(new Apple());
	}

}
