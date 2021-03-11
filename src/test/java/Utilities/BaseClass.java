package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	
	public WebDriver ldriver;	
	
	public BaseClass(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	public void clickWatchNavigationlink() throws InterruptedException {
		ldriver.findElement(By.xpath("(//a[contains(@href, '/watch-tv')])[3]")).click();
		 Thread.sleep(3000);		
	}
	
	public void findPrivacyNotice() throws InterruptedException {
		WebElement ele =ldriver.findElement(By.xpath("//a[contains(@href, '/privacy-notice')]"));		
		 ((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView();", ele);
		 ele.click();
		 Thread.sleep(3000);
	}

	public String getABNnumtext() {
		String getABNno= ldriver.findElement(By.cssSelector("p")).getText();	
		return getABNno;
	}
}