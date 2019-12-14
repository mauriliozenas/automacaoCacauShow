package cacaushow;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "cacaushow" }, features = {
		"src/main/java/cacaushow/feature" }, plugin = { "pretty",
				"html:Reports/cucumber" }, tags = { "~@ignore", "@geral" })

public class Runner {
	
	// Classe Runner para teste;

	@AfterClass
	public static void encerrarTeste() {

	}

}
