package com.qa.saucedemo.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.saucedemo.base.BasePage;
import com.qa.saucedemo.util.ElementUtil;

public class InventoryPage extends BasePage{
	WebDriver driver;
	ElementUtil elementUtil;
	
	By sortItems = By.cssSelector(".product_sort_container");
	By testTshirt = By.xpath("//button[@class='btn_primary btn_inventory'][1]");
	By onesie = By.xpath("//button[@class='btn_primary btn_inventory'][last()]");
	By shoppingCart = By.className(".shopping_cart_container");

	
	public InventoryPage(WebDriver driver){
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	public void sortItems(String sortOption){
		By element = sortItems;
	elementUtil.selectValueFromTheDropDown(element, sortOption );
	
	}
	public CartPage addItemsToCart(){
		elementUtil.doClick(testTshirt);
		elementUtil.doClick(onesie);
		elementUtil.doClick(shoppingCart);
		return new CartPage(driver);
	}
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


