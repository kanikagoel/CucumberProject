 package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user navigates to the facebook website")
	public void user_navigates_to_the_facebook_website()
	{
		System.out.println("@Given--user navigates to the facebook website");
	}
    @When ("user validates the homepage title")
    public void user_validates_the_homepage_title()
    {
    	System.out.println("@When--user validates the homepage title");
    }
   @Then ("user enters {string} username")
   public void user_enters_username(String username)
   {
	   System.out.println("@Then--user enters" +username+ "username");
   }
   @And ("user enters {string} password")
   public void user_enters_password(String password)
   {
	   System.out.println("@And--user enters password" +password+ "password");
   }
   @And ("user clicks on signin button")
   public void user_clicks_on_signin_button()
   {
	   System.out.println("@And--user clicks on signin button");
   }
	
   @And("user select the age category")
   public void user_select_the_age_category(List<String> list) throws Throwable{
	   System.out.println("@And-user select the age category:"+list.get(1));
   }
}
