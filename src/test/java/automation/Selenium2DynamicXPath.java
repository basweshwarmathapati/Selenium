package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2DynamicXPath {

    public static void main(String[] args) {
        String baseUrl = "https://www.google.com/";
        //mac driver path
        System.setProperty("webdriver.chrome.driver", "/Users/anil/Documents/swdtools/driver/chromedriver");

        //windows driver path
        //System.setProperty("webdriver.chrome.driver", "C:\\swdtools\\driver\\chromedriver.exe");

        //Declaration
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);  //hit url
        driver.manage().window().maximize();
        System.out.println("URL Entered");
        driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("Anilkumar Kalshetti");

        //form[@action='/search']/div/div/div/center/input
   //     driver.findElement(By.xpath("//form[@action='/search']/div/div/div/center/input")).click();
    //    driver.findElement(By.xpath("//input[@value='Google Search']")).click();

//<input class="input__input" autocomplete="username" required="true" id="session_key" name="session_key" placeholder=" " type="text">
//<label class="input__label" for="session_key">Email or phone number</label>
//     //*[@id="main-content"]/section[1]/div[2]/form/div[2]/div[1]/label

      //  driver.findElement(By.id("session_key")).sendKeys("anil");

        // <input class="input__input" autocomplete="current-password" required="true" id="session_password" name="session_password" placeholder=" " type="password">
//  /html/body/main/section[1]/div[2]/form/div[2]/div[2]/input

        driver.findElement(By.id("session_password")).sendKeys("Password");

//     <button class="sign-in-form__submit-button" data-tracking-control-name="homepage-basic_signin-form_submit-button" data-tracking-litms="" type="submit">
//          Sign in
//        </button>
//    //*[@id="main-content"]/section[1]/div[2]/form/button

        //syntax =   //tagname[@attribute='value']  // L2
        //eg. //button[@type='submit']
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // validate xpath syntax -   $x(" ")   eg. $x("//button[@type='submit']")


        //<p class="alert-content">Please enter a valid email address or mobile number.</p>

        System.out.println("Validation message displayed: " +driver.findElement(By.className("alert-content")).getText());





    }
}
