package model;

import java.util.Date;

public class Coureur extends Entity{
    private String nom ;
    private String prenom ;
    private String numLicence ; // nullable
    private Club club ;
    private Categorie categorie ;

    public Coureur(int id, String nom, String prenom, String numLicence, Club club, Categorie categorie) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
        this.numLicence = numLicence;
        this.club = club;
        this.categorie = categorie;
    }

    /*
    * Getter and Setter
    * */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumLicence() {
        return numLicence;
    }

    public void setNumLicence(String numLicence) {
        this.numLicence = numLicence;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public TypeClass getTypeClass() {
        return TypeClass.COUREUR;
    }

    @Override
    public String toString() {
        return "Coureur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numLicence='" + numLicence + '\'' +
                ", club=" + club +
                ", categorie=" + categorie +
                '}';
    }
}
