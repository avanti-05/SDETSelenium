package Application;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObejct.Search;
import utils.ExcelDataProvider;

public class app {
	
	
	 WebDriver driver = new ChromeDriver();
	 
	 Search sea = new Search(driver);
	 
	 @Test(dataProvider ="test1data",dataProviderClass = ExcelDataProvider.class)
	 public void searchPage(String CompName) throws Throwable {
     driver.get("https://www.moneycontrol.com/");
     driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 Thread.sleep(8000);
	 sea.typeCompany(CompName);
	 Thread.sleep(3000);
	 sea.nse();
	 Thread.sleep(3000);
	 sea.getPercentage();
	 sea.openNSE();
	 sea.closeNSE();
	 sea.lowNSE();
	 sea.highNSE();
	 sea.Week52low();
	 sea.Week52high();
	 
	 }


/*import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class appendfileconcept {
	 /**
     *
     * Close Excel before Run application
     *
     * **/
	public static void main(String[] args) {
        String excelFilePath = "C:/Users/SyedaliS/Desktop/JavaBooks.xlsx";
        try {
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook workbook = WorkbookFactory.create(inputStream);
            System.out.println("data read from Excel");
            Sheet sheet = workbook.getSheetAt(0);
            //Input- example data-syed
            Object[] bookData = {"Syed", "Syed", 1060};
            //last row count from sheet-syed
            int rowCount = sheet.getLastRowNum();
            System.out.println("lastrowcount"+rowCount);
            //added new row in excel-syed
            Row row = sheet.createRow(++rowCount);
            //added the column ex:A0 position -syed
                int columnCount = 0;
               // Cell cell = row.createCell(columnCount);
               //cell.setCellValue(rowCount);
                //iteration input data in and set into excel
                for (Object field : bookData) {
                    cell = row.createCell(++columnCount);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }
           inputStream.close();
           System.out.println("inputstream close");
           FileOutputStream outputStream = new FileOutputStream(excelFilePath);
            workbook.write(outputStream);
            System.out.println("outputstream close");
            workbook.close();
           outputStream.close();
           System.out.println("done");
        }
        catch (IOException | EncryptedDocumentException ex)
        {
            ex.printStackTrace();
        }
    }
	}*/