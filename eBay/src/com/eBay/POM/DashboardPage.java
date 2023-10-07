package com.eBay.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage 
{
	@FindBy(id="gh-shop-a")
	private WebElement shopbycategory;
	
	@FindBy(xpath="//a[text()='Cell phones & accessories']")
	private WebElement Cellphonesandaccessories;
	
	@FindBy(id="gh-ac")
	private WebElement SearchBar;
	
	@FindBy(id="gh-btn")
	private WebElement SearchButton;
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getShopByCategory()
	{
		shopbycategory.click();
	}
	
	public void getCellphonesAndAccessories()
	{
		Cellphonesandaccessories.click();
	}
	
	public void getSearchBar(String name)
	{
		SearchBar.sendKeys(name);
	}
	
	public void getSearchButton()
	{
		SearchButton.click();
	}
}
