package model;

public abstract class Entity {
    // Polymorphisme

    private int id;

    Entity (int id){
        this.id = id;
    }

    public abstract TypeClass getTypeClass();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
