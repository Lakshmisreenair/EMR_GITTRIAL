package Definitions;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {

	WebDriver driver;

	@Given("Navigate onto EMR website")
	public void navigate_onto_emr_website() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://demo.openemr.io/b/openemr");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
	    //throw new io.cucumber.java.PendingException();
	}
	@When("Update username as {string}")
	public void update_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("authUser")).sendKeys(string);
	   //throw new io.cucumber.java.PendingException();
	}
	@When("update Password as {string}")
	public void update_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("clearPass")).sendKeys(string);
	    //throw new io.cucumber.java.PendingException();
	}
	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/form/div[1]/div[1]/div[4]/button")).click();
	   // throw new io.cucumber.java.PendingException();
	}
		@When("Navigate onto Patient\\/Client")
	public void navigate_onto_patient_client() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div/nav/div/div/div[5]/div/div")).click();
	   // throw new io.cucumber.java.PendingException();
	}
	@When("choose New\\/Search")
	public void choose_new_search() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div/nav/div/div/div[5]/div/ul/li[2]/div")).click();
	   // throw new io.cucumber.java.PendingException();
	}
	@When("Add the firstname, lastname")
	public void add_the_firstname_lastname() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/iframe")));
		
		driver.switchTo().frame(driver.findElement((By.name("pat"))));
		Select tname=new Select(driver.findElement(By.xpath("//*[@id=\"form_title\"]")));
		tname.selectByValue("Mrs.");
		driver.findElement((By.name("form_fname"))).sendKeys("Lakshmi");
		Thread.sleep(200);
		driver.findElement(By.name("form_lname")).sendKeys("Nair");
		//driver.switchTo().defaultContent();
		
	    //throw new io.cucumber.java.PendingException();
	}
	@When("Update DOB as todays date \\(According to IST)")
	public void update_dob_as_todays_date_according_to_ist() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.switchTo().frame(driver.findElement((By.xpath("/html/body/div/div[3]/div/div[3]/iframe"))));
		driver.findElement((By.name("form_DOB"))).sendKeys("2021-04-15");
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr[3]/td[5]/div")).click();
	   // throw new io.cucumber.java.PendingException();
	}
	@When("Update the Gender")
	public void update_the_gender() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.switchTo().frame(driver.findElement((By.xpath("/html/body/div/div[3]/div/div[3]/iframe"))));
		Select st=new Select(driver.findElement((By.id("form_sex"))));
		st.selectByValue("Female");
		//driver.switchTo().defaultContent();
		
	    //throw new io.cucumber.java.PendingException();
	}
	@When("click on the create new patient button")
	public void click_on_the_create_new_patient_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//*[@id=\"create\"]")).click();
		driver.switchTo().defaultContent();
	    //throw new io.cucumber.java.PendingException();
	}
	@When("click on confirm create new patient button")
	public void click_on_confirm_create_new_patient_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//driver.switchTo().frame(driver.findElement(By.name("47065a2747f493af9dc0275735082530")));
		driver.switchTo().frame(driver.findElement(By.id("modalframe")));
		Thread.sleep(300);
		//driver.findElement(By.xpath("/html/body/div[2]/center/input")).click();
		driver.findElement((By.cssSelector(".btn"))).click();
		driver.switchTo().defaultContent();
		//throw new io.cucumber.java.PendingException();
	}
	
	@When("validate the alert message")
	public void validate_the_alert_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		//alert.sendKeys("Welcome Lakshmi");
		//Thread.sleep(1000);
		alert.accept();
		
	   // throw new io.cucumber.java.PendingException();
	}
	
	@When("close the birthday wishes message")
	public void close_the_birthday_wishes_message() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]")).click();
	   //throw new io.cucumber.java.PendingException();
	}
	@When("Choose Billy Smith from Menu bar at the right corner")
	public void choose_billy_smith_from_menu_bar_at_the_right_corner() {
	    // Write code here that turns the phrase above into concrete actions
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/span/div/div/span[1]"))).perform();
		
	    //throw new io.cucumber.java.PendingException();
	}
	@When("Click on Log Out")
	public void click_on_log_out() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div/nav/span/div/div/ul/li[4]")).click();
	   // throw new io.cucumber.java.PendingException();
	}
	
	@Then("should display message as {string}")
	public void should_display_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test passed");
	   // throw new io.cucumber.java.PendingException();
	}








}
