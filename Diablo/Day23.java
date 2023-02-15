package Diablo;

public class Day23 {
    //Diablo v0.5
    public static void main(String[] args) {
        Barbarian b1 = new Barbarian();
        Sorceress s1 = new Sorceress();
        Axe berserkerAxe = new Axe();
        Bow windForce = new Bow();

        b1.setWeapon(berserkerAxe);
        s1.setWeapon(windForce); // get weapon
        s1.performWeapon();
        b1.performWeapon();

        s1.setWeapon(new Axe()); // 익명 객체
        s1.performWeapon();
        s1.info();
        b1.setWeapon(() -> System.out.println("신오브로 아이스볼을 발사~"));
        b1.performWeapon();
    }
}
