import Creatures.Creature;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public double luck = 1;
    public double inventorySpace = 3;
    public double fishingSpeed = 1;
    public double hookSpeed = 1;
    public double hookStrength = 5;
    public double lineDurability = 10;
    public double money = 0.00;
    public List<Creature> inventory = new ArrayList<>();

    public double[] setStats(double[] currentStats, double[] newStats){
        if(currentStats[0]>newStats[0]){
            double roznica = currentStats[0]-newStats[0];
            this.luck -= roznica;
        }else{
            double roznica = newStats[0] - currentStats[0];
            this.luck += roznica;
        }
        if(currentStats[1]>newStats[1]){
            double roznica = currentStats[1]-newStats[1];
            this.fishingSpeed -= roznica;
        }else{
            double roznica = newStats[1] - currentStats[1];
            this.fishingSpeed += roznica;
        }
        if(currentStats[2]>newStats[2]){
            double roznica = currentStats[2]-newStats[2];
            this.hookSpeed -= roznica;
        }else{
            double roznica = newStats[2] - currentStats[2];
            this.hookSpeed += roznica;
        }
        if(currentStats[3]>newStats[3]){
            double roznica = currentStats[3]-newStats[3];
            this.hookStrength -= roznica;
        }else{
            double roznica = newStats[3] - currentStats[3];
            this.hookStrength += roznica;
        }
        if(currentStats[4]>newStats[4]){
            double roznica = currentStats[4]-newStats[4];
            this.lineDurability -= roznica;
        }else{
            double roznica = newStats[4] - currentStats[4];
            this.lineDurability += roznica;
        }
        currentStats[0] = newStats[0];
        currentStats[1] = newStats[1];
        currentStats[2] = newStats[2];
        return currentStats;
    }
}
