package Creatures.Monsters;

import Creatures.Creature;
import Creatures.Monster;

import java.text.DecimalFormat;
import java.util.Random;

public class Dzharkov extends Creature implements Monster {

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
        System.out.println("Your monster trains it's fighting with you. It is the legendary beast. You try to help it improve it's powerful attacks, yet all you're able to do is help it practice them.");
    }

    @Override
    public void roar() {
        System.out.println("It produces a massive, unbelievably powerful roar!! You can see the sound waves travelling very long distances.");
    }

    @Override
    public double value(){
        double value = (this.weight + this.length) * rarityStatus;
        value = Math.round(value * 100);
        value /= 100;
        return value;
    }



    public Dzharkov(){
        this.nickname = "Dzharhov";
        boolean favorite = false;
        rand = new Random();
        this.weight = 50000 + (75000 - 50000) * rand.nextDouble();
        rand = new Random();
        this.length = 25000 + (37500 - 25000) * rand.nextDouble();
        this.rarityStatus = 10;
    }

    public Dzharkov(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 50000 + (75000 - 50000) * rand.nextDouble();
        rand = new Random();
        this.length = 25000 + (37500 - 25000) * rand.nextDouble();
        this.rarityStatus = 10;
    }

    public Dzharkov(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 50000 + (75000 - 50000) * rand.nextDouble();
        rand = new Random();
        this.length = 25000 + (37500 - 25000) * rand.nextDouble();
        this.rarityStatus = 10;
    }

    public String toString(){
        return "Dzharhov '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: An unbelievably rare, legendary sea monster. It's massive, it's powerful. It can swim faster and roar loader than any other monster. It lives in dark shadowy areas in the depths. It's your mission's objective, go sell it and you can return home!";
    }
}
