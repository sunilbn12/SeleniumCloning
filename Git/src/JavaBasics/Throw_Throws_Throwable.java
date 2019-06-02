package JavaBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 		throw In Java :
		throw is a keyword in java which is used to throw an exception manually. Using throw keyword,
	 	you can throw an exception from any method or block. But, that exception must be of type java.lang.Throwable class or it’s sub classes. 
	 	Below example shows how to throw an exception using throw keyword.
 */

class ThrowAndThrowable{
	
	//throw keyword
	void method() throws Exception
	{
		Exception e=new Exception();
		throw e;
				
	}
	
	//throws keyword
	public void m1() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream("path"));
		wb.getSheet("sh1").getRow(0).getCell(0).toString();
	}
}

public class Throw_Throws_Throwable {

}
