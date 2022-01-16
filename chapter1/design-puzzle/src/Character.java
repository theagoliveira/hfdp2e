public abstract class Character {

    WeaponBehavior weapon;

    protected Character() {}

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        weapon = w;
    }

}
