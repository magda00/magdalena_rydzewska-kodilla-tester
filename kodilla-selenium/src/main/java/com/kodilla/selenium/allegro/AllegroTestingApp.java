package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement element = driver.findElement(By.xpath("//*[contains(@data-box-name, \"allegro.rodoConsentModal\")]/div/div/div/button/img"));
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }

        WebElement inputField = driver.findElement(By.xpath("//*[contains(@data-box-name, \"allegro.metrumHeader.search\")]/div/form/input"));
        inputField.sendKeys("mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("//*[contains(@data-box-name, \"allegro.metrumHeader.search\")]/div/form/div//div/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[contains(@data-box-name, \"allegro.metrumHeader.search\")]/div/form/button"));
        buttonSubmit.click();

    }
}
