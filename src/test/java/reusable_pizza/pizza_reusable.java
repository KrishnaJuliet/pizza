package reusable_pizza;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//public class pizza_reusable {
	public class pizza_reusable {
		public static WebDriver driver;
		private static String newwindowmessage;
			public static WebDriver launchbrowser() {
				
			//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
				ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			driver= new ChromeDriver(op);
				return driver ;
				
			}
			public static void loadurl(String url) {
				driver.get(url);
			}
			public static void maxiwindow() {
				driver.manage().window().maximize();
			}
			public static void sendinput(WebElement element,String input) {
				element.sendKeys(input);
			}
			public static void buttonclick(WebElement element) {
				element.click();
			}
			public static void id(WebElement element,String input) {
				element = driver.findElement(By.id(input));
			}
			public static void name(WebElement element,String input) {
				element = driver.findElement(By.name(input));
			}
			public static void classname(WebElement element,String input) {
				element = driver.findElement(By.className(input));
			}
			public static void xpath(WebElement element,String input) {
				element = driver.findElement(By.xpath(input));
			}
			public static void linktext(WebElement element,String input) {
				element = driver.findElement(By.linkText(input));
			}
			public static void partiallinktext(WebElement element,String input) {
				element = driver.findElement(By.partialLinkText(input));
			}
			public static void tagname(List<WebElement>element,String input) {
				element = driver.findElements(By.partialLinkText(input));
			
			}
		//Dropdown
			public static void Selectindex(WebElement web,int i) {
				 Select s= new Select(web);
				 s.selectByIndex(i);
			}
			public static void selectvisibletext(WebElement web,String text) {
				Select s= new Select(web);
				s.selectByVisibleText(text);
			}
			public static void selectvalue(WebElement web,String value) {
				Select s= new Select(web);
				s . selectByValue(value);
			}
		//Alert methods
			public static void accept() {
				org.openqa.selenium.Alert obj = driver.switchTo().alert();
				obj.accept();
			}	
			public static void dismiss(WebDriver driver) {
				org.openqa.selenium.Alert obj = driver.switchTo().alert();
				obj.dismiss();
			}	
			public static void alertsend(WebDriver driver,String s) {
				org.openqa.selenium.Alert obj = driver.switchTo().alert();
				obj.sendKeys(s);
				
			}
		//Window Commands
			public static void max(WebDriver Driver) {
				driver.manage().window().maximize();
			}
			public static void fullscreen() {
				driver.manage().window().fullscreen();
			}
			public static void close() {
				driver.close();
			}
			public static void quit() {
				driver.quit();
			}
		//screenshot
			public static void screenshot(String s) throws IOException {
				TakesScreenshot obj = (TakesScreenshot)driver;
				File source = obj.getScreenshotAs(OutputType.FILE);
				File distination = new File(s);
				org.openqa.selenium.io.FileHandler.copy(source, distination);
			}
		//javascriptexecutor
			 public static void scrolldown() {
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("window,scrollBy(0,1000)");
			 }
			 public static void scrollup() {
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("window,scrollBy(0,-5000)");
			}
			 public static void click(WebElement Element) {
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("argument[webelement name].click();",Element);
			 }
			 public static void scrollintoview(WebElement element) {
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("argument[webelement name]. scrollintoview();",element);
				 
			 }
		//Actions method
			 public static void movetoelement(WebElement element) {
				 Actions obj = new Actions(driver);
				 obj.moveToElement(element).perform();
			 }
			 public static void draganddrop(WebElement from , WebElement to ) {
				 Actions obj = new Actions(driver);
				 obj.dragAndDrop(from, to).perform();
			 }
			 public static void doubleclick() {
				 Actions obj = new Actions(driver);
				 obj.doubleClick().perform();
				 
			 }
		//Robot
			 public static void keypress_enter() throws AWTException {
				 Robot rob = new Robot();
				 rob.keyPress(KeyEvent.VK_ENTER);
			 }
			 public static void keyrelease_enter() throws AWTException {
				 Robot rob = new Robot();
				 rob.keyRelease(KeyEvent.VK_ENTER);
			 }
			 public static void keypress_up() throws AWTException {
				 Robot rob = new Robot();
				 rob.keyPress(KeyEvent.VK_UP);
			 }
			 public static void keyrelease_up() throws AWTException {
				 Robot rob = new Robot();
				 rob.keyRelease(KeyEvent.VK_UP);
			 } 
			 public static void keypress_down() throws AWTException {
				 Robot rob = new Robot();
				 rob.keyPress(KeyEvent.VK_DOWN);
			 }
			 public static void keyrelease_down() throws AWTException {
				 Robot rob = new Robot();
				 rob.keyRelease(KeyEvent.VK_DOWN);
				 
			 }
		//Frame
			 public static void indexframe (int  i) {
				 driver.switchTo().frame(i);
			 }
			 public static void nameframe (String name) {
				 driver.switchTo().frame(name);
			 }
			 public static void webelement (int web) {
				 driver.switchTo().frame(web);
				 
			 }
		//window handling
			public static void windowhandle() {
				String parent = driver.getWindowHandle();
				Set<String> allwindow = driver.getWindowHandles();
				for(String newwindowmessage : allwindow);
				if(!(parent.equals(allwindow))) {
					driver.switchTo().window(newwindowmessage);
				}
				
			}
				

				 
		        public void parentswitch() {
		        	driver.switchTo().parentFrame();
		        	
		        }

		 
		}	
			



