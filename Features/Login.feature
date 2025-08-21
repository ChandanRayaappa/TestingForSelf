Feature: Login

Scenario: Sucessful login with valid credentials

Given Lanuch chrome browser
When user open url "http://admin-demo.nopcommerce.com/login"
And user enters email as "admin@yourstore.com" and password as "admin"
And click on login
Then page title should be "Dashboard/noncommerce adminstration"
When user click on log out link
Then page title should be "your store.login"
And close browser