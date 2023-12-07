package MeitySelenium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	     for(int i=0;i<1;i++)
	     {
	    String url = "https://d3shogot97v876.cloudfront.net/create-edition/55b0a6c8-7e51-4ae3-ab11-6c1cb63133cb.png";
	    URL urll=new URL(url);
	    HttpURLConnection conn=(HttpURLConnection)urll.openConnection();
	    conn.setRequestMethod("HEAD");
	    conn.connect();
	    int b=conn.getContentLength();
	    double d=b/1000;
	    System.out.println(d);
	    System.out.println(b);
	    if(b>200)
	    {
	    	System.out.println(url);
	 }
	     }

}



}
