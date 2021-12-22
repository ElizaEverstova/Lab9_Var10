public class Weapon {
    private String type;

    public Weapon() {
        type = "";
    }

    public Weapon(String type) {
        this.type = type;
    }

    public void setType(String weaponType) {
        type = weaponType;
    }

    public String getType() {
        return type;
    }
}
