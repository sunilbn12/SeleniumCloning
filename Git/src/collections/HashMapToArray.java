package collections;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

public class HashMapToArray {
	
	@Test
	public void HM2Array()
	{
		//Creating a HashMap object 
        
        HashMap<String, String> studentPerformanceMap = new HashMap<String, String>(); 
         
        //Adding elements to HashMap 
         
        studentPerformanceMap.put("John Kevin", "Average"); 
        studentPerformanceMap.put("Rakesh Sharma", "Good");         
        studentPerformanceMap.put("Prachi D", "Very Good");          
        studentPerformanceMap.put("Ivan Jose", "Very Bad");         
        studentPerformanceMap.put("Smith Jacob", "Very Good");          
        studentPerformanceMap.put("Anjali N", "Bad"); 
        
        //Getting keySet
        ArrayList<String > keySet=new ArrayList<>(studentPerformanceMap.keySet());
        
        System.out.println("prinitng keySets -------------->"+keySet);
        
        //Getting values
        ArrayList<String> values=new ArrayList<>(studentPerformanceMap.values());
        System.out.println("prinitng values -------------->"+values);
        
       
        
	}

}
