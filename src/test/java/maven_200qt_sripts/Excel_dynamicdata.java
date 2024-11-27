package maven_200qt_sripts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_dynamicdata {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Test data\\Dynamic.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("DynamicData");
        
        Scanner sc=new Scanner(System.in);
        
    System.out.println("enter how many rows");
    int row=sc.nextInt();
    
    System.out.println("enter how many cells");
    int cells=sc.nextInt();
    
    for(int r=0;r<=row;r++)
    {
    	XSSFRow currentRow=sheet.createRow(r);
    	
    	for(int c=0;c<=cells;c++)
    	{
    		XSSFCell cell=currentRow.createCell(c);
    		cell.setCellValue(sc.next());
    	}
    }
        
      workbook.write(file);    //attach workbook to the file
      workbook.close();
      file.close();
      
      
      System.out.println("file is created");
	}

}
