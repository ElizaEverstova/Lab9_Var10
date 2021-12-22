public class Melee extends Weapon {
    private String material;

    public Melee() {
        super();
        material = "";
    }

    public Melee(String weaponType, String material) {
        super(weaponType);
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return "Weapon type: " + getType() + " Material: " + getMaterial();
    }
}
