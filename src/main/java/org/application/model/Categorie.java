package model;

public class Categorie extends Entity {
    private String nom ;

    public Categorie(int id, String nom) {
        super(id);
        this.nom = nom;
    }

    /*
    * Getter and setter
    * */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public TypeClass getTypeClass() {
        return TypeClass.CATEGORIE;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
