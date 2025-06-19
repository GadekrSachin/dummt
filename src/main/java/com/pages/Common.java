package com.pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Common {

	WebDriver driver;

	public static void takeScreenshot(WebDriver driver, String screenshotName) {
         File directory = new File("screenshots");
        if (!directory.exists()) {
            directory.mkdir();
        }

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

         File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filePath = "screenshots/" + screenshotName + "_" + timestamp + ".png";
        File destFile = new File(filePath);

        try {
            FileHandler.copy(srcFile, destFile);
            System.out.println("Screenshot saved at: " + filePath);
        } catch (IOException e) {
            System.out.println("Error while saving screenshot: " + e.getMessage());
        }
    }
}
