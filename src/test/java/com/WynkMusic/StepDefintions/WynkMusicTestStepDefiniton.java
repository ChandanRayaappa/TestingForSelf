package com.WynkMusic.StepDefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.WynkMusic.PageObjects.WnykMusic;
import com.WynkMusic.Utilities.WebDriverUtility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WynkMusicTestStepDefiniton {
	static WebDriver   driver;
	static WebDriverUtility webDriverUtility;
	static WnykMusic wynkMusic;
	@Given("Lanuch The Browser and Navigate To WynkMusic {string} and validate the DisplayScreen")
	public void lanuch_the_browser_and_navigate_to_wynk_music_and_validate_the_display_screen(String url) {
		System.out.println(url);
		webDriverUtility = new WebDriverUtility();
		driver= new ChromeDriver();
		webDriverUtility.navigateApp(url, driver);
		webDriverUtility.maximizeBrowser(driver);
		webDriverUtility.getSourceCode(driver);
	    
	   
	}

	@And("Click On The SearchBar and SearchWith {string}")
	public void click_on_the_search_bar_and_search_with(String songNAme) {
	     wynkMusic = new WnykMusic(driver);
	     webDriverUtility.explicitlyWait(driver);
	     webDriverUtility.waitUntilElementClikable(wynkMusic.getSearchButton());
	     wynkMusic.searchTheSong(songNAme);
	}

	@Then("Click on the Play Btn and after few second pause the song")
	public void click_on_the_play_btn_and_after_few_second_pause_the_song() throws InterruptedException {
		webDriverUtility.waitUntilElementClikable(wynkMusic.getSearchResultFirstSong());
		wynkMusic.playTheFirstSongInTheSeacrhResult();
		Thread.sleep(50000);
		webDriverUtility.waitUntilElementClikable(wynkMusic.getPauseSongBtn());
		wynkMusic.pauseTheSong();
	}

	@Then("Navigate HomePage and Click On The SearchBar and SearchWith {string}")
	public void navigate_home_page_and_click_on_the_search_bar_and_search_with(String songNAme) throws InterruptedException {
		webDriverUtility.waitUntilElementClikable(wynkMusic.getWynkMusicHomeBtn());
		wynkMusic.goToHomePage();
		 webDriverUtility.waitUntilElementClikable(wynkMusic.getSearchButton());
	     wynkMusic.searchTheSong(songNAme);
	     
	}
	@Then("Close The Browser")
	public void close_the_browser() {
	    driver.close();
	}
}
