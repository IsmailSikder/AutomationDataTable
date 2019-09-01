package step_definition;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper_classes.SetDriver;

public class GoogleFooterLinkDataTable {
	private WebDriver driver;
	public GoogleFooterLinkDataTable(){
		driver = SetDriver.webdriver;
	}
	
	@Given("^I go to Google Home page$")
	public void i_go_to_Google_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	    
	}

	@When("^I see google home page$")
	public void i_see_google_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I verified the Google footer list  \"([^\"]*)\" text$")
	public void i_verified_the_Google_footer_list_text(String arg1, DataTable arg2) throws Throwable {
		  System.out.println("Hello");

	       Thread.sleep(4000);

	       //List<String> defaultlist= arg2.asList(String.class);
	       List<Map<String,String>> list = arg2.asMaps(String.class,String.class);
	       
//	       System.out.println("Table"+list.get(1).get("footers"));
//	       System.out.println("---"+arg1);
//	       System.out.println("---"+arg2);
	       for(int i =0; i<list.size();i++){
	    	   System.out.println("Before assertion....\n");
	    	   Assert.assertEquals(true, driver.getPageSource().contains(list.get(i).get("footers")));
	    	   
	    	   System.out.println(list.get(i).get("footers") + " Link "+i);
	    	   System.out.println("\nAfter assertion....");
	       }
	        Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

}
