import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import model.*;
import model.DAO.*;
import model.DAO.exception.ApiException;

import java.util.Arrays;
import java.util.Date;

public class TourTest {
    public static void main(String[] args) throws ApiException {
        ApiConnection.init(new User("admin","admin"));
        TourDAO tourDAO = new TourDAO();
        CourseDAO courseDAO = new CourseDAO();
        CoureurDAO coureurDAO = new CoureurDAO();
        Course course =  (Course)courseDAO.findById(1);
        Coureur coureur =  (Coureur) coureurDAO.findById(1);
        Tour insert = new Tour(0, 123, 3000, false, coureur, course);
        tourDAO.insert(insert);
        System.out.println("Insert \n" +insert);
        insert.setDnf(true);
        tourDAO.update(insert);
        System.out.println("Update \n" +tourDAO.findById(6));
        //tourDAO.delete(insert);
    }
}
