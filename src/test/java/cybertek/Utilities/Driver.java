package cybertek.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;



    public static WebDriver driver(){

        if (driver.equals("chrome")){
            driver.manage().window().fullscreen();
            WebDriverManager.chromedriver().setup();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver = new ChromeDriver();
            driver.get("url");



        }else if (driver.equals("firefox")){
            driver.manage().window().fullscreen();
            WebDriverManager.firefoxdriver().setup();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver = new FirefoxDriver();
            driver.get("url");
        }else {
            System.out.println("Only Chrome And FireFox");
        }

        return driver;
    }


    public static WebDriver getDriver(){
        return getDriver();
    }


    public static void closeDriver(){
        if (driver()!=null){
            driver().quit();
            driver=null;
        }
    }









}