package day09_WindowHandle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_BasicAuthentication extends TestBase {
    @Test
    public void test(){

    //Bir class olusturun : BasicAuthentication
    //https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        waitFor(5);
    //asagidaki yontem ve test datalarini kullanarak authentication'i yapin

    //URL         : https://username:password@URL
    //Username    : admin
    //password    : admin
    //Basarili sekilde sayfaya girin ve 'Congratulations!' yasizini doğrulayın

        waitFor(3);
        String actualText = driver.findElement(By.xpath("//p")).getText();
        Assert.assertTrue(actualText.contains("Congratulations!"));


    }
}