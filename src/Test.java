public class Test {
    public static void main(String[] args) {
        ОружейнаяПалата palata = new ОружейнаяПалата();
        palata.addWeapon(new Gun("Pistol", "Pistol bullets"));
        palata.addWeapon(new Melee("Bat", "Wood"));
        palata.addWeapon(new Melee("Fork", "Plastic"));
        palata.addWeapon(new Melee("Katana", "Steel"));
        palata.addWeapon(new Gun("Shotgun", "Shotgun ammo"));
        System.out.println("Guns count: " + palata.getGunCount());
        System.out.println("Melees count: " + palata.getMeleeCount());
    }
}
