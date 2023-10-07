package com.eBay.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesAndSmartphones 
{
	@FindBy(xpath="//button[text()='All Filters']")
	private WebElement AllFilter;
	
	@FindBy(xpath="(//span[text()='Condition'])[2]")
	private WebElement Condition;
	
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement Apply;
	
	@FindBy(xpath="(//span[@class='checkbox cbx x-refine__multi-select-checkbox '])[1]")
	private WebElement NewCheckBox;
	
	@FindBy(xpath="(//span[text()='Price'])[2]")
	private WebElement Price;
	
	@FindBy(xpath="//input[@aria-label='Minimum Value, US Dollar']")
	private WebElement MinimumPrice;
	
	@FindBy(xpath="//input[@aria-label='Maximum Value, US Dollar']")
	private WebElement MaximumPrice;
	
	@FindBy(xpath="//span[text()='Item Location']")
	private WebElement ItemLocation;
	
	@FindBy(xpath="(//span[@class='radio field__control rbx x-refine__single-select-radio'])[2]")
	private WebElement UsOnly;
	
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement ApplyButton;
	
	@FindBy(xpath="(//span[@class='brm__flyout__btn-label'])[1]")
	private WebElement AppliedFilter;
	
	@FindBy(xpath="//li[@class='brm__aspect-item brm__aspect-item--applied']/a/span/span/..")
	private List<WebElement> FilteredItems;
	
	public CellPhonesAndSmartphones(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement returnAllFilter()
	{
		return AllFilter;
	}
	
	public WebElement returnCondition()
	{
		return Condition;
	}
	
	public WebElement returnApply()
	{
		return Apply;
	}
	
	public WebElement returnNewCheckBox()
	{
		return NewCheckBox;
	}
	
	public void getPrice()
	{
		Price.click();
	}
	
	public WebElement getMinimumPrice()
	{
		return MinimumPrice;
	}
	
	public WebElement getMaximumPrice()
	{
		return MaximumPrice;
	}
	
	public void getItemLocation()
	{
		ItemLocation.click();
	}
	
	public WebElement returnUsOnly()
	{
		return UsOnly;
	}
	
	public void getApplyButton()
	{
		Apply.click();
	}
	
	public WebElement getAppliedFilter()
	{
		return AppliedFilter;
	}
	
	public List<WebElement> returnGetFilteredItems()
	{
		return FilteredItems;
	}
}