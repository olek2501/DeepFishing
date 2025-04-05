package FishingRods;

public class ReinforcedRod extends FishingRod{
    public double price = 2000;
    public double coreLuck = 7;
    public double coreFishingSpeed = 7;
    public double coreHookSpeed = 3;
    public double coreHookStrength = 50;
    public double coreLineDurability = 125;
    public String desc = "Fishing rod made fully of reinforced steel beams. How and why is unknown but it's pretty awesome.";

    @Override
    public void buy(double money) {
        money -= this.price;
    }

    public double getCoreLuck(){
        return this.coreLuck;
    }

    public double getCoreFishingSpeed(){
        return this.coreFishingSpeed;
    }

    public double getCoreHookSpeed() {
        return this.coreHookSpeed;
    }

    public double getCoreHookStrength() {
        return this.coreHookStrength;
    }

    public double getCoreLineDurability() {
        return this.coreLineDurability;
    }
    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "ReinforcedRod = LUCK: "+this.coreLuck+"; FISHING SPEED: "+coreFishingSpeed+"; HOOK SPEED: "+this.coreHookSpeed+"; HOOK STRENGTH: "+this.coreHookStrength+";  LINE DURABILITY: "+coreLineDurability+";\n DESCRIPTION: "+this.desc;
    }
}
