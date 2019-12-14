$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cacaushow.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    },
    {
      "line": 2,
      "value": "#encoding UTF-8"
    }
  ],
  "line": 5,
  "name": "Criar Conta no Site",
  "description": "\t\t\t\t\t\tEu como usuario gostaria\r\n\t\t\t\t\t\tde criar uma conta no site",
  "id": "criar-conta-no-site",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@geral"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Criar conta no site com sucesso",
  "description": "",
  "id": "criar-conta-no-site;criar-conta-no-site-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 10,
  "name": "que o usuario preenche os dados",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "os dados estao corretos",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "o usuario e cadastrado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "CacauShowSteps.que_o_usuario_preenche_os_dados()"
});
formatter.result({
  "duration": 32124156300,
  "status": "passed"
});
formatter.match({
  "location": "CacauShowSteps.os_dados_estao_corretos()"
});
formatter.result({
  "duration": 39800,
  "status": "passed"
});
formatter.match({
  "location": "CacauShowSteps.o_usuario_e_cadastrado_com_sucesso()"
});
formatter.result({
  "duration": 40000,
  "status": "passed"
});
});