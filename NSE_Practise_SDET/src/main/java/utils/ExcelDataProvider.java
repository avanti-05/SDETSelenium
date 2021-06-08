package utils;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class ExcelDataProvider {
	
	@Test(dataProvider ="test1data")
	public void test1(String CompName ) throws IOException
	{System.out.println(CompName);
	//FileOutputStream fs = new FileOutputStream("C:\\Users\\SRIVIDYAGUPTA\\eclipse-workspace\\usecase_fr_Foundation\\excelData\\data.xlsx");
	
	//fs.close();
	}
	
	
	@DataProvider(name="test1data")
	public  Object[][] getData() {
		String excelpath = "C:\\Users\\ArigelaAvanti\\eclipse_4\\NSE_Practise_SDET\\Exceldata\\data.xlsx";
		Object data[][] = testData(excelpath,"Sheet1");
		return data;
	}
	
	
	public   Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath,sheetName);
		int colNum  =excel.getColCount();
		int rowNum= excel.getRowCount();
		Object data[][] = new Object[rowNum][colNum];
		
		for (int i=1;i<rowNum;i++) {
			for(int j=0;j<colNum;j++) {
			String cellData = excel.getCellDataString(i, j);	
			//System.out.println(cellData);
			data[i-1][j]=cellData;
				
			}
		}
		return data;
	}
}