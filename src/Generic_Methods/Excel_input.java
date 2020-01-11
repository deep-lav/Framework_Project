package Generic_Methods;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_input implements Framework_constants
{
	public static String getdata(String sheet, int row, int cell) 
	{
		String val="";
		try 
		{
			FileInputStream fis = new FileInputStream(Excel_Path);
			Workbook wb = WorkbookFactory.create(fis);
			
			Cell ce = wb.getSheet(sheet).getRow(row).getCell(cell);
			val=ce.toString();
		}
		catch (Exception e)
		{
			
		}
	
		return val;
	}
}
