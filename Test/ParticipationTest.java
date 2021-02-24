import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import model.*;
import model.DAO.*;
import model.DAO.exception.ApiException;

import java.util.Arrays;
import java.util.Date;

public class ParticipationTest {
    public static void main(String[] args) throws ApiException {
        ApiConnection.init(new User("admin","admin"));
        ParticipationDAO participationDAO = new ParticipationDAO();
        System.out.println("Findall \n" + Arrays.toString(participationDAO.findAll()));
        System.out.println("Findby \n" + participationDAO.findById(1));
        Date date = new Date();
        CourseDAO courseDAO = new CourseDAO();
        Course course =  (Course)courseDAO.findById(1);
        CoureurDAO coureurDAODAO = new CoureurDAO();
        Coureur coureur =  (Coureur) coureurDAODAO.findById(1);
        Participation insert = new Participation(0, 10123, 30, true, 1, false, 0, coureur, course );
        participationDAO.insert(insert);
        System.out.println("Insert \n" +insert.getId());
        date = new Date(1610456806);
        insert.setNumeroPlaque(123456);
        participationDAO.update(insert);
        System.out.println("Update \n" +participationDAO.findById(insert.getId()));
        participationDAO.delete(insert);
        participationDAO.findAll();
    }
}
