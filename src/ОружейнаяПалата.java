import java.util.ArrayList;

public class ОружейнаяПалата {
    private ArrayList<Weapon> weapons = new ArrayList<>();

    public ОружейнаяПалата() {
    }

    public void addWeapon(Weapon wpn) {
        weapons.add(wpn);
    }

    public int getMeleeCount() {
        int count = 0;
        for (Weapon weapon : weapons) {
            if (weapon instanceof Melee)
                count++;
        }
        return count;
    }

    public int getGunCount() {
        int count = 0;
        for (Weapon weapon : weapons) {
            if (weapon instanceof Gun)
                count++;
        }
        return count;
    }
}