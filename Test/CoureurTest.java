import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import model.Categorie;
import model.Club;
import model.Coureur;
import model.DAO.ApiConnection;
import model.DAO.CategorieDAO;
import model.DAO.ClubDAO;
import model.DAO.CoureurDAO;
import model.DAO.exception.ApiException;
import model.User;

import java.util.Arrays;
import java.util.Date;

public class CoureurTest {
    public static void main(String[] args) throws ApiException {
        ApiConnection.init(new User("admin","admin"));
        CoureurDAO coureurDAO = new CoureurDAO();
        System.out.println("Findall \n" + Arrays.toString(coureurDAO.findAll()));
        System.out.println("Findby \n" + coureurDAO.findById(1));
        Date date = new Date();
        ClubDAO clubDAO = new ClubDAO();
        Club club =  (Club)clubDAO.findById(1);
        CategorieDAO categorieDAO = new CategorieDAO();
        Categorie categorie =  (Categorie) categorieDAO.findById(1);
        Coureur insert = new Coureur(0,"Nom Test","Prenom Test",  "numeroLicence",  club, categorie  );
        coureurDAO.insert(insert);
        System.out.println("Insert \n" +insert.getId());
        insert.setNom("Edit");
        coureurDAO.update(insert);
        System.out.println("Update \n" +coureurDAO.findById(insert.getId()));
        coureurDAO.delete(insert);
        coureurDAO.findAll();
    }
}
