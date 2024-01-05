package com.ex;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        
        WebDriver wd = new ChromeDriver();
        
        wd.manage().window().maximize();
        
        wd.get("https://www.ilovepdf.com/login");
        
        Thread.sleep(2000);
        try {
            // Step 1.4.1: Edit Box
            WebElement editBox = wd.findElement(By.id("inputPasswordAuth"));
            editBox.sendKeys("Hello");
            Thread.sleep(1000);
            editBox.clear();
            Thread.sleep(1000);
            System.out.println("Edit Box Enabled: " + editBox.isEnabled());
            System.out.println("Edit Box Exists: " + (editBox != null));
            System.out.println("Edit Box Value: " + editBox.getAttribute("value"));

            // Step 1.4.2: Link
            WebElement link = wd.findElement(By.linkText("Forgot your password?"));
            link.click();
            Thread.sleep(1000);
            System.out.println("Link Exists: " + (link != null));
            System.out.println("Link Enabled: " + link.isEnabled());
            System.out.println("Link Name: " + link.getText());

            // Step 1.4.3: Button
            WebElement button = wd.findElement(By.id("buttonId"));
            button.click();
            Thread.sleep(1000);
            System.out.println("Button Enabled: " + button.isEnabled());
            System.out.println("Button Displayed: " + button.isDisplayed());

            // Step 1.4.4: Image, Image Link, Image Button
            WebElement image = wd.findElement(By.id("imageId"));
            image.click();
            Thread.sleep(1000);

            // Similar operations for Image Button and Image Link

            // Step 1.4.5: Text Area
            WebElement textArea = wd.findElement(By.id("textAreaId"));
            System.out.println("Text Area Value: " + textArea.getText());

            // Step 1.4.6: Checkbox
            WebElement checkbox = wd.findElement(By.id("checkboxId"));
            System.out.println("Checkbox Displayed: " + checkbox.isDisplayed());
            System.out.println("Checkbox Enabled: " + checkbox.isEnabled());
            System.out.println("Checkbox Selected: " + checkbox.isSelected());
            checkbox.click();
            Thread.sleep(1000);

            // Step 1.4.7: Radio Button
            WebElement radioButton = wd.findElements(By.name("radioGroup")).get(1);
            radioButton.click();
            Thread.sleep(1000);
            System.out.println("Radio Button Displayed: " + radioButton.isDisplayed());
            System.out.println("Radio Button Enabled: " + radioButton.isEnabled());
            System.out.println("Radio Button Selected: " + radioButton.isSelected());

            // Step 1.4.8: Dropdown List
            WebElement dropdown = wd.findElement(By.id("dropdownId"));
            System.out.println("Dropdown Exists: " + (dropdown != null));
            System.out.println("Dropdown Enabled: " + dropdown.isEnabled());
            dropdown.sendKeys("Option 1");
            Thread.sleep(1000);

            // Similar operations for getting items count

            // Step 1.4.9: Web Table / HTML Table
            WebElement cell = wd.findElement(By.xpath("//table//tr[2]/td[3]"));
            System.out.println("Cell Value: " + cell.getText());

            // Similar operations for getting rows count and cells count

            // Step 1.4.10: Frame
            wd.switchTo().frame("iframe1");
            // Perform operations in the frame
            wd.switchTo().defaultContent(); // Switch back to top window

            // Step 1.4.11: Switching Between Tabs
            wd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
            ArrayList<String> tabs = new ArrayList<>(wd.getWindowHandles());
            wd.switchTo().window(tabs.get(1));
            // Perform operations in the new tab
            wd.switchTo().window(tabs.get(0)); // Switch back to the original tab

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            wd.quit();
        }
    }
}
