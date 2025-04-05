package FishingRods;

public class FlameRod extends FishingRod{
    public double price = 350;
    public double coreLuck = 2.2;
    public double coreFishingSpeed = 2;
    public double coreHookSpeed = 1.5;
    public double coreHookStrength = 30;
    public double coreLineDurability = 65;
    public String desc = "Extinguished rod made purely of flames and fire. Quite pointless but it's obsidian base is really durable";

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
        return "FlameRod = LUCK: "+this.coreLuck+"; FISHING SPEED: "+coreFishingSpeed+"; HOOK SPEED: "+this.coreHookSpeed+"; HOOK STRENGTH: "+this.coreHookStrength+";  LINE DURABILITY: "+coreLineDurability+";\n DESCRIPTION: "+this.desc;
    }
}
