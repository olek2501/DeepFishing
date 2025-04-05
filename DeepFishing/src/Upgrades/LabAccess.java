package Upgrades;

import java.util.ArrayList;

public class LabAccess extends Upgrade {

    public double price = 1000;

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
        returnList.add(hookSpeed);
        returnList.add(hookStrength);
        returnList.add(lineDurability);
        labDouble = 1;
        returnList.add(labDouble);
        return returnList;
    }

    @Override
    public String toString() {
        return "Lab Access \nDESCRIPTION: Get resources and repair the door to the new area. Unlocks the LAB.";
    }
}
