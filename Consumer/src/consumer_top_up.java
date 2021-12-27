import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class consumer_top_up {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("sslwireless.android.easy:id/topUpImg").click();
		
		System.out.println("Welcome to Easy Top Up Panel");
		
		//System.out.println("Please Enter your Mobile Number: ");
		//String m_number = sc.nextLine();
		
		String m_number = "01689343838";
		String r_amount = "100";
		
		driver.findElementById("sslwireless.android.easy:id/mobNumber").click();
		
		driver.findElementById("sslwireless.android.easy:id/mobNumber").setValue(m_number);
		
		driver.findElementById("sslwireless.android.easy:id/continueBtn").click();
		
		
		//Select Operator
		List<MobileElement> m_operators = driver.findElementsById("sslwireless.android.easy:id/rootLayout");
		for(int i=0; i<m_operators.size(); i++) {
			int j = i+1;
			System.out.println("Select "+ j + " for: " + m_operators.get(i).getText());
		}
		
		System.out.println("Please Enter your choise: ");
		String ch2 = sc.nextLine();
		
		try {
			int int_ch2 = Integer.parseInt(ch2);
					
			if (int_ch2>=1 && int_ch2<=m_operators.size()) {
				int r = int_ch2 - 1;
				m_operators.get(r).click();
			}
			else {
				System.out.println("Sorry. You put Wrong Value");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Sorry. You put Wrong Value");
		}
		
		//Select Connection Type
		List<MobileElement> operator_connections = driver.findElementsByClassName("android.view.ViewGroup");
		for(int i=0; i<operator_connections.size(); i++) {
			int j = i+1;
			System.out.println("Select "+ j + " for: " + operator_connections.get(i).getText());
		}
		
		System.out.println("Please Enter your choise: ");
		String ch3 = sc.nextLine();
		
		try {
			int int_ch3 = Integer.parseInt(ch3);
					
			if (int_ch3>=1 && int_ch3<=operator_connections.size()) {
				int r = int_ch3 - 1;
				operator_connections.get(r).click();
			}
			else {
				System.out.println("Sorry. You put Wrong Value");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Sorry. You put Wrong Value");
		}
		
		//Amount
		//System.out.println("Please Enter Recharge Amount: ");
		//String r_amount = sc.nextLine();
		driver.findElementById("sslwireless.android.easy:id/amount").setValue(r_amount);
		Thread.sleep(2000);
		
		driver.findElementById("sslwireless.android.easy:id/proceedToRecharge").click();
		Thread.sleep(5000);
		
		driver.findElementById("sslwireless.android.easy:id/proceedToRecharge").click();
		Thread.sleep(10000);
		
		driver.findElementById("sslwireless.android.easy:id/tv_pay").click();
		Thread.sleep(5000);
		
		//TouchActions t = new TouchActions(driver);
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("argument[0].scrollIntoView();", driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.GridView/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.widget.Button"));
		WebElement chk=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.GridView/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.widget.Button");
		chk.click();
		
		driver.findElementById("sslwireless.android.easy:id/text_message").click();

	}
}
