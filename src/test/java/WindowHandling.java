import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class WindowHandling {

    public static void main(String args[]){

       // System.setProperty("webdriver.chrome.driver","C:\\Users\\jillu\\development\\source_code\\github\\GoogleAccount\\drivers\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.linkText("Automation Practice Switch Windows")).click();
//        driver.findElement(By.id("button1")).click();
//        Set <String> wind = driver.getWindowHandles();
//        Iterator <String> its = wind.iterator();
//        String homePage = its.next();
//        String win1 = its.next();
//        driver.switchTo().window(win1);
//        System.out.println(driver.getTitle());
//        driver.findElement(By.xpath("//*[@id='slide-16-layer-5']/a")).click();
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(homePage);

        driver.findElement(By.linkText("IFrame practice page")).click();

        driver.switchTo().frame(driver.findElement(By.name("iframe1")));
        driver.findElement(By.xpath("//*[@id='primary-menu']/li[2]/ul/li[1]/a/span/span")).click();
        System.out.println("1st frame");
        System.out.println(driver.getTitle());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.findElement(By.linkText("Draggable")).click();
        System.out.println("2nd frame");
        System.out.println(driver.getTitle());


    }
}
