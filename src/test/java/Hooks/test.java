package Hooks;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Enter;

public class test {

	public static void main(String[] args) {

		WebDriver driver = null;

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		element.sendKeys("s");


		Scanner scanner = new Scanner(System.in);
		System.out.println("enter you string : ");

		String str = scanner.nextLine();

		str = str.toLowerCase().replaceAll("\\$", "");

		Map<Character, Integer> countm = new LinkedHashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			countm.put(ch, countm.getOrDefault(ch, 0) + 1);
		}

		countm.forEach((a, b) -> {
			if (b > 1) {
				System.out.println(a + "" + b);
			}
		});
	}

}