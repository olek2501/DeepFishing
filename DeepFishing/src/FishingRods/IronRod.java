package FishingRods;

public class IronRod extends FishingRod{
    public double price = 100;
    public double coreLuck = 1.2;
    public double coreFishingSpeed = 1.2;
    public double coreHookSpeed = 1.2;
    public double coreHookStrength = 20;
    public double coreLineDurability = 35;
    public String desc = "Pretty basic fishing rod upgrade, it's literally just made of iron.";

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
        return "IronRod = LUCK: "+this.coreLuck+"; FISHING SPEED: "+coreFishingSpeed+"; HOOK SPEED: "+this.coreHookSpeed+"; HOOK STRENGTH: "+this.coreHookStrength+";  LINE DURABILITY: "+coreLineDurability+";\n DESCRIPTION: "+this.desc;
    }
}
