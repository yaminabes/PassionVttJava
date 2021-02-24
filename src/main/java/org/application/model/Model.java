package model;

import model.DAO.*;

public class Model {
    public CategorieDAO categorieDAO ;
    public ClubDAO clubDAO;
    public CompetitionDAO competitionDAO;
    public CoureurDAO coureurDAO;
    public CourseDAO courseDAO;
    public ParticipationDAO participationDAO;
    public TourDAO tourDAO;
    public UserDAO userDAO;

    public void init(){
        this.categorieDAO = new CategorieDAO();
        this.clubDAO = new ClubDAO();
        this.competitionDAO = new CompetitionDAO();
        this.coureurDAO = new CoureurDAO();
        this.courseDAO = new CourseDAO();
        this.participationDAO = new ParticipationDAO();
        this.courseDAO = new CourseDAO();
        this.tourDAO = new TourDAO();
        this.userDAO = new UserDAO();
    }
}
