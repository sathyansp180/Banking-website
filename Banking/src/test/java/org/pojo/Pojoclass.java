package org.pojo;

import java.sql.Driver;

import org.basic.Basicclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends Basicclass {
	
	
	private void poja() {
PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[27]")
private WebElement ROM;

public WebElement getROM() {
	return ROM;
}




}

