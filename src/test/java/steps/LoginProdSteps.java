package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginProdSteps {
	
	@And("user validates captcha image")
	public void user_validates_captcha_image()
	{
		
		System.out.println("@And- user validates captcha image");
	}

	@And("user enter firstname and lastname")
	public void user_enter_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
	   /* List<List<String>> data = dataTable.asLists();
	    System.out.println("First Name is :" +data.get(0).get(0) +" Last Name is :" +data.get(0).get(1));
	    System.out.println("First Name is :" +data.get(1).get(0) +" Last Name is :" +data.get(1).get(1));
	    */
		
		/*List<Map<String, String>>  map = dataTable.asMaps();
		
		System.out.println(map.get(0).get("FirstName")+" Last name is :" +map.get(0).get("LastName"));
		System.out.println(map.get(1).get("FirstName")+" Last name is :" +map.get(1).get("LastName"));
		*/
		for(Map<String,String>data : dataTable.asMaps(String.class, String.class))
		{
			System.out.println("FistName is :" +data.get("FirstName")+" LastName is "+data.get("LastName"));
		}
	}
}
