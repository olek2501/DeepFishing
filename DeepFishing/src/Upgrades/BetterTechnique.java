package Upgrades;

import java.util.ArrayList;

public class BetterTechnique extends Upgrade {

    public double price = 250;

    public double getPrice() {
        return this.price;
    }

    @Override
    public ArrayList<Double> buy(double money, double inventorySpace, double fishingSpeed, double hookSpeed, double hookStrength, double lineDurability, double labDouble) {
        ArrayList<Double> returnList = new ArrayList<Double>();
        money = money - this.price;
        returnList.add(money);
        returnList.add(inventorySpace);
        fishingSpeed += 1;
        returnList.add(fishingSpeed);
        hookSpeed += 1;
        returnList.add(hookSpeed);
        returnList.add(hookStrength);
        returnList.add(lineDurability);
        returnList.add(labDouble);
        return returnList;
    }

    @Override
    public String toString() {
        return "Better Technique \nDESCRIPTION: Learn a better technique to help with your fishing. Increases Fishing Speed by 1 and Hook Speed by 1.";
    }
}
