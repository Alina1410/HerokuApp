package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.List;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void addRemoveElements() {
        driver.get(BASE_URL + "add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.cssSelector("[onclick='addElement()']"));
        addElementButton.click();
        addElementButton.click();

        List<WebElement> deleteButtonList = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        Assert.assertEquals(deleteButtonList.size(),2,"Элемента не два");

    }




}
