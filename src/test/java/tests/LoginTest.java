package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

//    WebDriver wd;

    // expected result ? actual result

//    @BeforeMethod
//    public void init(){
//        wd = new ChromeDriver();
//        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }

    @Test
    public void loginPositiveTest() {

        String email = "abc@def.com";
        String password = "$Abcdef12345";

        app.getUser().openLoginRegistrationForm();
        app.getUser().fillLoginRegistrationForm(email, password);
        app.getUser().submitLogin();

        app.getUser().pause(3000);

//        Assert.assertTrue(isElementPresent(By.xpath("//button")));
        Assert.assertTrue(app.getUser().isLogged());
    }
//        @Test
//    public void loginPositiveTestOld(){
//        // open login/registration form
//    wd.findElement(By.xpath("//*[text()='LOGIN']")).click();
//        // fill login/registration form
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("abc@def.com");
//
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.click();
//        passInput.clear();
//        passInput.sendKeys("$Abcdef12345");
//
//        // click login button
//        wd.findElement(By.xpath("//button[1]")).click();
//
//        // Assert if logout button present
//        Assert.assertTrue(wd.findElement(By.xpath("//button")) != null);
//
//    }

//    @Test
//    public void loginNegativeTest() {
//        // open login/registration form
//        wd.findElement(By.xpath("//*[text()='LOGIN']")).click();
//        // fill login/registration form
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("abcdef.com");
//
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.click();
//        passInput.clear();
//        passInput.sendKeys("$Abcdef12345");
//
//        // click login button
//        wd.findElement(By.xpath("//button[1]")).click();
//    }


//    @AfterMethod
//    public void tearDown(){
//        // wd.quit();
//    }
}
