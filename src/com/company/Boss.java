package com.company;

public class Boss extends GameEntity{
    private Weapon weapon= new Weapon("Cold","Armada");



    public Boss(int health, int damage){
        super();
        setHealth(health);
        setDamage(damage);

    }
    public void setWeapon(Weapon weapon) { this.weapon = weapon; }
    public Weapon getWeapon() { return weapon; }
    public String printInfo(){return super.printInfo();}



}
