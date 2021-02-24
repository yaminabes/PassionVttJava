import model.DAO.ApiConnection;
import model.DAO.exception.ApiException;
import model.User;
import org.junit.Test;

public class ApiConnectionUnitTest {
    @Test(expected = ApiException.class)
    public void testWrongCredentials() throws ApiException {
        User user = new User("faux","faux");
        ApiConnection.init(user);
    }
}
