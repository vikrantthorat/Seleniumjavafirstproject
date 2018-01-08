package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelReader {
	@Test
	public static void readvalues() throws IOException
	{
		FileInputStream fileinput = new FileInputStream(System.getProperty("user.dir")+"/src/resource/testData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fileinput);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFRow newrow = sheet.createRow(7);
		XSSFCell cell = row.getCell(0);
		XSSFCell newcell = row.createCell(1);
		newcell.setCellValue("new cell");
		
		//System.out.Println(cell);
		
		File file = new File("path of prop file");
		FileInputStream fileinput1 =  new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileinput1);
		

		
	}

}
