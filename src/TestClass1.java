
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

 import org.openqa.selenium.By;

 import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

 //import org.testng.Assert;

 //import org.testng.annotations.BeforeClass;

 //import org.testng.annotations.Test;

 //import org.testng.annotations.AfterClass;

 

 public class TestClass1 {
             
           protected static WebDriver webDriver;

            protected static String result;

            @BeforeClass

 public static void setup()  {

             // Telling the system where to find the chrome driver
        System.setProperty(
                "webdriver.chrome.driver",
                "/Users/jinum/Documents/chromedriver");


            // Open the Chrome browser
        webDriver = new ChromeDriver();

            //wd = new FirefoxDriver();

            webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

           }

            @Test

 void Testcase1() {
              
                  // Open Employee site
            webDriver.navigate().to("http://linuxtarget:9090/");
            
            
            // Type in the Employee ID
            webDriver.findElement(By.xpath("(//input[@name='empid'])[2]")).sendKeys("1");
       

            // Click the Submit button
           webDriver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
                
            
            // Type in the Employee ID
            webDriver.findElement(By.xpath("(//input[@name='empid'])[2]")).sendKeys("2");
       

            // Click the Submit button
           webDriver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click(); 
            
            // Type in the Employee ID
            webDriver.findElement(By.xpath("(//input[@name='empid'])[2]")).sendKeys("3");
       

            // Click the Submit button
           webDriver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();  
            
            // Type in the Employee ID
            webDriver.findElement(By.xpath("(//input[@name='empid'])[2]")).sendKeys("4");
       

            // Click the Submit button
           webDriver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();  
            
         // Type in the Employee ID
            webDriver.findElement(By.xpath("(//input[@name='empid'])[2]")).sendKeys("5");
       

            // Click the Submit button
           webDriver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();


            // Waiting a bit before closing
        //Thread.sleep(7000);
              
            }

           

            @Test

 void Testcase2() {

                // Open google.com
                webDriver.navigate().to("http://linuxtarget:9090/");
                
             // Type in the Employee ID
                webDriver.findElement(By.id("empid")).sendKeys("20");
                
                // Type in the First Name
                webDriver.findElement(By.id("firstname")).sendKeys("Matt");

               // Type in the Last Name
                webDriver.findElement(By.id("lastname")).sendKeys("Sheumeck");

               // Type in the Dept Name
                webDriver.findElement(By.id("deptname")).sendKeys("SE");

                // Type in the City
                webDriver.findElement(By.id("city")).sendKeys("Sydney");

                // Click the Submit button
               webDriver.findElement(By.xpath("(//button[contains(text(),'Add')])")).click();

               // Open google.com
                //webDriver.navigate().to("http://linuxtarget:9090/");
                
             // Type in the Employee ID
                webDriver.findElement(By.id("empid")).sendKeys("21");
                
                // Type in the First Name
                webDriver.findElement(By.id("firstname")).sendKeys("Soi");

               // Type in the Last Name
                webDriver.findElement(By.id("lastname")).sendKeys("Inoue");

               // Type in the Dept Name
                webDriver.findElement(By.id("deptname")).sendKeys("SE");

                // Type in the City
                webDriver.findElement(By.id("city")).sendKeys("Tokyo");

                // Click the Submit button
               webDriver.findElement(By.xpath("(//button[contains(text(),'Add')])")).click();


         // Type in the Employee ID
                webDriver.findElement(By.id("empid")).sendKeys("22");
                
                // Type in the First Name
                webDriver.findElement(By.id("firstname")).sendKeys("Mark");

               // Type in the Last Name
                webDriver.findElement(By.id("lastname")).sendKeys("Rogerson");

               // Type in the Dept Name
                webDriver.findElement(By.id("deptname")).sendKeys("Sales");

                // Type in the City
                webDriver.findElement(By.id("city")).sendKeys("Sydney");

                // Click the Submit button
               webDriver.findElement(By.xpath("(//button[contains(text(),'Add')])")).click();
             

               // Type in the Employee ID
                webDriver.findElement(By.id("empid")).sendKeys("23");
                
                // Type in the First Name
                webDriver.findElement(By.id("firstname")).sendKeys("Jinu");

               // Type in the Last Name
                webDriver.findElement(By.id("lastname")).sendKeys("VM");

               // Type in the Dept Name
                webDriver.findElement(By.id("deptname")).sendKeys("SE");

                // Type in the City
                webDriver.findElement(By.id("city")).sendKeys("Singapore");

                // Click the Submit button
               webDriver.findElement(By.xpath("(//button[contains(text(),'Add')])")).click();


              // Type in the Employee ID
                webDriver.findElement(By.id("empid")).sendKeys("24");
                
                // Type in the First Name
                webDriver.findElement(By.id("firstname")).sendKeys("Mike");

               // Type in the Last Name
                webDriver.findElement(By.id("lastname")).sendKeys("Cohen");

               // Type in the Dept Name
                webDriver.findElement(By.id("deptname")).sendKeys("Sales");

                // Type in the City
                webDriver.findElement(By.id("city")).sendKeys("Melbourne");

                // Click the Submit button
               webDriver.findElement(By.xpath("(//button[contains(text(),'Add')])")).click();

            // Type in the Employee ID
                webDriver.findElement(By.id("empid")).sendKeys("25");
                
                // Type in the First Name
                webDriver.findElement(By.id("firstname")).sendKeys("Koji");

               // Type in the Last Name
                webDriver.findElement(By.id("lastname")).sendKeys("Yoshikawa");

               // Type in the Dept Name
                webDriver.findElement(By.id("deptname")).sendKeys("Sales");

                // Type in the City
                webDriver.findElement(By.id("city")).sendKeys("Tokyo");

                // Click the Submit button
               webDriver.findElement(By.xpath("(//button[contains(text(),'Add')])")).click();

           // Type in the Employee ID
                webDriver.findElement(By.id("empid")).sendKeys("26");
                
                // Type in the First Name
                webDriver.findElement(By.id("firstname")).sendKeys("Imran");

               // Type in the Last Name
                webDriver.findElement(By.id("lastname")).sendKeys("Ghouri");

               // Type in the Dept Name
                webDriver.findElement(By.id("deptname")).sendKeys("SE");

                // Type in the City
                webDriver.findElement(By.id("city")).sendKeys("Melbourne");

                // Click the Submit button
               webDriver.findElement(By.xpath("(//button[contains(text(),'Add')])")).click();

         // Type in the Employee ID
                webDriver.findElement(By.id("empid")).sendKeys("27");
                
                // Type in the First Name
                webDriver.findElement(By.id("firstname")).sendKeys("Bryan");

               // Type in the Last Name
                webDriver.findElement(By.id("lastname")).sendKeys("Day");

               // Type in the Dept Name
                webDriver.findElement(By.id("deptname")).sendKeys("Sales");

                // Type in the City
                webDriver.findElement(By.id("city")).sendKeys("Singapore");

                // Click the Submit button
               webDriver.findElement(By.xpath("(//button[contains(text(),'Add')])")).click();



             }



           @AfterClass

           public static void teardown()  {

            // Closing the browser and WebDriver
        webDriver.close();
        webDriver.quit();

             }

 }