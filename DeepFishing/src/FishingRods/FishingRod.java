package FishingRods;

public abstract class FishingRod {
    public double price;
    public double coreLuck;
    public double coreFishingSpeed;
    public double coreHookSpeed;
    public double coreHookStrength;
    public double coreLineDurability;
    public String desc;
    public abstract void buy(double money);

    public abstract double getCoreLuck();
    public abstract double getCoreFishingSpeed();
    public abstract double getCoreHookSpeed();
    public abstract double getCoreHookStrength();
    public abstract double getCoreLineDurability();

    public abstract double getPrice();
}
