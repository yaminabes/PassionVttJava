import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import model.Categorie;
import model.Competition;
import model.User;
import model.DAO.ApiConnection;
import model.DAO.CategorieDAO;
import model.DAO.CompetitionDAO;
import model.DAO.UserDAO;
import model.DAO.exception.ApiException;
import model.User;

import java.util.Arrays;
import java.util.Date;

public class UserTest {
    public static void main(String[] args) throws ApiException {
        ApiConnection.init(new User("admin","admin"));
        UserDAO userDAO = new UserDAO();
        System.out.println("Findall \n" + Arrays.toString(userDAO.findAll()));
        System.out.println("Findby \n" + userDAO.findById(7));
        User insert = new User("test", "test");
        userDAO.insert(insert);
        System.out.println("Insert \n" +insert.getId());
        insert.setUsername("Test Update");
        userDAO.update(insert);
        System.out.println("Update \n" +userDAO.findById(insert.getId()));
        userDAO.delete(insert);
        userDAO.findAll();
    }
}
