package Com.qa.ShoeStore.ShoeStore;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Base;
import brandSearchBox.BrandSearch;

public class BrandSearchTest extends Base {

	
	 {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void search() throws IOException {
		driver= initilizrDriver();	
		SoftAssert softAssertion= new SoftAssert();
		BrandSearch bs = new BrandSearch(driver);
		bs.searchText();
		bs.searchClick();
		String text = bs.textGet();
		softAssertion.assertEquals(text, "ALDO's shoes");
		softAssertion.assertAll();
		
	}
}
