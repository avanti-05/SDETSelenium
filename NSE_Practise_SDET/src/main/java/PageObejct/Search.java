package PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	private WebDriver driver;
	
		 public Search(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		 
	JavascriptExecutor js = (JavascriptExecutor) this. driver;
	
	@FindBy(id="search_str")
	private WebElement type1; 
	
	//capturing NSE%
	@FindBy(className = "nsecp")
	private WebElement click1;
	
	//capturing OPENNSE
	@FindBy(className="nseopn")
	private WebElement capture;
	
	
	//capturing OPENNSE
	@FindBy(xpath="//tr/td[@s='nseopn bseopn']")
	private WebElement open; 
	
	
	//capturing PrevCloseNSE
		@FindBy(xpath="//*[@id='stk_overview']/div[1]/div/div[1]/table/tbody/tr[2]/td[2]")
		private WebElement close; 
		
		
	//capturing NSELOW
			@FindBy(xpath="//div[@id='sp_low']")
			private WebElement low; 
				
	//capturing NSELOW
		@FindBy(xpath="//div[@id='sp_high']")
		private WebElement high; 
		
	//capturing 52weekNSELOW
		@FindBy(xpath="//div[@class='FL nseL52']")
		private WebElement weeklow; 
		
	//capturing 52weekNSEHIGH
		@FindBy(xpath="//div[@class='FR nseH52']")
		private WebElement weekhigh;
		
		
	
	   public void typeCompany(String type1) {
		this.type1.sendKeys(type1);
		this.type1.sendKeys(Keys.ENTER);
		
	   }
		public void nse() {
			this.click1.click();
		
		}
		
		public void getPercentage() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", capture);
			this.capture.getAttribute("data-numberanimate-value");
			System.out.println(capture);
		}
		
		public void openNSE() {
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			  // js.executeScript("arguments[0].scrollIntoView();", open);
			   this.open.getText();
		}
		
		public void closeNSE() {
			   this.close.getText();
		}
		
		public void lowNSE() {
			   this.low.getText();
		}
			
		public void highNSE() {
			   this.high.getText();
		}
		
		public void Week52low() {
			   this.weeklow.getText();
		}
		
		public void Week52high() {
			   this.weekhigh.getText();
		}
}
			
			
		
		
		
			
		
		
		
		
		

   
	