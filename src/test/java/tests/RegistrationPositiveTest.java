package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationPositiveTest extends TestBase{

    @BeforeMethod
    public void preCondition(){
        if(isLogged()){
            logout();
        }
    }

//    WebDriver wd;

//    @BeforeMethod
//    public void init(){
//        wd = new ChromeDriver();
//        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }

    @Test
    public void registrationPositiveTest(){

       int i = (int) ((System.currentTimeMillis()/1000)%3600);
       String email = "name" + i + "@mail.com";
       String password = "$Name12345";
        System.out.println("Email: " + email);

        openLoginRegistrationForm();
        fillLoginRegistrationForm(email, password);
        submitRegistration();
        Assert.assertTrue(isElementPresent(By.xpath("//button")));
    }

    @Test
    public void registrationNegativeTest(){

        int i = (int) ((System.currentTimeMillis()/1000)%3600);
        String email = "name" + i + "mail.com";
        String password = "$Name12345";
        System.out.println("Email: " + email);

        openLoginRegistrationForm();
        fillLoginRegistrationForm(email, password);
        submitRegistration();
    }

//
//    public void submitRegistration() {
//        click(By.xpath("//button[2]"));
//    }
//
//    public void fillLoginRegistrationForm(String email, String password) {
//        type(By.xpath("//input[1]"), email);
//        type(By.xpath("//input[2]"), password);
//    }
//
//    public void openLoginRegistrationForm() {
//      //  wd.findElement(By.xpath("//*[text()='LOGIN']")).click();
//        click(By.xpath("//*[text()='LOGIN']"));
//    }
//
//    public void click(By locator){
//        wd.findElement(locator).click();
//    }
//
//    public void type(By locator, String text){
//        if(text == null) return;
//            WebElement element = wd.findElement(locator);
//            element.click();
//            element.clear();
//            element.sendKeys(text);
//    }
//
//    public boolean isElementPresent(By locator){
//        return wd.findElements(locator).size() > 0;
//    }



//    @AfterMethod
//    public void tearDown(){
//        // wd.quit();
//    }

}
