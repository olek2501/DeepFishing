package Upgrades;

import java.util.ArrayList;

public class BiggerBackpack extends Upgrade {

    public double price = 35;

    public double getPrice() {
        return this.price;
    }

    @Override
    public ArrayList<Double> buy(double money, double inventorySpace, double fishingSpeed, double hookSpeed, double hookStrength, double lineDurability, double labDouble) {
        ArrayList<Double> returnList = new ArrayList<Double>();
        money = money - this.price;
        returnList.add(money);
        inventorySpace += 2;
        returnList.add(inventorySpace);
        returnList.add(fishingSpeed);
        returnList.add(hookSpeed);
        returnList.add(hookStrength);
        returnList.add(lineDurability);
        returnList.add(labDouble);
        return returnList;
    }

    @Override
    public String toString() {
        return "Bigger Backpack \nDESCRIPTION: A bigger backpack to carry all your fish in. Increases Inventory Space by 2.";
    }
}
