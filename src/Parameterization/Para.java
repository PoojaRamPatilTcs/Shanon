package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Para {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\POOJA NILESH\\OneDrive\\Desktop\\NiPoo\\Book1.xlsx");
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}