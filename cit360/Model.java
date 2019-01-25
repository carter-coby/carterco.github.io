public class Actor implements Serializable {
    private String name;
    private int currentHealth;
    private String status;

    public Actor() {
    }
    
    public Actor(String name, int currentHealth, String status){
        this.name = name;
        this.currentHealth = currentHealth;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.currentHealth);
        hash = 53 * hash + Objects.hashCode(this.status);
        return hash;
    }