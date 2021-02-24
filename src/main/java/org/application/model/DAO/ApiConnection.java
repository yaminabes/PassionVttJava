package model.DAO;

import kong.unirest.JsonNode;
import model.DAO.exception.ApiException;
import model.User;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class ApiConnection {
    private final static String BASE_URL = "https://127.0.0.1:8000/api/";
    private final static String BASE_AUTH_URL = "https://127.0.0.1:8000/authentication_token";

    private ApiConnection() {};

    public static void init(User user) throws ApiException{
        Unirest.config().verifySsl(false)
                .setDefaultHeader("Content-Type", "application/json");
        String bearer = getBearer(user);
        Unirest.config().defaultBaseUrl(BASE_URL)
                .setDefaultHeader("Authorization","Bearer " + bearer);
    }

    private static String getBearer(User user) throws ApiException {
        HttpResponse<JsonNode> response = Unirest.post(BASE_AUTH_URL)
                .body(user)
                .asJson();
        if (response.getStatus() != 200 ) throw new ApiException(response.getStatusText());
        return response.getBody().getObject().getString("token");
    }
}
