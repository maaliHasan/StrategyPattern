/**
 * Created by mhasan on 3/30/2017.
 */
public class CharacterSimulator {
    public static void main(String[] args) {
        King king = new King();
        king.fight();
        king.weaponBehav.useWeapon();
        System.out.println("*************");
        king.fight();
        king.setWeapon(new AxeBehavior());
        king.weaponBehav.useWeapon();
    }
}
