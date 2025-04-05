package FishingRods;

public class BasicRod extends FishingRod{
    public double price = 0;
    public double coreLuck = 0;
    public double coreFishingSpeed = 0;
    public double coreHookSpeed = 0;
    public double coreHookStrength = 0;
    public double coreLineDurability = 0;
    public String desc = "This is the fishing rod, you were sent down here with.";

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
        return "BasicRod = LUCK: "+this.coreLuck+"; FISHING SPEED: "+coreFishingSpeed+"; HOOK SPEED: "+this.coreHookSpeed+"; HOOK STRENGTH: "+this.coreHookStrength+";  LINE DURABILITY: "+coreLineDurability+";\n DESCRIPTION: "+this.desc;
    }
}
