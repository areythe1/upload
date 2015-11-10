import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	// Initialize elements in Constructor
	public Homepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Define the scroll WebElement
	@FindBy(className = "next_link") private WebElement scroll;
	public void ScrollDown() {
		scroll.click();
	}
	
	// Define WHAT WE DO WebElement
	@FindBy(linkText = "WHAT WE DO") public WebElement whatwedo;
	public void WhatWeDoLink () {
		whatwedo.click();
	}
	
	// Define JOIN US WebElement
	@FindBy(linkText = "JOIN US") public WebElement joinus;
	public void JoinUsLink () {
		joinus.click();
	}
	
	// Define BLOG WebElement
	@FindBy(linkText = "BLOG") public WebElement blog;
	public void BlogLink () {
		blog.click();
	}
	
	public void ShowLinks (WebDriver driver) {
		//find number of links on web site. Used for debug
		List<WebElement> BB = driver.findElements(By.className("menu-link"));
		
		for (int i =0; i < BB.size(); i++) {
			System.out.println(BB.get(i).getText());
			System.out.println(BB.get(i).getAttribute("href"));
		}
	}
}
