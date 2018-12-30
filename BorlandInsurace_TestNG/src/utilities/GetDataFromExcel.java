
package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {
	
	public static String GetCellValue(String Sheetname,String TCName,String PageObjectLocator) throws IOException {
		
		
			int rownum,colnum;
			FileInputStream fis = new FileInputStream("E:\\Selenium\\projects\\BorlandInsurnace_Demo\\Exceldata\\TestData.xlsx");
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet Sheet = wb.getSheet(Sheetname);
			
			for(rownum=1;rownum<=Sheet.getLastRowNum();rownum++) //Getting the row no of the Test case
			{
			XSSFRow rw  =Sheet.getRow(rownum);
			XSSFCell cell = rw.getCell(0);
			String value = cell.getStringCellValue();
			if(value.equalsIgnoreCase(TCName))
			{
				break;
			}
			}
			
			XSSFRow rw  =Sheet.getRow(0);
			for(colnum=1;colnum<=rw.getLastCellNum()-1;colnum++) //Getting the column no of the test data to put
			{
			XSSFCell cell = rw.getCell(colnum);
			String value = cell.getStringCellValue();
			if(value.equalsIgnoreCase(PageObjectLocator))
			{
				break;
			}
			}
			
			XSSFRow rw1  =Sheet.getRow(rownum);
			XSSFCell cell = rw1.getCell(colnum);
						
			DataFormatter formatter = new DataFormatter();
			String ValueToReturn = formatter.formatCellValue(cell);
			
			return(ValueToReturn);
			
	}
	
	}
	


