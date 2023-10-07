package com.eBay.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhoneAndAccessoriesPage 
{
	@FindBy(xpath="//a[text()='Cell Phones & Smartphones']")
	private WebElement Cellphonesandsmartphones;
	
	public CellPhoneAndAccessoriesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getCellphonesAndSmartphones()
	{
		Cellphonesandsmartphones.click();
	}
}
