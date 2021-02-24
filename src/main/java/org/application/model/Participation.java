package model;

public class Participation extends Entity {
    private int numeroPlaque ;
    private int positionGrille ;
    private boolean partant ;
    private float montant ;
    private boolean vip ;
    private int classementFinal ;
    private Coureur coureur ;
    private Course course ;

    public Participation(int id, int numeroPlaque, int positionGrille, boolean partant, float montant, boolean vip, int classementFinal, Coureur coureur, Course course) {
        super(id);
        this.numeroPlaque = numeroPlaque;
        this.positionGrille = positionGrille;
        this.partant = partant;
        this.montant = montant;
        this.vip = vip;
        this.classementFinal = classementFinal;
        this.coureur = coureur;
        this.course = course;
    }

    /*
    * Getter and setter
    * */

    @Override
    public TypeClass getTypeClass() {
        return TypeClass.PARTICIAPTION;
    }

    public int getNumeroPlaque() {
        return numeroPlaque;
    }

    public void setNumeroPlaque(int numeroPlaque) {
        this.numeroPlaque = numeroPlaque;
    }

    public int getPositionGrille() {
        return positionGrille;
    }

    public void setPositionGrille(int positionGrille) {
        this.positionGrille = positionGrille;
    }

    public boolean isPartant() {
        return partant;
    }

    public void setPartant(boolean partant) {
        this.partant = partant;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getClassementFinal() {
        return classementFinal;
    }

    public void setClassementFinal(int classementFinal) {
        this.classementFinal = classementFinal;
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
        return "Participation{" +
                "id=" + super.getId() +
                ", numeroPlaque=" + numeroPlaque +
                ", positionGrille=" + positionGrille +
                ", partant=" + partant +
                ", montant=" + montant +
                ", vip=" + vip +
                ", classementFinal=" + classementFinal +
                ", coureur=" + coureur +
                ", course=" + course +
                '}';
    }
}
