package Class_Materials;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Element_Locator_won_AUT {

	public static void main(String[] args) throws Throwable {

		//WebDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Fatema/Desktop/Current%20Batch_PC_Fatema/All_Selement_AUT.html");
		Thread.sleep(3000);
		driver.findElement(By.id("101")).sendKeys("Muhammad");
		Thread.sleep(2000);
		driver.findElement(By.id("102")).sendKeys("Khan");
	//	driver.findElement(By.id("102")).sendKeys("Khan");
		//driver.findElement(By.xpath("/html/body/form[1]/input[3]")).click();
		driver.findElement(By.xpath("//form[1]/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form[2]/input[2]")).click();
		

		// TODO Auto-generated method stub

	}


}
