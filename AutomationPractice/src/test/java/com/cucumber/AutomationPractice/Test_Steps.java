
package com.cucumber.AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Test_Steps{
	public WebDriver driver;
	int random;
	
	
	@Given("^i navigate to the homepage of automation practice website$")
	public void i_navigate_to_the_homepage_of_automation_practice_website() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		 
		//System.setProperty("webdriver.gecko.driver", "\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		}
	

	@Given("^i click on the sign in link$")
	public void i_click_on_the_sign_in_link() throws Throwable {
		 driver.findElement(By.cssSelector("div.header_user_info")).click();
	}
	
	@Given("^i enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {
		 //     THIS GENERATES RANDOM EMAIL ADDRESS
	  	  random = 1000000 + (int)(Math.random() * ((1000 - 1) + 1));
	  	  System.out.println(random);
	  	  driver.findElement(By.cssSelector("input#email_create")).sendKeys("mosh" + random + "@yahoo.com");
	}
	
	@Given("^i click create an account link$")
	public void i_click_create_an_account_link() throws Throwable {
		  driver.findElement(By.cssSelector("button#SubmitCreate")).click();	
	}
	
	@When("^i fill the form$")
	public void i_fill_the_form() throws Throwable {
		
		driver.findElement(By.cssSelector("input#id_gender1")).click();
		driver.findElement(By.cssSelector("input#customer_firstname")).sendKeys("Mosh");
		driver.findElement(By.cssSelector("input#customer_lastname")).sendKeys("Lincoln");
		driver.findElement(By.cssSelector("input#passwd")).sendKeys("london");
		
		Select drpDay = new Select(driver.findElement(By.cssSelector("select#days")));
	    drpDay.selectByValue("1");
	    
	    Select drpMonth = new Select(driver.findElement(By.cssSelector("select#months")));
		drpMonth.selectByIndex(3);
		
		Select drpYear = new Select(driver.findElement(By.cssSelector("select#years[class='form-control']")));
	  	drpYear.selectByValue("1985");
	  	
	  	driver.findElement(By.cssSelector("input#newsletter")).click();
	  	driver.findElement(By.cssSelector("input#company")).sendKeys("Zara UK");
		driver.findElement(By.cssSelector("input#address1")).sendKeys("3003 transport street");
		driver.findElement(By.cssSelector("input#address2")).sendKeys("Albuquerque");
		driver.findElement(By.cssSelector("input#city")).sendKeys("New Mexico");
	  	
	  	Select drpState = new Select(driver.findElement(By.cssSelector("select#id_state")));
	  	drpState.selectByValue("31");
	  	
	  	driver.findElement(By.cssSelector("input#postcode")).sendKeys("87106");
	  	driver.findElement(By.cssSelector("textarea#other")).sendKeys("I have a UK address");
	  	driver.findElement(By.cssSelector("input#phone_mobile")).sendKeys("7863340385");
	  	driver.findElement(By.cssSelector("input#alias")).clear();
	  	driver.findElement(By.cssSelector("input#alias")).sendKeys("home");
	  		  	
	}
	
	@When("^i click the register button$")
	public void i_click_the_register_button() throws Throwable {
		driver.findElement(By.cssSelector("button#submitAccount")).click();
	}

	@Then("^my account should be created$")
	public void my_account_should_be_created() throws Throwable {
	    
		String ExpectedMessage = "Sign out";
		String ActualMessage = driver.findElement(By.cssSelector("a.logout")).getText();
		Assert.assertEquals(ActualMessage , ExpectedMessage);
		System.out.println(ActualMessage);	   
	}
	
	@Then("^i log out$")
	public void i_log_out() throws Throwable {
		driver.findElement(By.cssSelector("a.logout")).click();	
	}

	@When("^i enter valid email address$")
	public void i_enter_valid_email_address() throws Throwable {
		driver.findElement(By.cssSelector("input#email")).sendKeys("moshoodagbosasa@yahoo.com");
	}
	
	@When("^i enter a  valid password$")
	public void i_enter_a_valid_password() throws Throwable {
		driver.findElement(By.cssSelector("input#passwd")).sendKeys("london");
	}

	@When("^i click the sign in button$")
	public void i_click_the_sign_in_button() throws Throwable {
		driver.findElement(By.cssSelector("button#SubmitLogin")).click();
	}

	@Then("^i should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
		
		String ExpectedMessage = "Sign out";
		String ActualMessage = driver.findElement(By.cssSelector("a.logout[title='Log me out']")).getText();
		Assert.assertEquals(ActualMessage , ExpectedMessage);
		System.out.println(ActualMessage);
		Thread.sleep(5000);	   
	}
	
	@When("^i enter an \"([^\"]*)\"$")
	public void i_enter_an(String email) throws Throwable {
		driver.findElement(By.cssSelector("input#email")).sendKeys(email);
	}

	@When("^i enter a \"([^\"]*)\"$")
	public void i_enter_a(String password) throws Throwable {
		driver.findElement(By.cssSelector("input#passwd")).sendKeys(password);
	}

	@Then("^i should get an error message$")
	public void i_should_get_an_error_message() throws Throwable{
	
	String ExpectedMessage = "There is 1 error";
	String ActualMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > p")).getText();
	Assert.assertEquals(ActualMessage , ExpectedMessage);
	System.out.println(ActualMessage);
	Thread.sleep(5000);
    }
	
	@When("^i click on the T-SHIRTS link$")
	public void i_click_on_the_T_SHIRTS_link() throws Throwable {
		driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3)")).click();
	}

	@When("^i click on a displayed item$")
	public void i_click_on_a_displayed_item() throws Throwable {
	   driver.findElement(By.cssSelector("img.replace-2x[title='Faded Short Sleeve T-shirts']")).click();
	}

	@When("^i click on the Add to cart button$")
	public void i_click_on_the_Add_to_cart_button() throws Throwable {
		
		try { 
	   driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.fancybox-iframe")));
	   driver.findElement(By.cssSelector("button.exclusive")).click();
	   driver.switchTo().defaultContent();
    }
		catch(Exception e){
			  System.out.println("There is no frame present."); 
			  driver.findElement(By.cssSelector("button.exclusive")).click();
	}
		
		finally {
			
			  System.out.println("The 'try catch' is finished.");  
	}
	   
	}
	
	@Then("^the same item should be added to the cart$")
	public void the_same_item_should_be_added_to_the_cart() throws Throwable {
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.layer_cart_product_info")));
		
		String ExpectedText ="Faded Short Sleeve T-shirts\nOrange, S\nQuantity 1\nTotal $16.51";
		String ActualText = driver.findElement(By.cssSelector("div.layer_cart_product_info")).getText();
		Assert.assertEquals(ExpectedText , ActualText);
		System.out.println(ActualText);
		
		if  (ExpectedText.equals(ActualText)) {
		System.out.println("PASS");
	}
		else {
		System.out.println("FAIL");
	}
		
	}
	
	@When("^i click on the first proceed to checkout button$")
	public void i_click_on_the_first_proceed_to_checkout_button() throws Throwable {
		
		WebElement ProceedToCheckout;
		WebDriverWait wait=new WebDriverWait(driver, 100);
		ProceedToCheckout= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.btn[title='Proceed to checkout\']")));
		ProceedToCheckout.click();	
	}
	
	@When("^i click on the second proceed to checkout button$")
	public void i_click_on_the_second_proceed_to_checkout_button() throws Throwable {
	   driver.findElement(By.cssSelector("a.button[class='button btn btn-default standard-checkout button-medium']")).click();
	}
	
	@When("^i click on the third proceed to checkout button$")
	public void i_click_on_the_third_proceed_to_checkout_button() throws Throwable {
	   driver.findElement(By.cssSelector("button.button[name='processAddress']")).click();
	}
	
	@When("^i agree to the terms of service$")
	public void i_agree_to_the_terms_of_service() throws Throwable {
	    driver.findElement(By.cssSelector("input#cgv")).click();
	}
	
	@When("^i click on the fourth proceed to checkout button$")
	public void i_click_on_the_fourth_proceed_to_checkout_button() throws Throwable {
		driver.findElement(By.cssSelector("button.button[name='processCarrier']")).click(); 
	}

	@Then("^i should be on the payment page$")
	public void i_should_be_on_the_payment_page() throws Throwable {
		
		String ExpectedText = "PLEASE CHOOSE YOUR PAYMENT METHOD";
		String ActualText = driver.findElement(By.cssSelector("h1.page-heading")).getText();
		Assert.assertEquals(ActualText , ExpectedText);
		System.out.println(ActualText);	
	}
	
	@When("^I enter a search keyword$")
	public void i_enter_a_search_keyword() throws Throwable {
		driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Blouse");	  	
	}
		
	@When("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {
		driver.findElement(By.cssSelector("button.btn[name='submit_search']")).click();
	}
		
	@Then("^the searched item should be displayed$")
	public void the_searched_item_should_be_displayed() throws Throwable {
			 
	    Assert.assertEquals("\"BLOUSE\"", driver.findElement(By.cssSelector("span.lighter")).getText());
		System.out.println( driver.findElement(By.cssSelector("span.lighter")).getText());  
	}
		
	@When("^I enter an item in the search input box$")
	public void i_enter_an_item_in_the_search_input_box() throws Throwable {
	    driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Dress");
	}
		
	@Then("^the search result should be displayed$")
	public void the_search_result_should_be_displayed() throws Throwable {
			
		Assert.assertEquals("\"DRESS\"", driver.findElement(By.cssSelector("span.lighter")).getText());
		System.out.println(driver.findElement(By.cssSelector("span.lighter")).getText());   
	}
		
	@Given("^i check that twitter logo is displayed on that page$")
	public void i_check_that_twitter_logo_is_displayed_on_that_page() throws Throwable {
		driver.findElement(By.cssSelector("li.twitter")).isDisplayed();
	}
		
	@Then("^twitter logo should be displayed$")
	public void twitter_logo_should_be_displayed() throws Throwable {
		Assert.assertTrue( driver.findElement(By.cssSelector("li.twitter")).isDisplayed());
		    
		  if (driver.findElement(By.cssSelector("li.twitter")).isDisplayed())
		    	  System.out.println("PASS");
		  
		   else { 
			  System.out.println("FAIL");   
		}
		      
	 }
		 
		    	  
	@After
    public void TearDown() {
	driver.close();
	//driver.quit();	
	 }




    }
