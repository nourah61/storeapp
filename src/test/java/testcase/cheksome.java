package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class cheksome extends Testbase{

   @Test
    public void cheksome() throws InterruptedException {
       WebElement number5;
       driver.findElement(By.xpath("//android.widget.Button[@index ='18']")).click();
       Thread.sleep(5);

    }
}
