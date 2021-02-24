package model;

public class User extends Entity{
    private String username ;
    private String password ;

    public User(String username, String password) {
        super(0);
        this.username = username;
        this.password = password;
    }

    /*
    * Getter and setter
    * */

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public TypeClass getTypeClass() {
        return TypeClass.USER;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
