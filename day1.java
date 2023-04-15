package day1;

import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class day1 {

	public static void main(String[] args) {

		/*try (Playwright playwright = Playwright.create()) {
			  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().
					  setHeadless(false));
			  Page page = browser.newPage();
		      page.navigate("https://www.hdfcbank.com/");
		      page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
		 
		    }*/

		String str="shobana_1_company (14212)";
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(str);
		String val = matcher.find() ? matcher.group(1):""; 
		/*
		 * if( matcher.find() ) { System.out.println( matcher.find() ?
		 * matcher.group(1):"" ); val=matcher.group(1); }
		 */
		System.out.println(val);
		
	}

}
