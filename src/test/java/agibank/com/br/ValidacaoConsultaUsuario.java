package agibank.com.br;

import dataprovider.DataProviderUsuario;
import objetos.Usuario;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValidacaoConsultaUsuario {

    private static String URL = "https://jsonplaceholder.typicode.com/users/{id}";
    private static String URL_LIST = "https://jsonplaceholder.typicode.com/users/";
    private static int STATUS_CODE_GET_SUCCESS = 200;
    private static int STATUS_CODE_NOT_FOUND = 404;


    @Test(dataProvider = "getUsuarios", dataProviderClass = DataProviderUsuario.class)
    public void validaUsuarios(String nome, String email, int id) {
        Usuario usuario = given()
                .pathParam("id", id)
                .relaxedHTTPSValidation()
                .get(URL)
                .then()
                .statusCode(STATUS_CODE_GET_SUCCESS)
                .extract()
                .body().as(Usuario.class);
        Assert.assertEquals(usuario.getEmail(), email);
        Assert.assertEquals(usuario.getName(), nome);
    }

    @Test(expectedExceptions = ClassCastException.class)
    public void validaUsuarioIdInteiro() {
        String id = given()
                .pathParam("id", 1)
                .get(URL)
                .then()
                .statusCode(STATUS_CODE_GET_SUCCESS)
                .extract()
                .path("id");
    }

    @Test(expectedExceptions = ClassCastException.class)
    public void validaListaException() {
        String id = given()
                .get(URL_LIST)
                .then()
                .statusCode(STATUS_CODE_GET_SUCCESS)
                .extract()
                .path("id");
    }

    @Test
    public void validaBuscaUsuarioInexistente() {
        String id = given()
                .pathParam("id", 9999)
                .get(URL)
                .then()
                .statusCode(STATUS_CODE_NOT_FOUND)
                .extract()
                .path("id");
    }
}
