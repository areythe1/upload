import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WhatWeDo {

	// Initialize elements in Constructor
	public WhatWeDo (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
}
