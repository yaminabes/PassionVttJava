import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import model.Club;
import model.DAO.ApiConnection;
import model.DAO.ClubDAO;
import model.DAO.exception.ApiException;
import model.User;

public class ClubTest {
    public static void main(String[] args) throws ApiException {
        ApiConnection.init(new User("admin","admin"));
        ClubDAO clubDAO = new ClubDAO();
        System.out.println("Findby \n" + clubDAO.findById(1));
        Club insert = new Club(0,"Yasssssine");
        clubDAO.insert(insert);
        System.out.println("Insert \n" +insert.getId());
        insert.setNom("Edit");
        clubDAO.update(insert);
        System.out.println("Update \n" +clubDAO.findById(insert.getId()));
        clubDAO.delete(insert);
        clubDAO.findAll();
    }
}
