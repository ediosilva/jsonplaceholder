package agibank.com.br;

import dataprovider.DataProviderPosts;
import objetos.Posts;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ValidacaoInsercaoPosts {

    private static String URL = "https://jsonplaceholder.typicode.com/posts/";
    private static int STATUS_CODE_CREATE_SUCESS = 201;

    @Test(dataProvider = "listaPosts", dataProviderClass = DataProviderPosts.class)
    public void validaPosts(int userId, String title, String body) {
        Posts posts = new Posts(userId, title, body);
        Posts postResult = given()
                .header("Content-type", "application/json; charset=UTF-8")
                .body(posts)
                .post(URL)
                .then()
                .statusCode(STATUS_CODE_CREATE_SUCESS)
                .extract()
                .body().as(Posts.class);
        Assert.assertEquals(postResult.getTitle(), posts.getTitle());
        Assert.assertEquals(postResult.getBody(), posts.getBody());
        Assert.assertEquals(postResult.getUserId(), posts.getUserId());
        Assert.assertNotNull(postResult.getId());
    }


}
