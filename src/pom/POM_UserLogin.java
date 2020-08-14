package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_UserLogin extends MagicBricks
{
WebDriver driver;

@FindBy(xpath="//button[text()='Next']")
WebElement nextBtn;

public POM_UserLogin(WebDriver driver)
{
 this.driver=driver;
 PageFactory.initElements(driver, this); //it will save the address of webelement
}


}
