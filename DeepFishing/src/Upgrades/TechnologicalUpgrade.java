package Upgrades;

import java.util.ArrayList;

public class TechnologicalUpgrade extends Upgrade {

    public double price = 2500;

    public double getPrice() {
        return this.price;
    }

    @Override
    public ArrayList<Double> buy(double money, double inventorySpace, double fishingSpeed, double hookSpeed, double hookStrength, double lineDurability, double labDouble) {
        ArrayList<Double> returnList = new ArrayList<Double>();
        money = money - this.price;
        returnList.add(money);
        returnList.add(inventorySpace);
        fishingSpeed += 2.5;
        returnList.add(fishingSpeed);
        hookSpeed += 2.5;
        returnList.add(hookSpeed);
        hookStrength += 75;
        returnList.add(hookStrength);
        lineDurability += 100;
        returnList.add(lineDurability);
        returnList.add(labDouble);
        return returnList;
    }

    @Override
    public String toString() {
        return "Technological Upgrade \nDESCRIPTION: Upgrade your fishing rod with better technology. Increases Fishing Speed by 2.5, Hook Speed by 2.5, Hook Strength by 75 and Line Durability by 100.";
    }
}
