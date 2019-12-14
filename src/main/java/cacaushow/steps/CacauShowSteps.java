package cacaushow.steps;

import static cacaushow.core.Driver.getDriver;
import static cacaushow.core.Driver.getDriver;

import cacaushow.core.Driver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CacauShowSteps {
	
	String url = "https://lojavirtual.cacaushow.com.br/";

	@Dado("^que o usuario preenche os dados$")
	public void que_o_usuario_preenche_os_dados() throws Throwable {
		getDriver().get(url);

	}

	

	@Quando("^os dados estao corretos$")
	public void os_dados_estao_corretos() throws Throwable {
	}

	@Entao("^o usuario e cadastrado com sucesso$")
	public void o_usuario_e_cadastrado_com_sucesso() throws Throwable {
	}

}
