package model;

import java.util.Date;

public class Course extends Entity{
    private Date heureDepart ;
    private int distance ;
    private int nbTour ;
    private Categorie categorie ;
    private Competition competition ;
    private Participation[] participations;

    public Course(int id, Date heureDepart, int distance, int nbTour, Categorie categorie, Competition competition, Participation[] participations) {
        super(id);
        this.heureDepart = heureDepart;
        this.distance = distance;
        this.nbTour = nbTour;
        this.categorie = categorie;
        this.competition = competition;
        this.participations = participations;
    }

    /*
    * Getter and setter
    * */

    public Date getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Date heureDepart) {
        this.heureDepart = heureDepart;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getNbTour() {
        return nbTour;
    }

    public void setNbTour(int nbTour) {
        this.nbTour = nbTour;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Participation[] getParticipations() { return participations; }

    public void setParticipations(Participation[] participations) {  this.participations = participations; }

    @Override
    public TypeClass getTypeClass() {
        return TypeClass.COURSE;
    }

    @Override
    public String toString() {
        return "Course{" +
                "heureDepart=" + heureDepart +
                ", distance=" + distance +
                ", nbTour=" + nbTour +
                ", categorie=" + categorie +
                ", competition=" + competition +
                ", participants=[" + generateParticipantsString() + "]" +
                '}';
    }

    private String generateParticipantsString(){
        String participantsString = "";
        if(participations.length > 0){
            participantsString = "{" + participations[0].toString() + "}";
        }
        if(participations.length > 1){
            for(int i = 1; i<participations.length; i++){
                participantsString += ", {" + participations[i] + "}";
            }
        }
        return participantsString;
    }

    public boolean isAllPartants(){
        if(participations.length > 0){
            for(Participation participation : participations){
                if(!participation.isPartant())
                    return false;
            }
            return true;
        }
        return false;
    }
}
