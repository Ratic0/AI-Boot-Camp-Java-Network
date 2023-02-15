package Diablo;

public abstract class Character {
    protected int hp ,mp;
    //...
    WeaponBehavior weapon; // Association (Aggregation) < class 간의 관계를 나타냄
    abstract void info();

    public void setWeapon(WeaponBehavior weapon) { // 장착한 무기를 생성
        this.weapon = weapon;
    }
    public final void performWeapon(){ //final이 class에 붙으면 상속불가, method 상속에서 오버라이드 불가, field 에서는 값 변경이 안됨
        weapon.useWeapon();
    }
}
