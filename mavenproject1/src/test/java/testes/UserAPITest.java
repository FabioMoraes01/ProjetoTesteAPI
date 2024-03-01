package testes;

import io.restassured.RestAssured;
import org.junit.Test;
import projeto_testeapi.UserData;

import static io.restassured.RestAssured.given;
import net.minidev.json.JSONObject;
import static org.hamcrest.CoreMatchers.containsString; // Hamcrest utilizado para fazer o match entre as asserções
import static org.junit.Assert.assertEquals;

public class UserAPITest {

    // GET SINGLE USER
    @Test
    public void testGetUserDetails() {
        RestAssured.baseURI = "https://reqres.in/api"; // Aqui o Rest Assured foi utilizado para construir a URL e complementar com a string em .get

        UserData user = given()
            .get("/users/2")
            .then()
            .statusCode(200)
            .extract()
            .as(UserData.class);

        // Usando asserções do JUnit
        assertEquals(2, user.getData().getId());
        assertEquals("Janet", user.getData().getFirst_name()); 
        assertEquals("Weaver", user.getData().getLast_name());
        
        // Para uma melhor validação, caso o first name ou last name seja trocado, e não corresponda com o id, o teste falhará.
    }

    @Test // POST CREATE
    public void postUserTest(){
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "morpheus");  
        requestParams.put("job", "leader");

        given().
                body(requestParams.toJSONString()).
        when().
                post("https://reqres.in/api/users").
        then().
                statusCode(201).
                body(containsString("createdAt"));
    }
    
}


    

       
       
    
    
    



