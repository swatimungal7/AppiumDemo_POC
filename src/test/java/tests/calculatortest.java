package tests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class calculatortest extends BasePage {

        //WebDriver driver;
        //AndroidDriver driver;

    @Test   
	public void openCalculator()
        {
            System.out.println("Application Started....");

            WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
            WebElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
            WebElement three = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
            WebElement equals = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
            WebElement result = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"5\"]"));

            two.click();
            plus.click();
            three.click();
            equals.click();

            String res = result.getText();

            System.out.println("\n Result is :" +" "+ res);

            System.out.println("Completed....");
        }

    }

