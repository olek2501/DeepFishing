package Upgrades;

import java.util.ArrayList;
import java.util.List;

public class SilverLine extends Upgrade {

    public double price = 10;

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
        hookSpeed += 1;
        returnList.add(hookSpeed);
        returnList.add(hookStrength);
        lineDurability += 3;
        returnList.add(lineDurability);
        returnList.add(labDouble);
        return returnList;
    }

    @Override
    public String toString() {
        return "Silver Line \nDESCRIPTION: A silver line for your fishing rod. Increases Line Durability by 3 and Hook Speed by 1.";
    }
}
