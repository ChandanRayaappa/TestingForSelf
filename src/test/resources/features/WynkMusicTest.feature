@WynkMusicTest
Feature: Play Music Stop Music

  Scenario Outline: Navigate to WynkMusic and Play music and stop music
    Given Lanuch The Browser and Navigate To WynkMusic "<url>" and validate the DisplayScreen
    And Click On The SearchBar and SearchWith "<songName1>"
    Then Click on the Play Btn and after few second pause the song
    Then Navigate HomePage and Click On The SearchBar and SearchWith "<songName2>"
    Then Click on the Play Btn and after few second pause the song
   

    Examples: 
      | url                | songName1        | songName2                     |
      | http://Www.wynk.in | Thamnnam Thamnam | Yare Koogadali Oore Horaadali |
