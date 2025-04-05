package Upgrades;


import java.util.ArrayList;

public abstract class Upgrade {
    public double price;

    public Upgrade(){
    }

    public abstract ArrayList<Double> buy(double money, double inventorySpace, double fishingSpeed, double hookSpeed, double hookStrength, double lineDurability, double labDouble);

    public double getPrice() {
        return 0.00;
    }
}
