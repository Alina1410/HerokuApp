package lesson;

import lesson.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownTest extends BaseTest {


    @Test
    public void dropdownList() {

        driver.get(BASE_URL + "dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        List options = select.getOptions();

        Assert.assertEquals(options.size(), 3);

        select.selectByIndex(1);
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Option 1");

        select.selectByIndex(2);
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Option 2");



    }
}
