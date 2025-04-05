package FishingRods;

public class NautilusRod extends FishingRod{
    public double price = 10000;
    public double coreLuck = 75;
    public double coreFishingSpeed = 15;
    public double coreHookSpeed = 5;
    public double coreHookStrength = 50;
    public double coreLineDurability = 250;
    public String desc = "Very powerful fishing rod enchanted with magic of the ocean. Made purely of power and spells. The strongest one there is.";

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
        return "NautilusRod = LUCK: "+this.coreLuck+"; FISHING SPEED: "+coreFishingSpeed+"; HOOK SPEED: "+this.coreHookSpeed+"; HOOK STRENGTH: "+this.coreHookStrength+";  LINE DURABILITY: "+coreLineDurability+";\n DESCRIPTION: "+this.desc;
    }
}
