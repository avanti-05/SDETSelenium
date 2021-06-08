package utils;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtils {
	static String projectpath;
	 static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	
	   ExcelUtils(String excelPath,String sheetName) {
	
try {
			workbook = new XSSFWorkbook(excelPath);
			 sheet = workbook.getSheet(sheetName);
					
		}catch(Exception E) {
			E.printStackTrace();
		}}
		
	
	public static   int  getRowCount()  {
		int rowCount=0;
		try {
				rowCount =sheet.getPhysicalNumberOfRows();
			}catch(Exception exp){
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
	}
	public static  int  getColCount()  {
		int colCount=0;
		try {
			
			 colCount =sheet.getRow(0).getPhysicalNumberOfCells();
		}catch(Exception exp) {
			//System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
	}
	public  static String getCellDataString(int rowNum,int colNum) {
		String cellValue=null;
		try {
			cellValue = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
     return cellValue;
	}
	public static  void getCellDataNumeric(int rowNum,int colNum) {
		try {
			//XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			//XSSFSheet sheet = workbook.getSheet(sheetName);
			 double cellval = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellval);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();;
		}
	}
}