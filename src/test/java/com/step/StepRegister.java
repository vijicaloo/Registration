package com.step;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepRegister {
	
	
public static WebDriver driver;
	
//	public String getProjectPath() {
//		String property = System.getProperty("user.dir");
//		return property;
//	}
//	
//	
//	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
//	Properties p= new Properties();
//	p.load(new FileInputStream(getProjectPath()+"\\Config\\Config.properties"));
//	Object obj= p.get(key);
//	String value= (String)obj;
//	return value;
//	}



	

	@Given("User launch the url")
	public void user_launch_the_url() {
		driver = new ChromeDriver();
		driver.get("http://192.168.1.3:8080/register/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	}
	@When("User enters the {string},{string}, {string},{string}")
	public void user_enters_the(String Username, String Email, String Password, String Confirm_Password) {
		WebElement txtUserName = driver.findElement(By.id("username"));
	    txtUserName.sendKeys("Prem");
	    WebElement txtEmail = driver.findElement(By.id("email"));
	    txtEmail.sendKeys("prem@gmail.com");
	    WebElement txtPassword = driver.findElement(By.id("password"));
	    txtPassword.sendKeys("Viji@123");
	    WebElement txtConfirmPassword = driver.findElement(By.id("confirmPassword"));
	    txtConfirmPassword.sendKeys("Viji@123");
	}
	@When("User clicks on the Register button")
	public void user_clicks_on_the_register_button() {
		WebElement btnRegister = driver.findElement(By.xpath("//button[text()='Register']"));
		btnRegister.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	@Then("User should verify the message {string}")
	public void user_should_verify_the_message(String message) {
		WebElement regMsg = driver.findElement(By.xpath("//h2[text()='Registration Successful']"));
		String text = regMsg.getText();
		Assert.assertEquals("Verify login Success Message", message, text);
	    
	}







}
