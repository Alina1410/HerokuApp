import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxesTest extends BaseTest {


    @Test
    public void checkboxesIsOnOff() {

        driver.get(BASE_URL + "checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type='checkbox']"));

        Assert.assertFalse(checkboxes.get(0).isSelected(), "Чекбокс включен");

        checkboxes.get(0).click();

        Assert.assertTrue(checkboxes.get(0).isSelected(), "Чекбокс выключен");

        Assert.assertTrue(checkboxes.get(1).isSelected(), "Чекбокс включен");

        checkboxes.get(1).click();

        Assert.assertFalse(checkboxes.get(1).isSelected(), "Чекбокс выключен");


    }
}
