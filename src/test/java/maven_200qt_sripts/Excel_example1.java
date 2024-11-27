package maven_200qt_sripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_example1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Test data\\pr2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("data");
		
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue("19");
		row1.createCell(2).setCellValue("Automation");
		
		
		XSSFRow row2=sheet.createRow(1);
		row1.createCell(0).setCellValue("WebTechnologies");
		row1.createCell(1).setCellValue("20");
		row1.createCell(2).setCellValue("AutomationTesting");
		
		
		XSSFRow row3=sheet.createRow(2);
		row1.createCell(0).setCellValue("photoshop");
		row1.createCell(1).setCellValue("21");
		row1.createCell(2).setCellValue("Automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		
		System.out.println("file created");


	}

}
