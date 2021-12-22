public class Gun extends Weapon {
    private String bulletType;

    public Gun() {
        super();
        bulletType = "";
    }

    public Gun(String gunType, String bulletType) {
        super (gunType);
        this.bulletType = bulletType;
    }

    public void setBulletType(String bulletType) {
        this.bulletType = bulletType;
    }

    public String getBulletType() {
        return bulletType;
    }

    public String toString() {
        return "Gun type: " + getType() + " Bullet type: " + getBulletType();
    }
}

