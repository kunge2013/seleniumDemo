package com.selenium;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverTest {
	static CountDownLatch clt = new CountDownLatch(1);
	static Scanner scanner = new Scanner(System.in);
	static String amount = "";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://xinhe.xinhe360.cn/Login/index.html");
		try {
			
			String username = "15585244326";// scanner.nextLine();
			driver.findElement(By.name("username")).sendKeys(username);

			String password = "123456";// scanner.nextLine();
			driver.findElement(By.name("password")).sendKeys(password);

			System.out.println("请输入验证码：");
			String verCode = scanner.nextLine();
			driver.findElement(By.name("verCode")).sendKeys(verCode);

			List<WebElement> eles = driver.findElements(By.tagName("button"));
			eles.get(0).click();
			Thread.sleep(5000);
			List<WebElement> divs = driver.findElements(By.className("icon-item"));

			/*********************************请输入商品金额：*************************************/
			// 输入金额
			
		
			int  i = 0;
			WebElement submit =  null;
			for(;;) {
				submit = createSubmitHandler( driver);
				submit.click();
				driver.switchTo().alert().accept();
				i++;
				if(1 == 1) break;
			}
			
		} finally {
			
		}
		System.out.println("退出请输入 quit 按回车!");
		while(true) {
			String quitComment = scanner.nextLine();
			if ("quit".equals(quitComment)) {
				clt.countDown();
				break;
			}
		}
		
		clt.await();
		driver.close();
	}
	
	public static WebElement createSubmitHandler(WebDriver driver) {
		System.out.println("请输入商品金额：");
		if(amount.isEmpty()) {
			amount = scanner.nextLine();
		}
		System.out.println("输入金额为 ====" + amount);
		// 动态专区金额输入
		List<WebElement> dtzqs = driver.findElements(By.name("amount"));
		String camount = "";
		for (int i = 0; i < dtzqs.size(); i++) {
			WebElement ele = dtzqs.get(i);
			System.out.println(ele.getAttribute("value"));
			if (ele != null && (camount = ele.getAttribute("value")).length() > 0) {
				if(!camount.equals(amount)) {
					ele.clear();
					ele.sendKeys(amount);
				}
				break;
			}
		}
		
		// 单击确定
		List<WebElement> buttons = driver.findElement(By.id("model6")).findElements(By.tagName("input"));
		WebElement submit = null;
		if (buttons != null && buttons.size() > 0) {
			for(WebElement e : buttons) {
				if ("submit".equals(e.getAttribute("type"))) {
					return e;
				}
			}
		}
		return submit;
	}

}
