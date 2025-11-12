package globalsqatestingframework.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
	private WebDriver driver_f;
	private WebDriverWait frames_wait;
	
	public Frames(WebDriver driver) {
		this.driver_f = driver;
		this.frames_wait = new WebDriverWait(driver_f, Duration.ofSeconds(10));
	}
	
}
