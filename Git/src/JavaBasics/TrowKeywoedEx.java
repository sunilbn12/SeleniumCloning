package JavaBasics;

public interface TrowKeywoedEx {
	
	public static void main(String[] args) {
		
		try {
			NumberFormatException ex=new NumberFormatException();
			throw ex;
		}
		catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}

}
