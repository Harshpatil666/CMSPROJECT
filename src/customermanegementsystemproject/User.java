package customermanegementsystemproject;

public class User {
    
    String name;
    long password;
    private boolean isAdmin;
    boolean isActive;

    public User() {
    }
    
    public User(String name, long password,boolean isAdmin, boolean isActive) {
        this.isAdmin = isAdmin;
        this.name = name;
        this.password = password;
        this.isActive = isActive;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    
    
}
