
package learnJavaConcepts;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		cal.roll(Calendar.DATE, -1);
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy");
		String checkInDate = formatter.format(cal.getTime());
		System.out.println(checkInDate);

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.id("datepicker2")).click();

		driver.findElement(By.xpath("//a[contains(@title,'" + checkInDate + "')]")).click();

	}

}
