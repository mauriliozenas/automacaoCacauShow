package cacaushow.core;

import org.openqa.selenium.By;
import static cacaushow.core.Driver.getDriver;

import org.openqa.selenium.support.ui.Select;

public class BasePage  {
	
	public void clicar(By by) {
		getDriver().findElement(by).click();		
	}
	
	public void preencher(By by, String preencher) {
		getDriver().findElement(by).sendKeys(preencher);
	}
	
	public void selecionar(By by, int index) {
		Select select = new Select(getDriver().findElement(by));
		select.selectByIndex(index);
		}
	
	}




