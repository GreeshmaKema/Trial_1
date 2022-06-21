package com.gcr.or;

import org.openqa.selenium.By;

public class ProductDetailsPage {
	
	public static By lnkKitchen=By.xpath("(//a[@data-dropdown-rel='kitchen'])[2]");
	public static By lnlKnives=By.xpath("(//ul[@class='fourth-level-menu']/li/a[@href='https://www.at-home.co.in/collections/knives-and-scissors/instock'])[2]");
	public static By imgProduct=By.xpath("//div[@class='image__container'])[3]");
	public static By btnAddtoCart = By.xpath("//span[@id='AddToCartText'])[2]");
}
