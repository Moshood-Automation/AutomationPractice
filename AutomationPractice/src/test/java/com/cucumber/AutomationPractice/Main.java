package com.cucumber.AutomationPractice;

public class Main {

	public static void main(String[] args) throws Throwable {
		Test_Steps obj = new Test_Steps();
		
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
    	 obj.i_click_on_the_sign_in_link();
		 obj.i_enter_valid_email_address();
		 obj.i_enter_a_valid_password();
		 obj.i_click_the_sign_in_button();
		 obj.i_should_be_logged_in();
		 obj.i_click_on_the_T_SHIRTS_link();
		 obj.i_click_on_a_displayed_item();
		 obj.i_click_on_the_Add_to_cart_button();
		 obj.the_same_item_should_be_added_to_the_cart();
		 obj.TearDown();
		 
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
    	 obj.i_click_on_the_sign_in_link();
		 obj.i_enter_valid_email_address();
		 obj.i_enter_a_valid_password();
		 obj.i_click_the_sign_in_button();
		 obj.i_should_be_logged_in();
		 obj.i_click_on_the_T_SHIRTS_link();
		 obj.i_click_on_a_displayed_item();
		 obj.i_click_on_the_Add_to_cart_button();
		 obj.the_same_item_should_be_added_to_the_cart();
		 obj.i_click_on_the_first_proceed_to_checkout_button();
		 obj.i_click_on_the_second_proceed_to_checkout_button();
		 obj.i_click_on_the_third_proceed_to_checkout_button();
		 obj.i_agree_to_the_terms_of_service();
		 obj.i_click_on_the_fourth_proceed_to_checkout_button();
		 obj.i_should_be_on_the_payment_page();
		 obj.TearDown();
		
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
		 obj.i_click_on_the_sign_in_link();
		 obj.i_enter_valid_email_address();
		 obj.i_enter_a_valid_password();
		 obj.i_click_the_sign_in_button();
		 obj.i_should_be_logged_in();
		 obj.i_log_out();
		 obj.TearDown();
		 
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
		 obj.i_click_on_the_sign_in_link();
		 obj.i_enter_an("moshoodagbosasa@yahoo.com");
		 obj.i_enter_a("manchester");
		 obj.i_click_the_sign_in_button();
		 obj.i_should_get_an_error_message();
		 obj.TearDown();
		 
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
		 obj.i_click_on_the_sign_in_link();
		 obj.i_enter_an(" moshoo-agbosasa@yahoo.com ");
		 obj.i_enter_a("london ");
		 obj.i_click_the_sign_in_button();
		 obj.i_should_get_an_error_message();
		 obj.TearDown();
		 
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
		 obj.i_click_on_the_sign_in_link();
		 obj.i_enter_an(" ");
		 obj.i_enter_a(" ");
		 obj.i_click_the_sign_in_button();
		 obj.i_should_get_an_error_message();
		 obj.TearDown();
		 
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
		 obj.i_click_on_the_sign_in_link();
		 obj.i_enter_an("moshodoo_agbo@yahoo.com ");
		 obj.i_enter_a(" ");
		 obj.i_click_the_sign_in_button();
		 obj.i_should_get_an_error_message();
		 obj.TearDown();
		 
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
		 obj.i_click_on_the_sign_in_link();
		 obj.i_enter_an(" ");
		 obj.i_enter_a("india");
		 obj.i_click_the_sign_in_button();
		 obj.i_should_get_an_error_message();
		 obj.TearDown();
		 
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
		 obj.i_click_on_the_sign_in_link();
		 obj.i_enter_a_valid_email_address();
		 obj.i_click_create_an_account_link();
		 obj.i_fill_the_form();
		 obj.i_click_the_register_button();
		 obj.my_account_should_be_created();
		 obj.TearDown();
		
		//  SEARCH FOR ITEM AS REGISTERED USER 
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
    	 obj.i_click_on_the_sign_in_link();
		 obj.i_enter_valid_email_address();
		 obj.i_enter_a_valid_password();
		 obj.i_click_the_sign_in_button();
		 obj.i_should_be_logged_in();
		 obj.i_enter_a_search_keyword();
		 obj.i_click_the_search_button();
		 obj.the_searched_item_should_be_displayed();
		 obj.TearDown();
		
		//  SEARCH FOR ITEM AS GUEST USER 
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
		 obj.i_enter_an_item_in_the_search_input_box();
		 obj.i_click_the_search_button();
		 obj.the_search_result_should_be_displayed();
		 obj.TearDown();
		 
		 obj.i_navigate_to_the_homepage_of_automation_practice_website();
		 obj.i_check_that_twitter_logo_is_displayed_on_that_page();
		 obj.twitter_logo_should_be_displayed();
		 obj.TearDown();
		 
		 
		 
		 
		 
		 
		
		 
		
		 
		 
		 
		 
		 
		 
		 
}

}

