package Upgrades;

import java.util.ArrayList;

public class NeonLine extends Upgrade {

    public double price = 125;

    public double getPrice() {
        return this.price;
    }

    @Override
    public ArrayList<Double> buy(double money, double inventorySpace, double fishingSpeed, double hookSpeed, double hookStrength, double lineDurability, double labDouble) {
        ArrayList<Double> returnList = new ArrayList<Double>();
        money = money - this.price;
        returnList.add(money);
        returnList.add(inventorySpace);
        fishingSpeed += 1.5;
        returnList.add(fishingSpeed);
        returnList.add(hookSpeed);
        returnList.add(hookStrength);
        lineDurability += 25;
        returnList.add(lineDurability);
        returnList.add(labDouble);
        return returnList;
    }

    @Override
    public String toString() {
        return "Neon Line \nDESCRIPTION: A glowing neon line, it's pretty fast and pretty cool! Increases Fishing Speed by 1.5 and Line Durability by 25.";
    }
}
