package model;

public class Tour extends Entity {
    private int numero ;
    private int temps ;
    private boolean dnf ;
    private Coureur coureur ;
    private Course course ;

    public Tour(int id, int numero, int temps, boolean dnf, Coureur coureur, Course course) {
        super(id);
        this.numero = numero;
        this.temps = temps;
        this.dnf = dnf;
        this.coureur = coureur;
        this.course = course;
    }

    /*
    * Getter and setter
    * */

    @Override
    public TypeClass getTypeClass() {
        return TypeClass.TOUR;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public boolean isDnf() {
        return dnf;
    }

    public void setDnf(boolean dnf) {
        this.dnf = dnf;
    }

    public Coureur getCoureur() {
        return coureur;
    }

    public void setCoureur(Coureur coureur) {
        this.coureur = coureur;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "numero=" + numero +
                ", temps=" + temps +
                ", dnf=" + dnf +
                ", coureur=" + coureur +
                ", course=" + course +
                '}';
    }
}
