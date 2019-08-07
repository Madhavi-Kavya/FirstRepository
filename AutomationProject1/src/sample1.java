import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;


public class sample1 {
	
	public static void main(String[] args) throws Exception
	{
	
	WebDriver driver1 = new FirefoxDriver();
	driver1.get("http:\\naukri.com");
	driver1.manage().window().maximize();
	
	String url = driver1.getCurrentUrl();
	
	File f= ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\rgunturu\\Desktop\\sashank26\\image1.png"));
	
	FileUtils.copyFile(f, new File("C:\\Users\\rgunturu\\Desktop\\sashank26\\image1.png"));
	
	ArrayList CountWindow = new ArrayList((driver1.getWindowHandles()));
	
	driver1.switchTo().window((String)CountWindow.get(1).toString());
			
	String str = driver1.findElement(By.xpath("//body/a[1]/img[1]")).getAttribute("src");
	System.out.println(str);
	driver1.findElement(By.xpath("//body/a[1]/img[1]")).click();
	
	File f1 = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f1, new File("C:\\Users\\rgunturu\\Desktop\\sashank26\\image2.png"));
	
//	driver1.switchTo().parentFrame();
	driver1.wait(500);

	driver1.switchTo().window((String)CountWindow.get(2));
	System.out.println(driver1.getCurrentUrl());
	
	str = driver1.findElement(By.xpath("//body/a[1]/img[1])")).getAttribute("scr");
	System.out.println(str);
	driver1.findElement(By.xpath("//body/a[1]/img[1])")).click();
	
	driver1.close();
	
	
	}
}//body > a:nth-child(1) > img:nth-child(1)
//body > a:nth-child(1) > img:nth-child(1) body > a:nth-child(1) > img:nth-child(1)
