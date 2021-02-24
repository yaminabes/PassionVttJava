import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import model.Categorie;
import model.DAO.ApiConnection;
import model.DAO.CategorieDAO;
import model.DAO.exception.ApiException;
import model.User;

public class CategorieTest {
    public static void main(String[] args) throws ApiException {
        ApiConnection.init(new User("admin","admin"));
        CategorieDAO categorieDAO = new CategorieDAO();
        System.out.println("Findby \n" + categorieDAO.findById(1));
        Categorie insert = new Categorie(0,"Yasssssine");
        categorieDAO.insert(insert);
        System.out.println("Insert \n" +insert.getId());
        insert.setNom("Edit");
        categorieDAO.update(insert);
        System.out.println("Update \n" +categorieDAO.findById(insert.getId()));
        categorieDAO.delete(insert);
        categorieDAO.findAll();
    }
}
