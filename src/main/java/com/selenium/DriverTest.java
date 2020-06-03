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

			System.out.println("��������֤�룺");
			String verCode = scanner.nextLine();
			driver.findElement(By.name("verCode")).sendKeys(verCode);

			List<WebElement> eles = driver.findElements(By.tagName("button"));
			eles.get(0).click();
			Thread.sleep(5000);
			List<WebElement> divs = driver.findElements(By.className("icon-item"));

			/*********************************��������Ʒ��*************************************/
			// ������
			
		
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
		System.out.println("�˳������� quit ���س�!");
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
		System.out.println("��������Ʒ��");
		if(amount.isEmpty()) {
			amount = scanner.nextLine();
		}
		System.out.println("������Ϊ ====" + amount);
		// ��̬ר���������
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
		
		// ����ȷ��
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
