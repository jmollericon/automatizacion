package dynamicLoading;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;

public class DynamicLoadingTest extends BaseTest {
    @Test
    public void testExample1Load(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        DynamicLoadingExample1Page dynamicLoadingExample1Page = dynamicLoadingPage.clickOnExample1Link();
        dynamicLoadingExample1Page.clickOnStartButton();

        Assert.assertEquals(dynamicLoadingExample1Page.getLoadedText(),"Hello World!");
    }

    @Test
    public void testExample2Load(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        DynamicLoadingExample2Page dynamicLoadingExample2Page = dynamicLoadingPage.clickOnExample2Link();
        dynamicLoadingExample2Page.clickOnStartButton();

        Assert.assertEquals(dynamicLoadingExample2Page.getLoadedText(),"Hello World!");
    }
}
