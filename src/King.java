/**
 * Created by mhasan on 3/30/2017.
 */
public class King extends Character {
    @Override
    public void fight() {
        System.out.println("I'm King I can fight ");
    }
    public King (){
        weaponBehav = new SwordBehavior(); //delegate
    }
    public void setWeapon(WeaponBehavior w){ // change the weapon behavior  at Runtime
        this.weaponBehav =w ;
    }
}
