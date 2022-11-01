package Register;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class registerpage {

        @Test
        public void registerPageid() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","/opt/chromedriver");
            ChromeOptions chromeOptions=new ChromeOptions();
            chromeOptions.addArguments("window-size=1000,1000");

            ChromeDriver driver=new ChromeDriver();
            driver.get("https://secure.sahibinden.com/kayit");
            JavascriptExecutor js = (JavascriptExecutor)driver;
            WebDriverWait wait=new WebDriverWait(driver, 20);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
            driver.findElement(By.id("name")).sendKeys("Mert");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surname")));
            driver.findElement(By.id("surname")).sendKeys("Bacak");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            driver.findElement(By.id("email")).sendKeys("testdeneme524@gmail.com");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            driver.findElement(By.id("password")).sendKeys("Mert.202020");
            js.executeScript("document.getElementById('endUserLicenceAgreement').click()");
            js.executeScript("document.getElementById('communicationAgreement').click()");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signUpButton")));
            driver.findElement(By.id("signUpButton")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cboxContent")));
            String email=driver.findElement(By.cssSelector(".email-container > .view-email > #viewEmail")).getText();
            System.out.println(email);



            Thread.sleep(3000);
            driver.quit();

        }
    @Test
    public void RegisterPagecss() {
        System.setProperty("webdriver.chrome.driver","/opt/chromedriver");
        ChromeDriver driver=new ChromeDriver();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("window-size=1000,1000");
        JavascriptExecutor jb = (JavascriptExecutor)driver;
        WebDriverWait wait=new WebDriverWait(driver, 20);


        driver.get("https://secure.sahibinden.com/kayit");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        driver.findElement(By.cssSelector("#name")).sendKeys("Mert");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#surname")));
        driver.findElement(By.cssSelector("#surname")).sendKeys("Bacak");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
        driver.findElement(By.cssSelector("#email")).sendKeys("testdeneme524@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        driver.findElement(By.cssSelector("#password")).sendKeys("Mert.102030");
        jb.executeScript("document.querySelector('#endUserLicenceAgreement').click()");
        jb.executeScript("document.querySelector('#communicationAgreement').click()");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type=button].btn.btn-new.btn-strong")));
        driver.findElement(By.cssSelector("[type=button].btn.btn-new.btn-strong")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".email-container > .view-email > #viewEmail")));
        String email=driver.findElement(By.cssSelector(".email-container > .view-email > #viewEmail")).getText();
        System.out.println(email);

        driver.quit();


    }
    @Test
    public void kayitKurumsalid() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/opt/chromedriver");
        ChromeDriver driver=new ChromeDriver();
        ChromeOptions chromeOptions=new ChromeOptions();
        JavascriptExecutor jb = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, 30);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


        driver.get("https://secure.sahibinden.com/kayit/kurumsal/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        String namePlaceHolder=driver.findElement(By.cssSelector("[for='name']")).getText();
        System.out.println(namePlaceHolder);
        driver.findElement(By.id("name")).sendKeys("Mert");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surname")));
        String surnamePlaceHolder=driver.findElement(By.cssSelector("[for='surname']")).getText();
        System.out.println(surnamePlaceHolder);
        driver.findElement(By.id("surname")).sendKeys("Bacak");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        String emailPlaceHolder=driver.findElement(By.cssSelector("[for='email']")).getText();
        System.out.println(emailPlaceHolder);
        driver.findElement(By.id("email")).sendKeys("mertbacak25000@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        String passwordPlaceHolder=driver.findElement(By.cssSelector("[for='password']")).getText();
        System.out.println(passwordPlaceHolder);
        driver.findElement(By.id("password")).sendKeys("Mert.123123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
        String phonePlaceHolder=driver.findElement(By.cssSelector("[for='phone']")).getText();
        System.out.println(phonePlaceHolder);
        driver.findElement(By.id("phone")).sendKeys("2162321312");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("category")));
        String categoryPlaceHolder=driver.findElement(By.cssSelector("[for='category']")).getText();
        System.out.println(categoryPlaceHolder);
        Select realEstateSelect = new Select(driver.findElement(By.id("category")));
        realEstateSelect.selectByVisibleText("Hayvanlar Alemi");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
        String cityPlaceHolder=driver.findElement(By.cssSelector("[for='city']")).getText();
        System.out.println(cityPlaceHolder);
        Select citySelect = new Select(driver.findElement(By.id("city")));
        citySelect.selectByValue("20");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("town")));
        String townPlaceHolder=driver.findElement(By.cssSelector("[for='town']")).getText();
        System.out.println(townPlaceHolder);
        WebElement town = driver.findElement(By.id("town"));
        Thread.sleep(1000);
        String isDisabled = town.getAttribute("disabled");

        if (isDisabled == null) {
            Select townSelect = new Select(town);
            townSelect.selectByVisibleText("Baklan");
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("quarter")));
        String quarterPlaceHolder=driver.findElement(By.cssSelector("[for='quarter']")).getText();
        System.out.println(quarterPlaceHolder);
       WebElement quarter=driver.findElement(By.id("quarter"));
        Thread.sleep(1000);
        String isDisabledd = quarter.getAttribute("disabled");
        if (isDisabledd == null) {
            Select quarterSelect = new Select(quarter);
            quarterSelect.selectByVisibleText("Balca Mh.");
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Şahıs Şirketi']")));
        driver.findElement(By.xpath("//label[text()='Şahıs Şirketi']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxOfficeCity")));
        String taxOfficeCityPlaceHolder=driver.findElement(By.cssSelector("[for='taxOfficeCity']")).getText();
        System.out.println(taxOfficeCityPlaceHolder);
        Select taxOfficeCitySelect = new Select(driver.findElement(By.id("taxOfficeCity")));
        taxOfficeCitySelect.selectByValue("34");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxOffice")));
        String taxOfficePlaceHolder=driver.findElement(By.cssSelector("[for='taxOffice']")).getText();
        System.out.println(taxOfficePlaceHolder);
        WebElement taxOffice=driver.findElement(By.id("taxOffice"));
        Thread.sleep(1000);
        String isDisableddd = taxOffice.getAttribute("disabled");
        if (isDisableddd == null) {
            Select taxOfficeSelect = new Select(taxOffice);
            taxOfficeSelect.selectByVisibleText("Adalar Vergi Dairesi");
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxNumber")));
        String taxOrderPlaceHolder=driver.findElement(By.cssSelector("[for='taxNumber']")).getText();
        System.out.println(taxOrderPlaceHolder);
        driver.findElement(By.id("taxNumber")).sendKeys("123123123");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idNumber")));
        String idNumberPlaceHolder=driver.findElement(By.cssSelector("[for='idNumber']")).getText();
        System.out.println(idNumberPlaceHolder);
        driver.findElement(By.id("idNumber")).sendKeys("30080432027");


        jb.executeScript("document.getElementById('endUserLicenceAgreement').click()");
        driver.findElement(By.cssSelector(".btn.btn-new.btn-strong")).click();


        Thread.sleep(4000);



        driver.quit();
    }
    @Test
    public void kayitKurumsalcss() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/opt/chromedriver");
        ChromeDriver driver=new ChromeDriver();
        ChromeOptions chromeOptions=new ChromeOptions();
        JavascriptExecutor jb = (JavascriptExecutor)driver;
        WebDriverWait wait=new WebDriverWait(driver, 30);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://secure.sahibinden.com/kayit/kurumsal/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        String namePlaceHolder=driver.findElement(By.cssSelector("[for='name']")).getText();
        System.out.println(namePlaceHolder);
        driver.findElement(By.cssSelector("#name")).sendKeys("Mert");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#surname")));
        String surnamePlaceHolder=driver.findElement(By.cssSelector("[for='surname']")).getText();
        System.out.println(surnamePlaceHolder);
        driver.findElement(By.cssSelector("#surname")).sendKeys("Bacak");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
        String emailPlaceHolder=driver.findElement(By.cssSelector("[for='email']")).getText();
        System.out.println(emailPlaceHolder);
        driver.findElement(By.cssSelector("#email")).sendKeys("mertbacak25000@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        String passwordPlaceHolder=driver.findElement(By.cssSelector("[for='password']")).getText();
        System.out.println(passwordPlaceHolder);
        driver.findElement(By.cssSelector("#password")).sendKeys("Mert.123123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#phone")));
        String phonePlaceHolder=driver.findElement(By.cssSelector("[for='phone']")).getText();
        System.out.println(phonePlaceHolder);
        driver.findElement(By.cssSelector("#phone")).sendKeys("2162321312");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#category")));
        String categoryPlaceHolder=driver.findElement(By.cssSelector("[for='category']")).getText();
        System.out.println(categoryPlaceHolder);
        Select realEstateSelect = new Select(driver.findElement(By.cssSelector("#category")));
        realEstateSelect.selectByVisibleText("Hayvanlar Alemi");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#city")));
        String cityPlaceHolder=driver.findElement(By.cssSelector("[for='city']")).getText();
        System.out.println(cityPlaceHolder);
        Select citySelect = new Select(driver.findElement(By.cssSelector("#city")));
        citySelect.selectByValue("20");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#town")));
        String townPlaceHolder=driver.findElement(By.cssSelector("[for='town']")).getText();
        System.out.println(townPlaceHolder);
        WebElement town = driver.findElement(By.cssSelector("#town"));
        Thread.sleep(1000);
        String isDisabled = town.getAttribute("disabled");

        if (isDisabled == null) {
            Select townSelect = new Select(town);
            townSelect.selectByVisibleText("Baklan");
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#quarter")));
        String quarterPlaceHolder=driver.findElement(By.cssSelector("[for='quarter']")).getText();
        System.out.println(quarterPlaceHolder);
        WebElement quarter=driver.findElement(By.cssSelector("#quarter"));
        Thread.sleep(1000);
        String isDisabledd = quarter.getAttribute("disabled");
        if (isDisabledd == null) {
            Select quarterSelect = new Select(quarter);
            quarterSelect.selectByVisibleText("Balca Mh.");
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Şahıs Şirketi']")));
        driver.findElement(By.xpath("//label[text()='Şahıs Şirketi']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxOfficeCity")));
        String taxOfficeCityPlaceHolder=driver.findElement(By.cssSelector("[for='taxOfficeCity']")).getText();
        System.out.println(taxOfficeCityPlaceHolder);
        Select taxOfficeCitySelect = new Select(driver.findElement(By.cssSelector("#taxOfficeCity")));
        taxOfficeCitySelect.selectByValue("34");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxOffice")));
        String taxOfficePlaceHolder=driver.findElement(By.cssSelector("[for='taxOffice']")).getText();
        System.out.println(taxOfficePlaceHolder);
        WebElement taxOffice=driver.findElement(By.cssSelector("#taxOffice"));
        Thread.sleep(1000);
        String isDisableddd = taxOffice.getAttribute("disabled");
        if (isDisableddd == null) {
            Select taxOfficeSelect = new Select(taxOffice);
            taxOfficeSelect.selectByVisibleText("Adalar Vergi Dairesi");
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxNumber")));
        String taxOrderPlaceHolder=driver.findElement(By.cssSelector("[for='taxNumber']")).getText();
        System.out.println(taxOrderPlaceHolder);
        driver.findElement(By.cssSelector("#taxNumber")).sendKeys("123123123");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#idNumber")));
        String idNumberPlaceHolder=driver.findElement(By.cssSelector("[for='idNumber']")).getText();
        System.out.println(idNumberPlaceHolder);
        driver.findElement(By.cssSelector("#idNumber")).sendKeys("30080432027");


        jb.executeScript("document.querySelector('#endUserLicenceAgreement').click()");
        driver.findElement(By.cssSelector(".btn.btn-new.btn-strong")).click();






    }
}


    

