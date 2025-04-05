package Creatures;

public abstract class Creature {
    public Creature(){
    }

    public abstract double value();

    public void catchCreature(){
        System.out.println("You caught the creature!");
    }


}
