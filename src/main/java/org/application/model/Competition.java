package model;

import java.util.Date;

public class Competition extends Entity {
    private String nom ;
    private Date date ;

    public Competition(int id, String nom, Date date) {
        super(id);
        this.nom = nom;
        this.date = date;
    }

    /*
    * Getter and setter
    * */

    @Override
    public TypeClass getTypeClass() {
        return TypeClass.COMPETITION;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "nom='" + nom + '\'' +
                ", date=" + date +
                '}';
    }
}
