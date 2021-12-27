import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.PointOption.point;
//import static io.appium.java_client.touch.offset.ElementOption.element;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class scroll_down {

	public static void main(AndroidDriver<MobileElement> driver) throws InterruptedException {

		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int top_y = (int)(height*0.60);
		int bottom_y = (int) (height*0.10);
		
		System.out.println("coordinates :" + x + "  "+ top_y + " "+ bottom_y);

		@SuppressWarnings("rawtypes")
		TouchAction ta = new TouchAction(driver);
		
		ta.longPress(point(x,top_y)).waitAction(waitOptions(ofSeconds(2))).moveTo(point(x,bottom_y)).release().perform();
		
		//ta.longPress(element(e1)).waitAction(waitOptions(ofSeconds(2))).moveTo(element(e2)).release().perform();

	}
}
