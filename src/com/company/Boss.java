package com.company;

public class Boss extends GameEntity {
    private Weapon bossWeapon;

    public Boss(int healt, int damage, Weapon bossWeapon){
        super();
        setHealth(healt);
        setDamage(damage);
        this.bossWeapon = bossWeapon;
    }
    public Weapon getBossWeapon() { return bossWeapon; }

    public void setBossWeapon(Weapon bossWeapon) { this.bossWeapon = bossWeapon; }






}
