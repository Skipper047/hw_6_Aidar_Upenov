package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(850,75);
        System.out.println("Boss info ( "+boss.printInfo()+" )");
        Weapon weapon = new Weapon("Cold","Armada");

         System.out.println("Boss health: "+ boss.getHealth()+", "+"Boss damage: "+boss.getDamage()+
                ", "+"Boss type of weapon: "+ weapon.getTypeOfWeapon()+", "+"Boss name of Weapon: "+
                 weapon.getNameOfWeapon()+".");
         Skeleton Skeleton1 = new Skeleton(150,20,50);
        System.out.println("Skeleton1 info ( "+Skeleton1.printInfo()+" )");
        Skeleton Skeleton2 = new Skeleton(170,25,60);
        System.out.println("Skeleton2 info ( "+Skeleton2.printInfo()+" )");







    }
}
