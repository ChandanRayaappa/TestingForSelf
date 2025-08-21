package com.WynkMusic.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WnykMusic {
		
	

	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//div[@class='zapSearch_zapSearchList__TvGT1']//div[@data-testid='searchResultItem'][1]")
	private WebElement searchResultFirstSong;
	
	@FindBy(xpath = "//button[@title='Pause']")
	private WebElement pauseSongBtn;
	
	@FindBy(xpath = "//span[.='Wynk Music']")
	private WebElement wynkMusicHomeBtn;
	
	public WnykMusic(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	public void searchTheSong(String songName) {
		searchButton.click();
		searchButton.sendKeys(songName);
	}
	
	public WebElement getSearchResultFirstSong() {
		return searchResultFirstSong;
	}

	public void setSearchResultFirstSong(WebElement searchResultFirstSong) {
		this.searchResultFirstSong = searchResultFirstSong;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}
	
	public void playTheFirstSongInTheSeacrhResult() {
		searchResultFirstSong.click();
	}
	
	
	public WebElement getPauseSongBtn() {
		return pauseSongBtn;
	}

	public void setPauseSongBtn(WebElement pauseSongBtn) {
		this.pauseSongBtn = pauseSongBtn;
	}

	public void pauseTheSong() {
		pauseSongBtn.click();	
	}
	
	public WebElement getWynkMusicHomeBtn() {
		return wynkMusicHomeBtn;
	}

	public void setWynkMusicHomeBtn(WebElement wynkMusicHomeBtn) {
		this.wynkMusicHomeBtn = wynkMusicHomeBtn;
	}

	public void goToHomePage() {
		wynkMusicHomeBtn.click();
	}
}
