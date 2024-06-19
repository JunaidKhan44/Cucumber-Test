package com.jk.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDefination {

    @Given("user is on login page")
    public void user_is_on_login_page() {

        System.out.println("user_is_on_login_page");

    }
    @When("the user enter valid credentials")
    public void the_user_enter_valid_credentials() {

        System.out.println("the_user_enter_valid_credentials");

    }
    @When("hit submit")
    public void hit_submit() {

        System.out.println("hit_submit");

    }
    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {

        System.out.println("user_should_be_logged_in_successfully");

    }

}
