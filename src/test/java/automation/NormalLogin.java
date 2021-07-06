package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalLogin {

    public static void main(String[] args) {
        String baseUrl = "https://in.linkedin.com/";
        //mac driver path
       // System.setProperty("webdriver.chrome.driver", "/Users/anil/Documents/swdtools/driver/chromedriver");

        //windows driver path
        System.setProperty("webdriver.chrome.driver", "C:\\swdtools\\driver\\chromedriver.exe");

        //Declaration
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);  //hit url
        driver.manage().window().maximize();
        System.out.println("URL Entered");


    //    driver.close();   //current window closes    L1
    //    driver.quit();    // chrome multiple windows - close

        //validate current URL
        System.out.println(driver.getCurrentUrl());

        //credit card number, cvv, banking site Right clikc is disabled, get field element via page source
        System.out.println(driver.getPageSource());  //L2

      //  assignment check methods via   driver.









    }
}
