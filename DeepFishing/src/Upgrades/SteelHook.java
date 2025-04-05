package Upgrades;

import java.util.ArrayList;

public class SteelHook extends Upgrade {

    public double price = 50;

    public double getPrice() {
        return this.price;
    }

    @Override
    public ArrayList<Double> buy(double money, double inventorySpace, double fishingSpeed, double hookSpeed, double hookStrength, double lineDurability, double labDouble) {
        ArrayList<Double> returnList = new ArrayList<Double>();
        money = money - this.price;
        returnList.add(money);
        returnList.add(inventorySpace);
        returnList.add(fishingSpeed);
        hookSpeed += 0.5;
        returnList.add(hookSpeed);
        hookStrength += 10;
        returnList.add(hookStrength);
        returnList.add(lineDurability);
        returnList.add(labDouble);
        return returnList;
    }

    @Override
    public String toString() {
        return "Steel Hook \nDESCRIPTION: A hook made of steel. Increases Hook Speed by 0.5 and Hook Strength by 10.";
    }
}
