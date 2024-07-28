package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility1 {

    public String getDataFromProperties(String key) throws IOException
    {
   	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Commondata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
		
    }
    public String getDataFromExcel(String sheet,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
    {
     String path="./src/test/resources/TestData/SeleniumExcelfile.xlsx";
   	 File fis=new File(path);
	 Workbook book=WorkbookFactory.create(fis);

   	Sheet sh = book.getSheet(sheet);
   	String value= sh.getRow(rowNum).getCell(cellNum).toString();
   	return value;

   		
    }
    
     public Object[][] getMultipleDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException{
   	  
      String path="./src/test/resources/TestData/SeleniumExcelfile.xlsx";
   	 File fis=new File(path);   	  
   	  Workbook book=WorkbookFactory.create(fis);
   	  Sheet sh=book.getSheet(sheetName);
   	  
   	  int lastRowNumber=sh.getPhysicalNumberOfRows();
   	  int lastCellNumber=sh.getRow(0).getPhysicalNumberOfCells();
   	  
   	  Object[][] arr=new Object[lastRowNumber-1][lastCellNumber];
   	  
   	  for(int i=1;i<lastRowNumber;i++) {
   		  
   		  for(int j=0;j<lastCellNumber;j++) {
   			  
   			  arr[i-1][j]=sh.getRow(i).getCell(j).toString();
   		  }
   	  }
   	  
   	  return arr;
   	  
     }
 }

 

	