package org.step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinitationfile {
	static WebDriver driver;

@Given("User Have To Launch The Quince Application Through Chrome Browser")
public void user_Have_To_Launch_The_Quince_Application_Through_Chrome_Browser() {
	driver = new ChromeDriver();
	driver.get("https://www.quince.com/");
}

@Given("User Have To Maximize The Window")
public void user_Have_To_Maximize_The_Window() {
	driver.manage().window().maximize();
}


@Given("user have to accept_cookies")
public void user_have_to_accept_cookies() {
	driver.findElement(By.className("cookieBanner-module--cookieBanner__ctaContainer__cta--ae83f")).click();
}

@When("User Have To Click The Sigin Button")
public void user_Have_To_Click_The_Sigin_Button() {
	driver.findElement(By.className("header-module--iconsWrapper__myAccountLink__title--64718")).click();
   
}

@When("User Have To Enter Valid Email")
public void user_Have_To_Enter_Valid_Email() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='Input__StyledInput-sc-17t2x01-1 cpwTox']")).sendKeys("trichy@gmail.com");
	
}

@When("User Have To Click Continue")
public void user_Have_To_Click_Continue() throws InterruptedException {
	Thread.sleep(1000);
    driver.findElement(By.xpath("//span[@class='Button__TextWrapper-sc-18qh75k-0 ghPvoH']")).click();
    
}

@When("User Have To Enter Valid password")
public void user_Have_To_Enter_Valid_password() throws InterruptedException {
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12344321");

}

@When("User Have To Click The Continue Button")
public void user_Have_To_Click_The_Continue_Button() throws AWTException {
	Robot r1 = new Robot();
    for (int i=0; i<2 ;i++)
	{
    r1.keyPress(KeyEvent.VK_TAB);
	r1.keyRelease(KeyEvent.VK_TAB);
	}
    r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
}

@Then("user have to select the product")
public void user_have_to_select_the_product() throws InterruptedException, AWTException   {
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("travel bag");
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_TAB);
	r1.keyRelease(KeyEvent.VK_TAB);
	
    r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(6000);
	//select an element
	driver.findElement(By.xpath("//a[@class='link-module--wrapper--94a7c product-card-link-module--productLink--037ff'][1]")).click();

}

@Then("user have to add to cart")
public void user_have_to_add_to_cart() throws InterruptedException, AWTException {
	
	
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='ADD TO CART']")).click();

}



}
