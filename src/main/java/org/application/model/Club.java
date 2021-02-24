package model;

public class Club extends Entity {
    private String nom ;

    public Club(int id, String nom) {
        super(id);
        this.nom = nom;
    }

    /*
     * Getter and Setter
     * */

    @Override
    public TypeClass getTypeClass() {
        return TypeClass.CLUB;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Club{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
