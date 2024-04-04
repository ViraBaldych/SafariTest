import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {
    public static void main (String[] args){
        WebDriver driver = new SafariDriver();

        driver.navigate(). to("https://www.youtube.com");
        driver.close();

    }
}
