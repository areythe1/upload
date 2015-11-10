
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JoinUs {

	// Initialize elements in Constructor
	public JoinUs (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Define NextPage WebElement
	@FindBy(linkText = "2") public WebElement nextpage;
	public void NextPage () {
		nextpage.click();
	}

	// select next page on Join Us
	public void SelectPage (WebDriver driver) {
		Select select = new Select(driver.findElement(By.className("iCIMS_Paginator")));
		select.selectByVisibleText("2");
	}

}
