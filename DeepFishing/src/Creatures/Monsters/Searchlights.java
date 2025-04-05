package Creatures.Monsters;

import Creatures.Creature;
import Creatures.Fish;
import Creatures.Monster;

import java.text.DecimalFormat;
import java.util.Random;

import static java.lang.Double.parseDouble;
import static java.lang.Math.round;

public class Searchlights extends Creature implements Monster {

    Random rand = new Random();
    DecimalFormat dcf = new DecimalFormat("#.00");

    // User Input
    String nickname;
    boolean favorite;

    // Game Input
    double weight;
    double length;
    double rarityStatus;

    @Override
    public void fight() {
        System.out.println("Your monster trains it's fighting with you.");
    }

    @Override
    public void roar() {
        System.out.println("It roars! Scary..");
    }

    @Override
    public double value(){
        double value = (this.weight + this.length) * rarityStatus;
        value = Math.round(value * 100);
        value /= 100;
        return value;
    }



    public Searchlights(){
        this.nickname = "Searchlights";
        boolean favorite = false;
        rand = new Random();
        this.weight = 1000000 + (25000000 - 100000) * rand.nextDouble();
        rand = new Random();
        this.length = 2000000 + (50000000 - 2000000) * rand.nextDouble();
        this.rarityStatus = 99999;
    }

    public Searchlights(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 1000000 + (25000000 - 100000) * rand.nextDouble();
        rand = new Random();
        this.length = 2000000 + (50000000 - 2000000) * rand.nextDouble();
        this.rarityStatus = 99999;
    }

    public Searchlights(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 1000000 + (25000000 - 100000) * rand.nextDouble();
        rand = new Random();
        this.length = 2000000 + (50000000 - 2000000) * rand.nextDouble();
        this.rarityStatus = 99999;
    }

    public String toString(){
        return "Searchlights '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Dev only monster. Searchlights from hit game pressure. Really expensive for some reason.";
    }


}
