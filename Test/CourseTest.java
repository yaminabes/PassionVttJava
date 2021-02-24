import model.Course;
import model.DAO.ApiConnection;
import model.DAO.CategorieDAO;
import model.DAO.CourseDAO;
import model.DAO.exception.ApiException;
import model.Participation;
import model.User;

public class CourseTest {
    public static void main(String[] args) throws ApiException {
        ApiConnection.init(new User("admin","admin"));
        CourseDAO courseDAO = new CourseDAO();
        Course course = (Course)courseDAO.findById(1);
        System.out.println("Findby \n" + course);
        System.out.println("All partants : " + course.isAllPartants());
        CategorieDAO categorieDAO = new CategorieDAO();
        courseDAO.findAll();
        Participation[] participations = course.getParticipations();
    }
}
