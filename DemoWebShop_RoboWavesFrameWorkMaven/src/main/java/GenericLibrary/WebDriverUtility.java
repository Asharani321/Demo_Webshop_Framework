package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
	public void captureScreenShot(WebDriver driver, String name) {
		
		String modName=name+" "+JavaUtility.getTimeStamp();
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File trg=new File("./Screenshots/"+modName+".png");
			try {
				FileHandler.copy(src, trg);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
			
			
			public void acceptAlert(WebDriver driver) {
				driver.switchTo().alert().accept();
			}
			public void dismisstAlert(WebDriver driver) {
				driver.switchTo().alert().dismiss();
			}
			public void switchToFrame(WebDriver driver, int indexNum) {
				driver.switchTo().frame(indexNum);
			}
			public void switchToFrame(WebDriver driver, String IdorName) {
				driver.switchTo().frame(IdorName);
			}
			public void switchToFrame(WebDriver driver, WebElement frameElement) {
				driver.switchTo().frame(frameElement);
			}
			
			public void selectOptionByIndex(WebElement dropdown, int indexNum1) {
				Select s=new Select(dropdown);
				s.selectByIndex(indexNum1);
			}
			
			public void selectOptionByValue(WebElement dropdown, String Value) {
				Select s=new Select(dropdown);
				s.selectByValue(Value);
			}
			
			public void selectOptionByVisibleText(WebElement dropdown, String VisibleText) {
				Select s=new Select(dropdown);
				s.selectByValue(VisibleText);
			}
			
			
			
			
		}
	
	

