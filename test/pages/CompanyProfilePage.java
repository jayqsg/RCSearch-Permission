package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class CompanyProfilePage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompanyProfilePage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public boolean verifyAssetFocus(int RowIndex){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        boolean status = false;
        String strName = null;
        try {
            String strAssetFocus = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyAssetFocus");
            List<WebElement> links;

            //wait until page gets loaded
            WaitUtil.simpleSleep(500);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            if(linksCount == 1) {
                findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).click();
                strName = findElement(By.xpath("//div[@id='editableBlock']/div[2]/div/div/div[2]/div/div[2]/dl/dd")).getText();
                if(strName.contains(strAssetFocus))
                {
                    status = true;

                }
            }
            else
            {
                for(int i=1;i<linksCount;i++){
                    findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).click();
                    strName = findElement(By.xpath("//div[@id='editableBlock']/div[2]/div/div/div[2]/div/div[2]/dl/dd")).getText();
                    findElement(By.xpath("//nav[@id='nav']/a/em/img")).click();
                    if(strName.contains(strAssetFocus)){
                        status = true;
                    }
                    else {
                        status =false;
                        break;
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean verifyFocusingOn(int RowIndex){
        boolean status = false;
        try{
            String strFocusingOn = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyFocusingOn");
            String strText = findElement(By.xpath("//div[@id='editableBlock']/div/div/div[@class='info']/p/em[contains(text(),'"+strFocusingOn+"')]")).getText();
            findElement(By.xpath("//nav[@id='nav']/a/em/img")).click();
            if(strText.contains(strFocusingOn)){
                status = true;
            }
            else {
                status =false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean verifyRiskProfile(int RowIndex){
        boolean status = false;
        try{
            String strRiskProfile = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyRiskProfile");
            String strText = findElement(By.xpath("//div[@id='editableBlock']/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/dl[2]/dd")).getText();
            findElement(By.xpath("//nav[@id='nav']/a/em/img")).click();
            if(strText.contains(strRiskProfile)){
                status = true;
            }
            else {
                status =false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }


}


