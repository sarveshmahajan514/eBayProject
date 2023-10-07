package com.eBay.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBay.Generic.BaseClass;
import com.eBay.POM.DashboardPage;
import com.eBay.POM.SearchResult;

public class TestCaseTwo extends BaseClass
{
	@Test
	public void searchProduct()
	{
		DashboardPage da=new DashboardPage(driver);
		String search="MacBook";
		da.getSearchBar(search);
		da.getSearchButton();
		
		SearchResult s=new SearchResult(driver);
		s.getComputersTabletAndNetworking();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("return document.readyState").toString().equals("complete");
		
		System.out.println("Page Successfully Loaded!");
		
		String firstSearchresult=s.getFirstSearchResult();
		
		Assert.assertEquals(firstSearchresult.contains(search), true, "First result contains "+search);
	}
}
