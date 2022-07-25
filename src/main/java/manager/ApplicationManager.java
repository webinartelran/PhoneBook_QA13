package manager;

import org.openqa.selenium.WebDriver;

public class ApplicationManager {

    WebDriver wd;
    HelperUser user;

    public void init(){
    user = new HelperUser(wd);
    }

    public void stop(){
        wd.quit();
    }

    public HelperUser getUser() {
        return user;
    }
}
