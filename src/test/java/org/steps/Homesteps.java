package org.steps;

import java.util.List;

import org.base.BaseClass;
import org.pom.login;

import io.cucumber.java.en.*;

public class Homesteps extends BaseClass {
	  static login h;
	
	  @Given("the user should be in face book login page")
	  public void the_user_should_be_in_face_book_login_page() {
	      
	  }

	  @When("the user has to fill username and password")
	  public void the_user_has_to_fill_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		  h=new login();
	    List<String> li = dataTable.asList();
	     sendkeys(h.getUsername(), li.get(0));
	     sendkeys(h.getPassword(), li.get(1));
	  }
	  @When("the user has to fill {string} and {string}")
	  public void the_user_has_to_fill_and(String user, String pass) {
		  h=new login();
		  sendkeys(h.getUsername(),user);
		  sendkeys(h.getPassword(),pass);
	  }
	  @Then("user click on the {string} button")
	  public void user_click_on_the_button(String string) {
	   btnClick(h.getLoginbutton());
	  }

	  @Then("the user verify the invalid page {string}")
	  public void the_user_verify_the_invalid_page(String url) {
	     boolean myurl = currentUl().contains(url);
	     System.out.println("user landing on invalid page " + myurl);
	  }

	
}


