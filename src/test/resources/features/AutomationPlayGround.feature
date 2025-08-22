@AutomationPlayGround
Feature: Play Music Stop Music

  Scenario Outline: Automation playground cucumber frame work test
    Given Lanuch The Browser and Navigate To AutomationPlaygrounf "<url>" and validate the DisplayScreen
    And Send the username into userName text filed "<username>"
    And Send the emailID into emailId text filed "<emailID>"
    Then Send the "<password>" and "<comments>" into respective text fields


    Examples: 
      | url                                  | username       | emailID                    |password|comments|
      | D:/Selenium/Chandan_Crreativity.html | Chandanakumara | chandankumar8971@gmail.com |Sri@1234|chandan legend kannnadna jai hind|
