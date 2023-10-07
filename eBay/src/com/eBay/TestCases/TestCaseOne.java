package com.eBay.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBay.Generic.BaseClass;
import com.eBay.POM.CellPhoneAndAccessoriesPage;
import com.eBay.POM.CellPhonesAndSmartphones;
import com.eBay.POM.DashboardPage;

public class TestCaseOne extends BaseClass
{
	@Test
	public void applyingFilter()
	{
		DashboardPage d=new DashboardPage(driver);
		d.getShopByCategory();
		d.getCellphonesAndAccessories();
		
		CellPhoneAndAccessoriesPage c=new CellPhoneAndAccessoriesPage(driver);
		c.getCellphonesAndSmartphones();
		
		CellPhonesAndSmartphones cs=new CellPhonesAndSmartphones(driver);
		wait.until(ExpectedConditions.visibilityOf(cs.returnAllFilter())).click();
		
		wait.until(ExpectedConditions.visibilityOf(cs.returnApply())).click();
		
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("document.querySelector('.x-overlay__wrapper--left').scrollBy(0,600)");
		
		wait.until(ExpectedConditions.visibilityOf(cs.returnCondition())).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(cs.returnNewCheckBox())).click();
		
		cs.getPrice();
		wait.until(ExpectedConditions.visibilityOf(cs.getMinimumPrice()));
		cs.getMinimumPrice().sendKeys("250");
		cs.getMaximumPrice().sendKeys("500");
		
		cs.getItemLocation();
		wait.until(ExpectedConditions.visibilityOf(cs.returnUsOnly())).click();
		cs.getApplyButton();
		
		wait.until(ExpectedConditions.visibilityOf(cs.getAppliedFilter())).click();
		
		for(WebElement item:cs.returnGetFilteredItems())
		{
			String itemtext=item.getText();
			String name=itemtext.split("\nfilter")[0];
			if(name.contains("New")||name.contains("500")||name.contains("US Only"))
			{
				System.out.println("["+name+"] filter is applied.");
				Assert.assertTrue(true);
			}
			else
			{
				System.out.println("["+name+"] filter is not applied.");
				Assert.assertTrue(false);
			}
		}
	}
}
