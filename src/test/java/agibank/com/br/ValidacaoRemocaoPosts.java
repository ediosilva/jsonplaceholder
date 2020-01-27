package agibank.com.br;

import dataprovider.DataProviderPosts;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValidacaoRemocaoPosts {

    private static String URL = "https://jsonplaceholder.typicode.com/posts/{id}";
    private static int STATUS_CODE_DELETE_SUCESS = 200;

    @Test(dataProvider = "idDelete", dataProviderClass = DataProviderPosts.class)
    public void validaExcluirPosts(int id) {
        given()
                .header("Content-type", "application/json; charset=UTF-8")
                .pathParam("id", id)
                .delete(URL)
                .then()
                .statusCode(STATUS_CODE_DELETE_SUCESS);
    }
}
