package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

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
        
        System.out.println(new ArrayList<>(studentPerformanceMap.values().size()));        
        
        
     ArrayList<Entry<String,String>> entry  = new ArrayList<Entry<String,String>>(studentPerformanceMap.entrySet());
     
     System.out.println(entry);
     
     for(Entry<String,String>  o:entry)
     {
    	 System.out.println(o.getKey()+"    "+o.getValue());
     }
    
        
	}

}
