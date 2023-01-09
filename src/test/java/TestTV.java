import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTV {
    WebDriver wd;
    // When user wants to find a tv show
    @BeforeMethod
    public void init() throws InterruptedException {
        wd = new ChromeDriver();

        wd.navigate().to("https://tv-guide.walla.co.il/");

        wd.manage().window().maximize();
        Thread.sleep(5000);
    }



    @Test
    public void loginPositiveTest () throws InterruptedException {

        //And he clicks on the button first channel
        wd.findElement (By.xpath("//section[1]//div[2]//ul[1]//li[35]//a[1]")).click();
        Thread.sleep(5000);
        // Then he clicks on the button "evening"
        wd.findElement(By.xpath("//div[@id='root']/div/section/section/nav/div/ul/li[4]/button")).click();
        Thread.sleep(15000);
        //Then he sees the show on thursday at 21-15
        wd.findElement(By.xpath("//div[@id='root']/div/section/section/div[2]/div/div/div[4]/div[26]/h3")).click();


    }
    @AfterMethod
    public void teaDown(){
        wd.quit();
    }
}
