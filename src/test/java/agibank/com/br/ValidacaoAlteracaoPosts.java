package agibank.com.br;

import dataprovider.DataProviderPosts;
import objetos.Posts;
import org.testng.Assert;
import org.testng.IExecutionListener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValidacaoAlteracaoPosts implements IExecutionListener {

    private static String URL = "https://jsonplaceholder.typicode.com/posts/{id}";
    private static int STATUS_CODE_PUT_SUCESS = 200;

    @Test(dataProvider = "listaComID", dataProviderClass = DataProviderPosts.class)
    public void validaPut(int userId, int id, String title, String body) {
        Posts put = new Posts(userId, id, title, body);
        Posts putResult = given()
                .header("Content-type", "application/json; charset=UTF-8")
                .pathParam("id", id)
                .body(put)
                .put(URL)
                .then()
                .statusCode(STATUS_CODE_PUT_SUCESS)
                .extract()
                .body().as(Posts.class);
        Assert.assertEquals(putResult.getTitle(), put.getTitle());
        Assert.assertEquals(putResult.getBody(), put.getBody());
        Assert.assertEquals(putResult.getUserId(), put.getUserId());
        Assert.assertNotNull(putResult.getId());
    }

    @Test(expectedExceptions = ClassCastException.class)
    public void validaPostsExcecao() {
        String id = given()
                .pathParam("id", 1)
                .get("https://jsonplaceholder.typicode.com/posts/{id}")
                .then()
                .extract()
                .path("id");
    }
}
