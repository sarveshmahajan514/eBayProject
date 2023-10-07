package com.eBay.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult 
{
	@FindBy(xpath="//span[text()='Computers/Tablets & Networking']")
	private WebElement ComputersTabletAndNetworking;
	
	@FindBy(xpath="(//div[@class='s-item__info clearfix']/a/div/span/span)[1]")
	private WebElement FirstSearchResult;
	
	public SearchResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getComputersTabletAndNetworking()
	{
		ComputersTabletAndNetworking.click();
	}
	
	public String getFirstSearchResult()
	{
		return FirstSearchResult.getText();
	}
}
