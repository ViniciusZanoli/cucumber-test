package stepsDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public class teste {

    private Response response;
    private RequestSpecification request;

    @Dado("^que escolho somar$")
    public void que_escolho_somar() throws Throwable {
        System.out.println("Iniciando Test");
        request = given();
        request.header("accept", "application/json");
    }

    @Quando("^eu preencho o primeiro valor com '(\\d+)'$")
    public void eu_preencho_o_primeiro_valor_com(int arg1) throws Throwable {
        response = request.get("https://reqres.in/api/users?page=2");
        response.prettyPrint();
    }

    @Então("^eu devo ver o resultado '(\\d+)'$")
    public void eu_devo_ver_o_resultado(int arg1) throws Throwable {

    }

}