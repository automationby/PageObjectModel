package pomDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	
	public static HashMap<String, String> getData() throws IOException {
		File file=new File("D:\\Eclipse_Workspace\\PageObjectModel\\TestData.xlsx");
		FileInputStream fin= new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(fin);
		XSSFSheet sheet=book.getSheet("Sheet1");
		int len=sheet.getPhysicalNumberOfRows();
		System.out.println(len);
		HashMap <String, String> map= new HashMap();
		for(int i=0;i<len;i++)
		{
			XSSFRow row1=sheet.getRow(i);
			XSSFCell cell1=row1.getCell(0);
			XSSFCell cell2=row1.getCell(1);
			for(int j=0;j<2;j++)
			{
				map.put(cell1.getStringCellValue(), cell2.getStringCellValue());
			}				
		}
		System.out.println(map);
		return map;
	}
	
	public void extentReport()
	{
		
	}
	
}
