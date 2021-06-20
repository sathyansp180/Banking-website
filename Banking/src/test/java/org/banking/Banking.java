package org.banking;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.basic.Basicclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.pojo.Pojoclass;

import io.cucumber.java.en.Given;

public class Banking extends Basicclass{
	public static Pojoclass o;

	@Given("User have sreach the product")
	public void user_have_sreach_the_product() throws InterruptedException {
		launchBrowser();
		loadUrl("https://www.pnbank.com.au/");
		driver.getCurrentUrl();
		removeallcookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//span[text()='Personal banking'])[2]")).click();
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("(//a[@class='tile-link'])[5]")).click();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		WebElement loans = driver.findElement(By.xpath("//a[text()='Personal loans']"));
		j.executeScript("arguments[0].scrollIntoView();", loans);
		loans.click();
				
			
	
		
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
//		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//		
//		Actions a = new Actions(driver);
//		a.sendKeys(Keys.PAGE_DOWN).build().perform();
//		
//		
//		driver.findElement(By.xpath("//span[text()='iOS']")).click();
//		Pojoclass p = new Pojoclass();
//		toClick(p.getROM());
	}
//		List<WebElement> listpro = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//		WebElement q;
//		for (int i = 0; i < listpro.size(); i++) {
//			q = listpro.get(i); 
//			WebElement list = listpro.get(i);
//			System.out.println(q.getText());
		
		
		
		
		
		//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sumsum mobile");
		//
		//		driver.findElement(By.id("nav-search-submit-button")).click();
		//
		//		List<WebElement> list = driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
		//		int listi = list.size();
		//		System.out.println(listi);
		//
		//		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		//
		//		String windowHandle = driver.getWindowHandle();
		//
		//		driver.findElement(By.xpath("//span[text()='Redmi 9 Power (Mighty Black 4GB RAM 64GB Storage) - 6000mAh Battery |FHD+ Screen | 48MP Quad Camera']")).click();
		//
		//		Set<String> windowHandles = driver.getWindowHandles();
		//
		//		for (String newwin : windowHandles) {
		//
		//			driver.switchTo().window(newwin);
		//		}
		//
		//		driver.findElement(By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-active']")).click();
		//
		//		Actions ac = new Actions(driver);
		//		WebElement mobil = driver.findElement(By.xpath("( //span[@class='nav-a-content'])[2]"));
		//		ac.moveToElement(mobil).build().perform();
		//		Thread.sleep(3000);
		//		Actions a = new Actions(driver);
		//		WebElement power = driver.findElement(By.xpath("//a[text()='Power Banks']"));
		//		a.moveToElement(power).click().build().perform();
		//
		//		List<WebElement> many = driver.findElements(By.xpath("//h2[@class='a-size-mini a-color-base apb-line-clamp-3 a-text-normal']"));
		//		int size = many.size();	
		//		TreeSet<Integer> tree = new TreeSet<Integer>();

//		for (WebElement String : many) {
//			if (many.equals(999)) {
//				Class<? extends List> class1 = many.getClass();
//				System.out.println("get"+many+"getit" +class1);
			}
				
			
			
			
		