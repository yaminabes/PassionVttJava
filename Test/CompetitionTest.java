import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import model.Competition;
import model.DAO.ApiConnection;
import model.DAO.CompetitionDAO;
import model.DAO.exception.ApiException;
import model.User;

import java.util.Date;

public class CompetitionTest {
    public static void main(String[] args) throws ApiException {
        ApiConnection.init(new User("admin","admin"));
        CompetitionDAO competitionDAO = new CompetitionDAO();
        System.out.println("Findby \n" + competitionDAO.findById(1));
        Date date = new Date();
        Competition insert = new Competition(0,"Test Compet", date );
        competitionDAO.insert(insert);
        System.out.println("Insert \n" +insert.getId());
        insert.setNom("Edit");
        competitionDAO.update(insert);
        System.out.println("Update \n" +competitionDAO.findById(insert.getId()));
        competitionDAO.delete(insert);
        competitionDAO.findAll();
    }
}
