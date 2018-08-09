import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author Nils Schuette via frontendtest.org
 */
public class RunDeleteTest {
    static WebDriver webDriver;
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(final String[] args) throws InterruptedException {
        // Telling the system where to find the chrome driver
        System.setProperty(
                "webdriver.chrome.driver",
                "/Users/jinum/Documents/chromedriver");

        // Open the Chrome browser
        webDriver = new ChromeDriver();

            // Open google.com
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
           
           // Type in the Employee ID
           webDriver.findElement(By.xpath("(//input[@name='empid'])[2]")).sendKeys("6");
      

           // Click the Submit button
          webDriver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
          
          // Type in the Employee ID
          webDriver.findElement(By.xpath("(//input[@name='empid'])[2]")).sendKeys("7");
     

          // Click the Submit button
         webDriver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click(); 
         
         
         // Type in the Employee ID
         webDriver.findElement(By.xpath("(//input[@name='empid'])[2]")).sendKeys("8");
    

         // Click the Submit button
        webDriver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
        
        // Type in the Employee ID
        webDriver.findElement(By.xpath("(//input[@name='empid'])[2]")).sendKeys("8675309");
   

        // Click the Submit button
       webDriver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();



        // Waiting a bit before closing
        Thread.sleep(7000);

        // Closing the browser and WebDriver
        webDriver.close();
        webDriver.quit();
    }
}
