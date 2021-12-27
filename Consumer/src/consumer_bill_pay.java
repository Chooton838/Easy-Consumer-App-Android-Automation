import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class consumer_bill_pay {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException {
		
		driver.findElementById("sslwireless.android.easy:id/utilityImg").click();
		Thread.sleep(2000);

	}
}