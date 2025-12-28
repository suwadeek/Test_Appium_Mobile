import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;



//TC1 : Setup white background colour
    driver.executeScript("mobile:setAppearance", {style: 'light'});

//TC2 : Setup black background colour
    driver.executeScript("mobile:setAppearance", {style: 'dark'});

//TC3 : Add activity
    WebElement buttonAddActivity = driver.findElement(AppiumBy.accessibilityId("Add Activity"));
    buttonAddActivity.click();
    MobileElement element = (MobileElement) driver.findElementByAccessibilityId("Note");
    element.clear();
    element.sendKeys("Hello world!");
    WebElement buttonSave = driver.findElement(AppiumBy.accessibilityId("Add Save"));
    buttonSave.click();

//TC4 : Update activity
    WebElement buttonUpdateActivity = driver.findElement(AppiumBy.accessibilityId("Update Activity"));
    buttonUpdateActivity.click();
    MobileElement element = (MobileElement) driver.findElementByAccessibilityId("Note");
    element.clear();
    element.sendKeys("Hello world!");
    WebElement buttonSave = driver.findElement(AppiumBy.accessibilityId("Add Save"));
    buttonSave.click();

//TC5 : Delete activity
    WebElement buttonAddActivity = driver.findElement(AppiumBy.accessibilityId("Activity for Delete"));
    buttonAddActivity.click();
    WebElement buttonDeleteActivity = driver.findElement(AppiumBy.accessibilityId("Delete Activity"));
    buttonDeleteActivity.click();
    WebElement buttonSave = driver.findElement(AppiumBy.accessibilityId("Add Save"));
    buttonSave.click();

//TC6 : Add time of activity
    // Get only the year
    String year = driver.getDeviceTime("2025");
    System.out.println("Year: " + year);
    // Get only the time
    String time = driver.getDeviceTime("09:00:09");
    System.out.println("Time: " + time);



//TC7 : Update time of activity
    driver.updateSettings({
      "updateAndroidDeviceSettings": "customDate",
      "customDate": "2026-01-10",
      "customTime": "15:20:00",
      "12HourTime": true // Optional for 12-hour format
    });



