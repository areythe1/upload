import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blog {
	
	// Initialize elements in Constructor
	public Blog (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Define NextPage WebElement
	@FindBy(linkText = "2") public WebElement nextpage;
	public void NextPage () {
		nextpage.click();
	}
}
