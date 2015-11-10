import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UptakeWebSurf {

	public static void main(String[] args) throws InterruptedException {

		//FireFox Browser
		WebDriver driver = new FirefoxDriver();
		
		//Open Uptake Homepage
		driver.get("http://www.uptake.com");
		Thread.sleep(3000);
		
		Homepage homepage = new Homepage(driver);	//Ojbect for the Homepage
		Blog blogpage = new Blog (driver);			//Ojbect for the Blog page

		// Scroll down on Homepage several times
		for (int i=1; i < 5; i++) {
			homepage.ScrollDown();
			Thread.sleep(1000);
		}
		
		// show homepage title
		System.out.println("Title of Web Page: " + driver.getTitle());
		
		// Click on each of the top links WhatWeDo, JoinUs and Blog
		homepage.WhatWeDoLink();
		
		homepage.JoinUsLink();
		Thread.sleep(3000);
		
		homepage.BlogLink();
		Thread.sleep(1000);
		blogpage.NextPage();
		Thread.sleep(1000);
		
		driver.close();
	}

}
