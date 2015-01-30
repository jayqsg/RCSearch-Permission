package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

public class MoneyDebtMezzProjectValidationPage extends FluentWebDriverPage{
    ReadData ReadData = new test.Support.ReadData();

    public MoneyDebtMezzProjectValidationPage (WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyProjectNameDebtMezzNotDisplayed(String strProjectName){
        //wait util page load
        WaitUtil.simpleSleep(10000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strProjectName + "')]"), getDriverProvider().get()));

    }

    public void setValueOfMezzAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<30;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(9000);
    }

    public void clearValueOfMezzAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=70;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(9000);
    }

    public void setValueOfEquity(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<30;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearValueOfEquity(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=70;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(9000);
    }

    public void setValueOfDebt(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=0;i<30;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearValueOfDebt(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=70;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(9000);
    }

    public void setValueOfTerm(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[2]"));
        for(int i=0;i<30;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearValueOfTerm(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[2]"));
        for(int i=70;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(9000);
    }

    public void setValueOfInterestRate(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[2]"));
        for(int i=0;i<30;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearValueOfInterestRate(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[2]"));
        for(int i=70;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(12000);
    }


}
