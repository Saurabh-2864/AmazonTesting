import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();//Create an Object
		driver.manage().window().maximize();
		 
		System.out.println("Window shows in full view");
		driver.navigate().to("https://www.amazon.in/");// Enter any website URL
		System.out.println("Application Opened");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(" Wrist Watches");
		System.out.println("Enter Text:- Wrist Watches");
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		System.out.println("Click on the Search button");
		Thread.sleep(5000);
 
		
		
		driver.findElement(By.xpath("//*[@id=\"p_89/Titan\"]/span/a/div/label/i")).click();
		System.out.println("Select Brand Name :- Titan");
		 driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);

		
		
		driver.findElement(By.xpath("//*[@id=\"p_n_feature_seven_browse-bin/1480900031\"]/span/a/div/label/i")).click();
		System.out.println("Select watch display type:-Analogue");
		 driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
	
		Thread.sleep(5000);

		
		
		driver.findElement(By.xpath("//*[@id=\"p_n_material_browse/1480907031\"]/span/a/div/label/i")).click();
		System.out.println("Watchband Material Type :- Leather");
		 driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    
		Thread.sleep(5000);

		
		
		driver.findElement(By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665400031\"]/span/a/span")).click();
		System.out.println("Discount Type:- 25% Off or more");
		 driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);

		
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
		System.out.println("Fifth element display");
		 driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		   
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    
		Thread.sleep(5000);

		

		
		driver.quit();
		System.out.println("Application Closed");
		
		
		
	
		
		
		

}

	}


