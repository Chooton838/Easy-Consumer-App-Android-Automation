import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class consumer_login {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException {
		
		//Click on "Enter Mobile Number/Email"
		driver.findElementById("sslwireless.android.easy:id/enterLayout").click();
		Thread.sleep(2000);
		
		/*System.out.println("Please Enter the Phone Number: ");
		String phone_number = sc.nextLine();
				
		System.out.println("Please Enter the PIN: ");
		String password = sc.nextLine();*/
		
		String phone_number = "01689343838";
		String password = "123456";
		
		//Give Mobile Number
		driver.findElementById("sslwireless.android.easy:id/email_or_phone_et").setValue(phone_number);
		Thread.sleep(2000);
		
		//Click on Proceed
		driver.findElementById("sslwireless.android.easy:id/proceed_btn").click();
		Thread.sleep(5000);
		
		//Give Password
		driver.findElementById("sslwireless.android.easy:id/userPass").setValue(password);
		Thread.sleep(2000);
		
		//Click on Proceed
		driver.findElementById("sslwireless.android.easy:id/proceed_btn").click();
		Thread.sleep(5000);
		
		System.out.println("Welcome to The Easy Consumer App\n");
		System.out.println(driver.findElementById("sslwireless.android.easy:id/textTop").getText());
		System.out.println("\n");
		
	}
}