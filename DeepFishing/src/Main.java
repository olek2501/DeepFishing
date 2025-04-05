import Creatures.Creature;
import Creatures.Fish;
import Creatures.Fishes.*;
import Creatures.Monster;
import Creatures.Monsters.*;
import FishingRods.*;
import Upgrades.*;

import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {
        Scanner czytaj = new Scanner(System.in);
        Random rand;
        Random gambleNumber = new Random();
        isInteger testInta = new isInteger();
        int randKwadrat;

        int fishingSpecialNumber;
        List<String> kwadraty = new ArrayList<>();
        List<Integer> kwadratyNumbers = new ArrayList<>();
        int opt = 1;
        while(opt<=9){
            kwadraty.add("[]");
            opt++;
        }
        opt = 1;
        while(opt<=9){
            kwadratyNumbers.add(opt);
            opt++;
        }
        int odczynnik;
        double monsterCooldown;
        double lineHealth;
        double hookDamage;
        double hookSpeed;
        double fightSpeed;
        double monsterHealth;
        double monsterDamage;
        double monsterSpeed;
        double playerDamage;
        boolean win = false;
        int round = 1;
        int specialCooldown;
        String tempname = "";
        boolean tempnameCheckmark;
        boolean tempfavCheckmark;
        boolean winCondition = false;
        int gamble;
        // FISH
        NullFish nullFish;
        BluBluCommon bluBluCommon;
        SpiralCarp spiralCarp;
        SlowSardine slowSardine;
        Zincish zincish;
        SwordFish swordFish;
        BigFish bigFish;
        NeonSprinter neonSprinter;
        SpeedySardine speedySardine;
        GiantFish giantFish;
        ExcaliburFish excaliburFish;
        LegendaryGoldenKoi legendaryGoldenKoi;

        // MONSTER
        Shark shark;
        AngryAngler angryAngler;
        KingOctopus kingOctopus;
        Leviathan leviathan;
        Dzharkov dzharkov;

        boolean theLab = false;
        double labDouble = 0;
        Player gracz = new Player();
        double[] currentStats = {gracz.luck, gracz.fishingSpeed, gracz.hookSpeed, gracz.hookStrength, gracz.lineDurability};
        double[] newStats = {0, 0, 0, 0, 0};

        // FISHING RODS:

        List<FishingRod> ownedFishingRods = new ArrayList<>();
        List<FishingRod> unownedFishingRods = new ArrayList<>();

        BasicRod basicRod = new BasicRod();
        ownedFishingRods.add(basicRod);

        IronRod ironRod = new IronRod();
        unownedFishingRods.add(ironRod);

        FlameRod flameRod = new FlameRod();
        unownedFishingRods.add(flameRod);

        ReinforcedRod reinforcedRod = new ReinforcedRod();
        unownedFishingRods.add(reinforcedRod);

        NautilusRod nautilusRod = new NautilusRod();
        unownedFishingRods.add(nautilusRod);

        // UPGRADES:

        List<Double> returnList = new ArrayList<Double>();
        HashMap<String, Upgrade> upgrades = new HashMap<>();
        List<String> upgradeList = new ArrayList<String>();

        SilverLine silverLine = new SilverLine();
        upgrades.put("Silver Line", silverLine);
        upgradeList.add("Silver Line");

        BiggerBackpack biggerBackpack = new BiggerBackpack();
        upgrades.put("Bigger Backpack", biggerBackpack);
        upgradeList.add("Bigger Backpack");

        SteelHook steelHook = new SteelHook();
        upgrades.put("Steel Hook", steelHook);
        upgradeList.add("Steel Hook");

        NeonLine neonLine = new NeonLine();
        upgrades.put("Neon Line", neonLine);
        upgradeList.add("Neon Line");

        BetterTechnique betterTechnique = new BetterTechnique();
        upgrades.put("Better Technique", betterTechnique);
        upgradeList.add("Better Technique");

        DeepBackpack deepBackpack = new DeepBackpack();
        upgrades.put("Deep Backpack", deepBackpack);
        upgradeList.add("Deep Backpack");

        LabAccess labAccess = new LabAccess();
        upgrades.put("Lab Access", labAccess);
        upgradeList.add("Lab Access");

        TechnologicalUpgrade technologicalUpgrade = new TechnologicalUpgrade();
        upgrades.put("Technological Upgrade", technologicalUpgrade);
        upgradeList.add("Technological Upgrade");


        Searchlights devFish = new Searchlights("devLights", true);
        gracz.inventory.add(devFish);


        System.out.println("Welcome to the deep waters..");

        System.out.println("\n      d8b                                ,d8888b  d8,         d8b        d8,                    \n      88P                                88P'    `8P          ?88       `8P                     \n     d88                              d888888P                 88b                              \n d888888   d8888b d8888b?88,.d88b,      ?88'      88b .d888b,  888888b   88b  88bd88b  d888b8b  \nd8P' ?88  d8b_,dPd8b_,dP`?88'  ?88      88P       88P ?8b,     88P `?8b  88P  88P' ?8bd8P' ?88  \n88b  ,88b 88b    88b      88b  d8P     d88       d88    `?8b  d88   88P d88  d88   88P88b  ,88b \n`?88P'`88b`?888P'`?888P'  888888P'    d88'      d88' `?888P' d88'   88bd88' d88'   88b`?88P'`88b\n                          88P'                                                               )88\n                         d88                                                                ,88P\n                         ?8P                                                            `?8888P \n\n");

        System.out.println("Press anything to start your watery adventure...");
        String odp = czytaj.nextLine();

        String text = "You wake up in a cold metal underwater facility base. You were sent here on a mission. You won't get out of here until you manage to complete it.\n";
        int i;
        int o;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }

        text = "Your mission was to hunt a legendary deep water sea monster Dzharhov. It LIVES deep down in the ocean darkness, echo-radars have detected its activity in the area your base was constructed in.\n";
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }

        text = "Unfortunately due to budget cuts, you got sent down here with nothing but a deepwater fishing rod to your name. You will live down here for a while before your mission ends.\n";
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }

        text = "You gotta fish through the observatory dock windows and sell what you catch to earn money. They block water from passing through but objects such as fishes or your hook can pass with enough force.\n";
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }

        text = "You will sell using your Sell Station to package and send them onto the surface, you will get money sent down in exchange.\n";
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }

        text = "Use your earned watery money to purchase upgrades in your Upgrade Console and items in the Shop Screen.\n";
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }

        text = "Later down the line you can engineer new items using fish you earn but that's for another time. The Lab is busted right now anyway.\n";
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }

        text = "That's all you need to know, and good luck with your catches!!";
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
        // GAME STARTS

        while(true){
            System.out.println("\nWelcome aboard captain! What will you decide to do next??");
            System.out.println("[1] FISH");
            System.out.println("[2] SELL STATION");
            System.out.println("[3] UPGRADE CONSOLE");
            System.out.println("[4] SHOP SCREEN");
            if(!theLab){
                System.out.println("[5] ???");
            }else{
                System.out.println("[5] THE LAB");
            }
            if(!winCondition){
                System.out.println("[W] ???");
            }else{
                System.out.println("[W] ESCAPE");
            }
            System.out.println("[I] INVENTORY");
            System.out.println("[X] EXIT\n");

            odp = czytaj.nextLine();

            if(odp.equals("1")){
                if(gracz.inventorySpace>= gracz.inventory.size()){

                    if(gracz.hookSpeed>1 && gracz.hookSpeed<kwadraty.size()-1){
                        kwadraty.clear();
                        kwadratyNumbers.clear();
                        opt = 1;
                        while(opt<=9){
                            kwadraty.add("[]");
                            opt++;
                        }
                        opt = 1;
                        while(opt<=9){
                            kwadratyNumbers.add(opt);
                            opt++;
                        }
                        odczynnik = (int) (kwadraty.size()-Math.round(gracz.hookSpeed));
                        while(kwadraty.size()>odczynnik){
                            kwadraty.removeLast();
                            kwadratyNumbers.removeLast();
                        }
                    }

                    rand = new Random();
                    fishingSpecialNumber = (int) ((rand.nextInt(0, 1000000000)) * gracz.luck);
                    System.out.println(fishingSpecialNumber);
                    if(fishingSpecialNumber==0){
                        System.out.println("It's NULL!");
                        // fishin minigame
                        i = 0;
                        while(i*gracz.fishingSpeed<15){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish:

                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught NullFish? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your NullFish:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your NullFish "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your NullFish is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }


                        }
                        while(true){
                            System.out.println("Add the NullFish to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                nullFish = new NullFish(tempname, true);
                            }else{
                                nullFish = new NullFish(tempname);
                            }
                        }else{
                            nullFish = new NullFish();
                        }
                        nullFish.catchCreature();
                        gracz.inventory.add(nullFish);
                    }else if(0<fishingSpecialNumber && fishingSpecialNumber < 90000000){
                        System.out.println("It's a Blu Blu Common!");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught BluBluCommon? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your BluBluCommon:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your BluBluCommon "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your BluBluCommon is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the BluBluCommon to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                bluBluCommon = new BluBluCommon(tempname, true);
                            }else{
                                bluBluCommon = new BluBluCommon(tempname);
                            }
                        }else{
                            bluBluCommon = new BluBluCommon();
                        }
                        bluBluCommon.catchCreature();
                        gracz.inventory.add(bluBluCommon);
                    }else if(90000000 <= fishingSpecialNumber && fishingSpecialNumber<210000000){

                        // Spiral Carp

                        System.out.println("It's a Spiral Carp spiraling around..");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught Spiral Carp? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your Spiral Carp:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your Spiral Carp "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your Spiral Carp is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the Spiral Carp to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                spiralCarp = new SpiralCarp(tempname, true);
                            }else{
                                spiralCarp = new SpiralCarp(tempname);
                            }
                        }else{
                            spiralCarp = new SpiralCarp();
                        }
                        spiralCarp.catchCreature();
                        gracz.inventory.add(spiralCarp);

                    }else if(210000000 <= fishingSpecialNumber && fishingSpecialNumber<330000000){
                        // Shark
                        win = false;
                        specialCooldown = 0;
                        lineHealth = gracz.lineDurability;
                        hookDamage = gracz.hookStrength;
                        hookSpeed = gracz.hookSpeed;
                        fightSpeed = gracz.fishingSpeed;
                        playerDamage = 2;
                        monsterHealth = Math.floor(15 - fightSpeed);
                        monsterSpeed = 1;
                        monsterDamage = 1;
                        monsterCooldown = 0;
                        System.out.println("A shark attacks!!");
                        while(true){
                            System.out.println("What will you do? ROUND "+round);
                            System.out.println("SHARK HEALTH: "+monsterHealth+"        LINE HEALTH:"+lineHealth+"\n");
                            System.out.println("[H] HOOK ATTACK (SPECIAL) | EVERY "+hookSpeed+" TURNS");
                            System.out.println("[A] Normal Attack | "+playerDamage+" DAMAGE");
                            odp = czytaj.nextLine();
                            if(odp.equals("H")){
                                if(specialCooldown>=hookSpeed){
                                    System.out.println("You use the hook to attack the shark for "+hookDamage+" damage.");
                                    monsterHealth -= hookDamage;
                                    specialCooldown = 0;
                                    monsterCooldown += 1;
                                    if(monsterCooldown>=monsterSpeed){
                                        System.out.println("Shark attacks you for "+monsterDamage+" damage.");
                                        lineHealth -= monsterDamage;
                                        monsterCooldown = 0;
                                    }
                                    round++;
                                }else{
                                    System.out.println("\nThis attack is currently on cooldown!");
                                }
                            }else if(odp.equals("A")){
                                System.out.println("You attack the shark normally.");
                                monsterHealth -= playerDamage;
                                monsterCooldown += 1;
                                if(monsterCooldown>=monsterSpeed){
                                    System.out.println("Shark attacks you for "+monsterDamage+" damage.");
                                    lineHealth -= monsterDamage;
                                    monsterCooldown = 0;
                                }
                                specialCooldown += 1;
                                round++;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                            if(monsterHealth<=0){
                                win = true;
                                System.out.println("YOU WON!!");
                                break;
                            }
                            if(lineHealth<=0){
                                win = false;
                                System.out.println("\nYou lost. The line broke.. Try upgrading your equipment or changing your strategy.");
                                break;
                            }
                        }
                        if(win){
                            while (true){
                                tempnameCheckmark = false;
                                tempfavCheckmark = false;
                                System.out.println("Do you wish to name your newly caught Shark? (Y/N)");
                                odp = czytaj.nextLine();
                                if(odp.equals("Y")){
                                    while(true){
                                        System.out.println("Name your Shark:");
                                        odp = czytaj.nextLine();
                                        if(!odp.equals("")){
                                            tempname = odp;
                                            System.out.println("Confirm that you want to name your Shark "+odp+": (Y/anything else)");
                                            odp = czytaj.nextLine();
                                            if(odp.equals("Y")){
                                                System.out.println("Your Shark is named "+tempname+".");
                                                tempnameCheckmark = true;
                                                break;
                                            }
                                        }else{
                                            System.out.println("\nType something in.");
                                        }
                                    }
                                    break;
                                }else if(odp.equals("N")){
                                    break;
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }

                            }
                            while(true){
                                System.out.println("Add the Shark to favorites? (Y/N)");
                                odp =  czytaj.nextLine();
                                if(odp.equals("Y")){
                                    tempfavCheckmark = true;
                                    break;
                                }else if(odp.equals("N")){
                                    tempfavCheckmark = false;
                                    break;
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            if(tempnameCheckmark){
                                if(tempfavCheckmark){
                                    shark = new Shark(tempname, true);
                                }else{
                                    shark = new Shark(tempname);
                                }
                            }else{
                                shark = new Shark();
                            }
                            shark.catchCreature();
                            gracz.inventory.add(shark);
                        }

                    }else if(330000000 <= fishingSpecialNumber && fishingSpecialNumber<390000000){

                        // Slow Sardine

                        System.out.println("It's a Slow Sardine swimmin' around..");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught Slow Sardine? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your Slow Sardine:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your Slow Sardine "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your Slow Sardine is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the Slow Sardine to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                slowSardine = new SlowSardine(tempname, true);
                            }else{
                                slowSardine = new SlowSardine(tempname);
                            }
                        }else{
                            slowSardine = new SlowSardine();
                        }
                        slowSardine.catchCreature();
                        gracz.inventory.add(slowSardine);


                    }else if(390000000 <= fishingSpecialNumber && fishingSpecialNumber<450000000){

                        // Zincish

                        System.out.println("It's a Zincish, leaving a zinc-ish trial behind it..");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught Zincish? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your Zincish:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your Zincish "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your Zincish is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the Zincish to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                zincish = new Zincish(tempname, true);
                            }else{
                                zincish = new Zincish(tempname);
                            }
                        }else{
                            zincish = new Zincish();
                        }
                        zincish.catchCreature();
                        gracz.inventory.add(zincish);

                    }else if(450000000 <= fishingSpecialNumber && fishingSpecialNumber<500000000){

                        // Neon Sprinter

                        System.out.println("You can spot a quick Neon Sprinter go by..");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught Neon Sprinter? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your Neon Sprinter:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your Neon Sprinter "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your Neon Sprinter is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the Neon Sprinter to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                neonSprinter = new NeonSprinter(tempname, true);
                            }else{
                                neonSprinter = new NeonSprinter(tempname);
                            }
                        }else{
                            neonSprinter = new NeonSprinter();
                        }
                        neonSprinter.catchCreature();
                        gracz.inventory.add(neonSprinter);

                    }else if(500000000 <= fishingSpecialNumber && fishingSpecialNumber<550000000){

                        // SwordFish

                        System.out.println("You can see a sword floating in the water..!! ..wait actually it's just a Sword Fish..");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught Sword Fish? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your Sword Fish:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your Sword Fish "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your Sword Fish is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the Sword Fish to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                swordFish = new SwordFish(tempname, true);
                            }else{
                                swordFish = new SwordFish(tempname);
                            }
                        }else{
                            swordFish = new SwordFish();
                        }
                        swordFish.catchCreature();
                        gracz.inventory.add(swordFish);

                    }else if(550000000 <= fishingSpecialNumber && fishingSpecialNumber<600000000){

                        // Angry Angler

                        win = false;
                        specialCooldown = 0;
                        lineHealth = gracz.lineDurability;
                        hookDamage = gracz.hookStrength;
                        hookSpeed = gracz.hookSpeed;
                        fightSpeed = gracz.fishingSpeed;
                        playerDamage = 3;
                        monsterHealth = Math.floor(55 - fightSpeed);
                        monsterSpeed = 3;
                        monsterDamage = 5;
                        monsterCooldown = 0;
                        System.out.println("An angry angler attacks!!");
                        while(true){
                            System.out.println("What will you do? ROUND "+round);
                            System.out.println("ANGRY ANGLER HEALTH: "+monsterHealth+"        LINE HEALTH:"+lineHealth+"\n");
                            System.out.println("[H] HOOK ATTACK (SPECIAL) | EVERY "+hookSpeed+" TURNS");
                            System.out.println("[A] Normal Attack | "+playerDamage+" DAMAGE");
                            odp = czytaj.nextLine();
                            if(odp.equals("H")){
                                if(specialCooldown>=hookSpeed){
                                    System.out.println("You use the hook to attack the angler for "+hookDamage+" damage.");
                                    monsterHealth -= hookDamage;
                                    specialCooldown = 0;
                                    monsterCooldown += 1;
                                    if(monsterCooldown>=monsterSpeed){
                                        System.out.println("Angry Angler attacks you for "+monsterDamage+" damage.");
                                        lineHealth -= monsterDamage;
                                        monsterCooldown = 0;
                                    }
                                    round++;
                                }else{
                                    System.out.println("\nThis attack is currently on cooldown!");
                                }
                            }else if(odp.equals("A")){
                                System.out.println("You attack the angler normally.");
                                monsterHealth -= playerDamage;
                                monsterCooldown += 1;
                                if(monsterCooldown>=monsterSpeed){
                                    System.out.println("Angry Angler attacks you for "+monsterDamage+" damage.");
                                    lineHealth -= monsterDamage;
                                    monsterCooldown = 0;
                                }
                                specialCooldown += 1;
                                round++;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                            if(monsterHealth<=0){
                                win = true;
                                System.out.println("YOU WON!!");
                                break;
                            }
                            if(lineHealth<=0){
                                win = false;
                                System.out.println("\nYou lost. The line broke.. Try upgrading your equipment or changing your strategy.");
                                break;
                            }
                        }
                        if(win){
                            while (true){
                                tempnameCheckmark = false;
                                tempfavCheckmark = false;
                                System.out.println("Do you wish to name your newly caught Angry Angler? (Y/N)");
                                odp = czytaj.nextLine();
                                if(odp.equals("Y")){
                                    while(true){
                                        System.out.println("Name your Angry Angler:");
                                        odp = czytaj.nextLine();
                                        if(!odp.equals("")){
                                            tempname = odp;
                                            System.out.println("Confirm that you want to name your Angry Angler "+odp+": (Y/anything else)");
                                            odp = czytaj.nextLine();
                                            if(odp.equals("Y")){
                                                System.out.println("Your Angry Angler is named "+tempname+".");
                                                tempnameCheckmark = true;
                                                break;
                                            }
                                        }else{
                                            System.out.println("\nType something in.");
                                        }
                                    }
                                    break;
                                }else if(odp.equals("N")){
                                    break;
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }

                            }
                            while(true){
                                System.out.println("Add the Angry Angler to favorites? (Y/N)");
                                odp =  czytaj.nextLine();
                                if(odp.equals("Y")){
                                    tempfavCheckmark = true;
                                    break;
                                }else if(odp.equals("N")){
                                    tempfavCheckmark = false;
                                    break;
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            if(tempnameCheckmark){
                                if(tempfavCheckmark){
                                    angryAngler = new AngryAngler(tempname, true);
                                }else{
                                    angryAngler = new AngryAngler(tempname);
                                }
                            }else{
                                angryAngler = new AngryAngler();
                            }
                            angryAngler.catchCreature();
                            gracz.inventory.add(angryAngler);
                        }

                    }else if(600000000 <= fishingSpecialNumber && fishingSpecialNumber<650000000){

                        // Big Fish

                        System.out.println("What's that big thing over there..? Oh.. it's a Big Fish!!");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught Big Fish? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your Big Fish:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your Big Fish "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your Big Fish is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the Big Fish to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                bigFish = new BigFish(tempname, true);
                            }else{
                                bigFish = new BigFish(tempname);
                            }
                        }else{
                            bigFish = new BigFish();
                        }
                        bigFish.catchCreature();
                        gracz.inventory.add(bigFish);


                    }else if(650000000 <= fishingSpecialNumber && fishingSpecialNumber<700000000){

                        // Speedy Sardine

                        System.out.println("Wait.. I think I just saw something small and quick pass by.. Oh I know!! It was a Speedy Sardine!!");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught Speedy Sardine? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your Speedy Sardine:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your Speedy Sardine "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your Speedy Sardine is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the Speedy Sardine to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                speedySardine = new SpeedySardine(tempname, true);
                            }else{
                                speedySardine = new SpeedySardine(tempname);
                            }
                        }else{
                            speedySardine = new SpeedySardine();
                        }
                        speedySardine.catchCreature();
                        gracz.inventory.add(speedySardine);

                    }else if(700000000 <= fishingSpecialNumber && fishingSpecialNumber<750000000){

                        // King Octopus

                        win = false;
                        specialCooldown = 0;
                        lineHealth = gracz.lineDurability;
                        hookDamage = gracz.hookStrength;
                        hookSpeed = gracz.hookSpeed;
                        fightSpeed = gracz.fishingSpeed;
                        playerDamage = 5;
                        monsterHealth = Math.floor(75 - fightSpeed);
                        monsterSpeed = 2;
                        monsterDamage = 5;
                        monsterCooldown = 0;
                        System.out.println("The King Octopus attacks!!");
                        while(true){
                            System.out.println("What will you do? ROUND "+round);
                            System.out.println("KING OCTOPUS HEALTH: "+monsterHealth+"        LINE HEALTH:"+lineHealth+"\n");
                            System.out.println("[H] HOOK ATTACK (SPECIAL) | EVERY "+hookSpeed+" TURNS");
                            System.out.println("[A] Normal Attack | "+playerDamage+" DAMAGE");
                            odp = czytaj.nextLine();
                            if(odp.equals("H")){
                                if(specialCooldown>=hookSpeed){
                                    System.out.println("You use the hook to attack the King Octopus for "+hookDamage+" damage.");
                                    monsterHealth -= hookDamage;
                                    specialCooldown = 0;
                                    monsterCooldown += 1;
                                    if(monsterCooldown>=monsterSpeed){
                                        System.out.println("King Octopus attacks you for "+monsterDamage+" damage.");
                                        lineHealth -= monsterDamage;
                                        monsterCooldown = 0;
                                    }
                                    round++;
                                }else{
                                    System.out.println("\nThis attack is currently on cooldown!");
                                }
                            }else if(odp.equals("A")){
                                System.out.println("You attack the King Octopus normally.");
                                monsterHealth -= playerDamage;
                                monsterCooldown += 1;
                                if(monsterCooldown>=monsterSpeed){
                                    System.out.println("King Octopus attacks you for "+monsterDamage+" damage.");
                                    lineHealth -= monsterDamage;
                                    monsterCooldown = 0;
                                }
                                specialCooldown += 1;
                                round++;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                            if(monsterHealth<=0){
                                win = true;
                                System.out.println("YOU WON!!");
                                break;
                            }
                            if(lineHealth<=0){
                                win = false;
                                System.out.println("\nYou lost. The line broke.. Try upgrading your equipment or changing your strategy.");
                                break;
                            }
                        }
                        if(win){
                            while (true){
                                tempnameCheckmark = false;
                                tempfavCheckmark = false;
                                System.out.println("Do you wish to name your newly caught King Octopus? (Y/N)");
                                odp = czytaj.nextLine();
                                if(odp.equals("Y")){
                                    while(true){
                                        System.out.println("Name your King Octopus:");
                                        odp = czytaj.nextLine();
                                        if(!odp.equals("")){
                                            tempname = odp;
                                            System.out.println("Confirm that you want to name your King Octopus "+odp+": (Y/anything else)");
                                            odp = czytaj.nextLine();
                                            if(odp.equals("Y")){
                                                System.out.println("Your King Octopus is named "+tempname+".");
                                                tempnameCheckmark = true;
                                                break;
                                            }
                                        }else{
                                            System.out.println("\nType something in.");
                                        }
                                    }
                                    break;
                                }else if(odp.equals("N")){
                                    break;
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }

                            }
                            while(true){
                                System.out.println("Add the King Octopus to favorites? (Y/N)");
                                odp =  czytaj.nextLine();
                                if(odp.equals("Y")){
                                    tempfavCheckmark = true;
                                    break;
                                }else if(odp.equals("N")){
                                    tempfavCheckmark = false;
                                    break;
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            if(tempnameCheckmark){
                                if(tempfavCheckmark){
                                    kingOctopus = new KingOctopus(tempname, true);
                                }else{
                                    kingOctopus = new KingOctopus(tempname);
                                }
                            }else{
                                kingOctopus = new KingOctopus();
                            }
                            kingOctopus.catchCreature();
                            gracz.inventory.add(kingOctopus);
                        }

                    }else if(750000000 <= fishingSpecialNumber && fishingSpecialNumber<800000000){

                        // Giant Fish

                        System.out.println("Oh my.. What's that ENOURMOUS THING floating over there..? OHHHHH.. I think that's a Giant Fish!!");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught Giant Fish? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your Giant Fish:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your Giant Fish "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your Giant Fish is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the Giant Fish to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                giantFish = new GiantFish(tempname, true);
                            }else{
                                giantFish = new GiantFish(tempname);
                            }
                        }else{
                            giantFish = new GiantFish();
                        }
                        giantFish.catchCreature();
                        gracz.inventory.add(giantFish);

                    }else if(800000000 <= fishingSpecialNumber && fishingSpecialNumber<850000000){

                        // Leviathan

                        win = false;
                        specialCooldown = 0;
                        lineHealth = gracz.lineDurability;
                        hookDamage = gracz.hookStrength;
                        hookSpeed = gracz.hookSpeed;
                        fightSpeed = gracz.fishingSpeed;
                        playerDamage = 7;
                        monsterHealth = Math.floor(200 - fightSpeed);
                        monsterSpeed = 3;
                        monsterDamage = 10;
                        monsterCooldown = 0;
                        System.out.println("A Leviathan attacks!!");
                        while(true){
                            System.out.println("What will you do? ROUND "+round);
                            System.out.println("LEVIATHAN HEALTH: "+monsterHealth+"        LINE HEALTH:"+lineHealth+"\n");
                            System.out.println("[H] HOOK ATTACK (SPECIAL) | EVERY "+hookSpeed+" TURNS");
                            System.out.println("[A] Normal Attack | "+playerDamage+" DAMAGE");
                            odp = czytaj.nextLine();
                            if(odp.equals("H")){
                                if(specialCooldown>=hookSpeed){
                                    System.out.println("You use the hook to attack the Leviathan for "+hookDamage+" damage.");
                                    monsterHealth -= hookDamage;
                                    specialCooldown = 0;
                                    monsterCooldown += 1;
                                    if(monsterCooldown>=monsterSpeed){
                                        System.out.println("Leviathan attacks you for "+monsterDamage+" damage.");
                                        lineHealth -= monsterDamage;
                                        monsterCooldown = 0;
                                    }
                                    round++;
                                }else{
                                    System.out.println("\nThis attack is currently on cooldown!");
                                }
                            }else if(odp.equals("A")){
                                System.out.println("You attack the Leviathan normally.");
                                monsterHealth -= playerDamage;
                                monsterCooldown += 1;
                                if(monsterCooldown>=monsterSpeed){
                                    System.out.println("Leviathan attacks you for "+monsterDamage+" damage.");
                                    lineHealth -= monsterDamage;
                                    monsterCooldown = 0;
                                }
                                specialCooldown += 1;
                                round++;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                            if(monsterHealth<=0){
                                win = true;
                                System.out.println("YOU WON!!");
                                break;
                            }
                            if(lineHealth<=0){
                                win = false;
                                System.out.println("\nYou lost. The line broke.. Try upgrading your equipment or changing your strategy.");
                                break;
                            }
                        }
                        if(win){
                            while (true){
                                tempnameCheckmark = false;
                                tempfavCheckmark = false;
                                System.out.println("Do you wish to name your newly caught Leviathan? (Y/N)");
                                odp = czytaj.nextLine();
                                if(odp.equals("Y")){
                                    while(true){
                                        System.out.println("Name your Leviathan:");
                                        odp = czytaj.nextLine();
                                        if(!odp.equals("")){
                                            tempname = odp;
                                            System.out.println("Confirm that you want to name your Leviathan "+odp+": (Y/anything else)");
                                            odp = czytaj.nextLine();
                                            if(odp.equals("Y")){
                                                System.out.println("Your Leviathan is named "+tempname+".");
                                                tempnameCheckmark = true;
                                                break;
                                            }
                                        }else{
                                            System.out.println("\nType something in.");
                                        }
                                    }
                                    break;
                                }else if(odp.equals("N")){
                                    break;
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }

                            }
                            while(true){
                                System.out.println("Add the Leviathan to favorites? (Y/N)");
                                odp =  czytaj.nextLine();
                                if(odp.equals("Y")){
                                    tempfavCheckmark = true;
                                    break;
                                }else if(odp.equals("N")){
                                    tempfavCheckmark = false;
                                    break;
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            if(tempnameCheckmark){
                                if(tempfavCheckmark){
                                    leviathan = new Leviathan(tempname, true);
                                }else{
                                    leviathan = new Leviathan(tempname);
                                }
                            }else{
                                leviathan = new Leviathan();
                            }
                            leviathan.catchCreature();
                            gracz.inventory.add(leviathan);
                        }

                    }else if(850000000 <= fishingSpecialNumber && fishingSpecialNumber<900000000){

                        // Excalibur Fish

                        System.out.println("Is that the mythical legendary Excalibur Sword??! Oh wait, that's a Excalibur Fish!! I don't know what's better..?");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught Excalibur Fish? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your Excalibur Fish:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your Excalibur Fish "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your Excalibur Fish is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the Excalibur Fish to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                excaliburFish = new ExcaliburFish(tempname, true);
                            }else{
                                excaliburFish = new ExcaliburFish(tempname);
                            }
                        }else{
                            excaliburFish = new ExcaliburFish();
                        }
                        excaliburFish.catchCreature();
                        gracz.inventory.add(excaliburFish);

                    }else if(900000000 <= fishingSpecialNumber && fishingSpecialNumber<1000000000){

                        // Legendary Golden Koi

                        System.out.println("You can see a golden magical glow.. Is that really..? IT MUST BE!! IT'S THE LEGENDARY GOLDEN KOI!!");

                        // fishin minigame

                        i = 0;
                        while(i*gracz.fishingSpeed<7){
                            randKwadrat = rand.nextInt(0, kwadraty.size()-1);
                            kwadraty.set(randKwadrat, "X");
                            System.out.println("\nSelect the marked square: \n");
                            while(true){
                                o = 0;
                                while(o<kwadraty.size()){
                                    System.out.print(kwadraty.get(o)+" ");
                                    o++;
                                }
                                System.out.print("\n");
                                o = 0;
                                while(o<kwadratyNumbers.size()){
                                    System.out.print(kwadratyNumbers.get(o)+"  ");
                                    o++;
                                }
                                System.out.println("\n");
                                odp = czytaj.nextLine();
                                if(testInta.isInteger(odp)){
                                    if(parseInt(odp)-1==randKwadrat){
                                        kwadraty.set(randKwadrat, "[]");;
                                        break;
                                    }
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            i++;
                        }

                        // naming da fish


                        while (true){
                            tempnameCheckmark = false;
                            tempfavCheckmark = false;
                            System.out.println("Do you wish to name your newly caught Legendary Golden Koi? (Y/N)");
                            odp = czytaj.nextLine();
                            if(odp.equals("Y")){
                                while(true){
                                    System.out.println("Name your Legendary Golden Koi:");
                                    odp = czytaj.nextLine();
                                    if(!odp.equals("")){
                                        tempname = odp;
                                        System.out.println("Confirm that you want to name your Legendary Golden Koi "+odp+": (Y/anything else)");
                                        odp = czytaj.nextLine();
                                        if(odp.equals("Y")){
                                            System.out.println("Your Legendary Golden Koi is named "+tempname+".");
                                            tempnameCheckmark = true;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nType something in.");
                                    }
                                }
                                break;
                            }else if(odp.equals("N")){
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                        }
                        while(true){
                            System.out.println("Add the Legendary Golden Koi to favorites? (Y/N)");
                            odp =  czytaj.nextLine();
                            if(odp.equals("Y")){
                                tempfavCheckmark = true;
                                break;
                            }else if(odp.equals("N")){
                                tempfavCheckmark = false;
                                break;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }
                        }
                        if(tempnameCheckmark){
                            if(tempfavCheckmark){
                                legendaryGoldenKoi = new LegendaryGoldenKoi(tempname, true);
                            }else{
                                legendaryGoldenKoi = new LegendaryGoldenKoi(tempname);
                            }
                        }else{
                            legendaryGoldenKoi = new LegendaryGoldenKoi();
                        }
                        legendaryGoldenKoi.catchCreature();
                        gracz.inventory.add(legendaryGoldenKoi);

                    }else if(1000000000<=fishingSpecialNumber){

                        // DZHARKOV

                        win = false;
                        specialCooldown = 0;
                        lineHealth = gracz.lineDurability;
                        hookDamage = gracz.hookStrength;
                        hookSpeed = gracz.hookSpeed;
                        fightSpeed = gracz.fishingSpeed;
                        playerDamage = 45;
                        monsterHealth = Math.floor(1000 - fightSpeed);
                        monsterSpeed = 3;
                        monsterDamage = 15;
                        monsterCooldown = 0;
                        System.out.println("The Dzharkov attacks!! You've finally found it.");
                        while(true){
                            System.out.println("This is it. What will you do? ROUND "+round);
                            System.out.println("DZHARKOV HEALTH: "+monsterHealth+"        LINE HEALTH:"+lineHealth+"\n");
                            System.out.println("[H] HOOK ATTACK (SPECIAL) | EVERY "+hookSpeed+" TURNS");
                            System.out.println("[A] Normal Attack | "+playerDamage+" DAMAGE");
                            odp = czytaj.nextLine();
                            if(odp.equals("H")){
                                if(specialCooldown>=hookSpeed){
                                    System.out.println("You use the hook to attack the Dzharkov for "+hookDamage+" damage.");
                                    monsterHealth -= hookDamage;
                                    specialCooldown = 0;
                                    monsterCooldown += 1;
                                    if(monsterCooldown>=monsterSpeed){
                                        System.out.println("Dzharkov attacks you for "+monsterDamage+" damage.");
                                        lineHealth -= monsterDamage;
                                        monsterCooldown = 0;
                                    }
                                    round++;
                                }else{
                                    System.out.println("\nThis attack is currently on cooldown!");
                                }
                            }else if(odp.equals("A")){
                                System.out.println("You attack the Dzharkov normally.");
                                monsterHealth -= playerDamage;
                                monsterCooldown += 1;
                                if(monsterCooldown>=monsterSpeed){
                                    System.out.println("Dzharkov attacks you for "+monsterDamage+" damage.");
                                    lineHealth -= monsterDamage;
                                    monsterCooldown = 0;
                                }
                                specialCooldown += 1;
                                round++;
                            }else{
                                System.out.println("\nIncorrect option. Select one of the provided.");
                            }

                            if(monsterHealth<=0){
                                win = true;
                                System.out.println("YOU WON!!");
                                break;
                            }
                            if(lineHealth<=0){
                                win = false;
                                System.out.println("\nYou lost. The line broke.. Try upgrading your equipment or changing your strategy.");
                                break;
                            }
                        }
                        if(win){
                            while (true){
                                tempnameCheckmark = false;
                                tempfavCheckmark = false;
                                System.out.println("Do you wish to name your newly caught Dzharkov? (Y/N)");
                                odp = czytaj.nextLine();
                                if(odp.equals("Y")){
                                    while(true){
                                        System.out.println("Name your Dzharkov:");
                                        odp = czytaj.nextLine();
                                        if(!odp.equals("")){
                                            tempname = odp;
                                            System.out.println("Confirm that you want to name your Dzharkov "+odp+": (Y/anything else)");
                                            odp = czytaj.nextLine();
                                            if(odp.equals("Y")){
                                                System.out.println("Your Dzharkov is named "+tempname+".");
                                                tempnameCheckmark = true;
                                                break;
                                            }
                                        }else{
                                            System.out.println("\nType something in.");
                                        }
                                    }
                                    break;
                                }else if(odp.equals("N")){
                                    break;
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }

                            }
                            while(true){
                                System.out.println("Add the Dzharkov to favorites? (Y/N)");
                                odp =  czytaj.nextLine();
                                if(odp.equals("Y")){
                                    tempfavCheckmark = true;
                                    break;
                                }else if(odp.equals("N")){
                                    tempfavCheckmark = false;
                                    break;
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                            if(tempnameCheckmark){
                                if(tempfavCheckmark){
                                    dzharkov = new Dzharkov(tempname, true);
                                }else{
                                    dzharkov = new Dzharkov(tempname);
                                }
                            }else{
                                dzharkov = new Dzharkov();
                            }
                            dzharkov.catchCreature();
                            gracz.inventory.add(dzharkov);
                        }

                    }
                }else{
                    System.out.println("\nYour inventory is FULL. Go sell some fishes at the Selling Station.");
                }
            }else if(odp.equals("2")){
                SellStation sellStation = new SellStation();
                while (true){
                    sellStation.enter();
                    System.out.println("[S] SELL FISHES");
                    System.out.println("[X] RETURN");
                    odp = czytaj.nextLine();
                    if(odp.equals("S")){
                        while(true){
                            if(!gracz.inventory.isEmpty()){
                                i = 0;
                                System.out.println("Choose your fish to sell:");
                                for(Creature creature : gracz.inventory){
                                    System.out.println("["+i+"] "+creature.toString());
                                    i++;
                                }
                                System.out.println("[X] RETURN");
                                odp = czytaj.nextLine();
                                if(odp.equals("X")){
                                    break;
                                }else if(parseInt(String.valueOf(odp))>=0 && parseInt(String.valueOf(odp))< gracz.inventory.size()){
                                    Creature creature = gracz.inventory.get(parseInt(String.valueOf(odp)));
                                    double value = creature.value();
                                    if(creature instanceof Dzharkov){
                                        System.out.println("You sent off the Dzharkov..");
                                        winCondition = true;
                                    }
                                    gracz.inventory.remove(parseInt(String.valueOf(odp)));
                                    gracz.money = sellStation.sell(gracz.money, value);
                                    System.out.println("You sold the fish, your money is now: "+gracz.money+".");
                                }else{
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }else{
                                System.out.println("Your inventory is empty..");
                                break;
                            }
                        }
                    }else if(odp.equals("X")){
                        break;
                    }else{
                        System.out.println("\nIncorrect option. Select one of the provided.");
                    }
                }


            }else if(odp.equals("3")){
                // UPGRADES:
                while(true){
                    System.out.println("AVAILABLE UPGRADES:");
                    i = 0;
                    while(i<5&&i<upgrades.size()){
                        System.out.println("["+i+"] "+upgradeList.get(i)+ " Cost: "+upgrades.get(upgradeList.get(i)).getPrice());
                        i++;
                    }
                    System.out.println("[X] RETURN");
                    odp = czytaj.nextLine();
                    if(testInta.isInteger(odp)){
                        if(0 <= parseInt(odp) && parseInt(odp) < 5) {
                            if (gracz.money >= upgrades.get(upgradeList.get(parseInt(odp))).price) {
                                returnList = upgrades.get(upgradeList.get(parseInt(odp))).buy(gracz.money, gracz.inventorySpace, gracz.fishingSpeed, gracz.hookSpeed, gracz.hookStrength, gracz.lineDurability, labDouble);
                                gracz.money = returnList.get(0);
                                gracz.inventorySpace = returnList.get(1);
                                gracz.fishingSpeed = returnList.get(2);
                                gracz.hookSpeed = returnList.get(3);
                                gracz.hookStrength = returnList.get(4);
                                gracz.lineDurability = returnList.get(5);
                                labDouble = returnList.get(6);
                                if(labDouble == 1){
                                    theLab = true;
                                }
                                upgrades.remove(upgradeList.get(parseInt(odp)));
                                upgradeList.remove(parseInt(odp));
                                break;
                            } else {
                                System.out.println("\nNot enough money to purchase this upgrade.");
                            }
                        }else{
                            System.out.println("\nIncorrect option. Select one of the provided.");
                        }
                    }else if(odp.equals("X")){
                        break;
                    }else{
                        System.out.println("\nIncorrect option. Select one of the provided.");
                    }
                }
            }else if(odp.equals("4")){
                // SHOP SCREEN:
                while (true){
                    i = 0;
                    for(FishingRod fishingRod : unownedFishingRods){
                        System.out.println("["+i+"] "+fishingRod.toString() + " PRICE: " + fishingRod.getPrice() + "\n");
                        i++;
                    }
                    System.out.println("[X] RETURN");
                    odp = czytaj.nextLine();
                    if(testInta.isInteger(odp)){
                        if(0<=parseInt(odp) && parseInt(odp)<i){
                            if(gracz.money>=unownedFishingRods.get(parseInt(odp)).getPrice()){
                                unownedFishingRods.get(parseInt(odp)).buy(gracz.money);

                                System.out.println("Fishing rod has been purchased. Check your inventory to equip it.");
                                ownedFishingRods.add(unownedFishingRods.get(parseInt(odp)));
                                unownedFishingRods.remove(parseInt(odp));
                            }else{
                                System.out.println("\nNot enough money to purchase this fishing rod.");
                            }
                        }else{
                            System.out.println("\nIncorrect option. Select one of the provided.");
                        }
                    }else if(odp.equals("X")){
                        break;
                    }else{
                        System.out.println("\nIncorrect option. Select one of the provided.");
                    }
                }
            }else if(odp.equals("5")){
                if(!theLab){
                    System.out.println("You can see nothing but sparks coming out of the door.");
                }else{
                    System.out.println("You enter The Lab..");
                    // THE LAB
                    while(true){
                        System.out.println("Welcome to the lab. The machine can either double your money (2/3 chance) or reset it (1/3 chance). YOUR MONEY: "+gracz.money);
                        System.out.println("[G] TAKE A CHANCE");
                        System.out.println("[X] RETURN");
                        odp = czytaj.nextLine();
                        if(odp.equals("G")){
                            gamble = gambleNumber.nextInt(0, 3);
                            if(gracz.money>0){
                                if(gamble>=2){
                                    gracz.money = 0;
                                    System.out.println("Womp womp, your money is cleared out.");
                                }else{
                                    gracz.money = gracz.money * 2;
                                    System.out.println("YAY!! YOUR MONEY IS DOUBLED!!");
                                }
                            }else{
                                System.out.println("You have no money to gamble with. :(");
                            }
                        }else if(odp.equals("X")){
                            break;
                        }else{
                            System.out.println("\nIncorrect option. Select one of the provided.");
                        }
                    }
                }
            }else if(odp.equals("I")) {
                while (true) {
                    System.out.println("Fish Inventory:");
                    i = 0;
                    if (!gracz.inventory.isEmpty()) {
                        for (Creature creature : gracz.inventory) {
                            System.out.println("(" + i + ") " + creature.toString());
                            i++;
                        }
                    } else {
                        System.out.println("[EMPTY]");
                    }
                    System.out.println("\nPlayer Stats:");
                    System.out.println("MONEY: " + gracz.money);
                    System.out.println("INVENTORY SPACE: " + gracz.inventorySpace);
                    System.out.println("FISHING SPEED: " + gracz.fishingSpeed);
                    System.out.println("HOOK SPEED: " + gracz.hookSpeed);
                    System.out.println("HOOK STRENGTH: " + gracz.hookStrength);
                    System.out.println("LINE DURABILITY: " + gracz.lineDurability);
                    System.out.println("LUCK: " + gracz.luck);


                    System.out.println("\nFISHING RODS (SELECT TO EQUIP):");
                    if (!ownedFishingRods.isEmpty()) {
                        for (FishingRod fishingRod : ownedFishingRods) {
                            System.out.println("(" + i + ") " + fishingRod.toString() + "\n");
                            i++;
                        }
                    } else {
                        System.out.println("[EMPTY]");
                    }
                    System.out.println("[X] RETURN");
                    odp = czytaj.nextLine();
                    if (testInta.isInteger(odp)) {
                        if (0 <= parseInt(odp) && parseInt(odp) < gracz.inventory.size()) {
                            i = parseInt(odp);
                            while (true) {
                                System.out.println("What do you want to do about this fish?");
                                System.out.println("[C] CHECK");
                                if (Fish.class.isAssignableFrom(gracz.inventory.get(i).getClass())) {
                                    System.out.println("[F] Feed the fish");
                                    System.out.println("[S] Casual swim");
                                } else {
                                    System.out.println("[T] Train fighting");
                                    System.out.println("[R] Make monster ROAR");
                                }
                                System.out.println("[X] RETURN");
                                odp = czytaj.nextLine();
                                if (odp.equals("C")) {
                                    System.out.println("This is a " + gracz.inventory.get(i).toString());
                                } else if (odp.equals("F")) {
                                    if (Fish.class.isAssignableFrom(gracz.inventory.get(i).getClass())) {
                                        Fish fish = (Fish) gracz.inventory.get(i);
                                        fish.eat();
                                    } else {
                                        System.out.println("\nIncorrect option. Select one of the provided.");
                                    }
                                } else if (odp.equals("S")) {
                                    if (Fish.class.isAssignableFrom(gracz.inventory.get(i).getClass())) {
                                        Fish fish = (Fish) gracz.inventory.get(i);
                                        fish.swim();
                                    } else {
                                        System.out.println("\nIncorrect option. Select one of the provided.");
                                    }
                                } else if (odp.equals("T")) {
                                    if (Monster.class.isAssignableFrom(gracz.inventory.get(i).getClass())) {
                                        Monster monster = (Monster) gracz.inventory.get(i);
                                        monster.fight();
                                    } else {
                                        System.out.println("\nIncorrect option. Select one of the provided.");
                                    }
                                } else if (odp.equals("R")) {
                                    if (Monster.class.isAssignableFrom(gracz.inventory.get(i).getClass())) {
                                        Monster monster = (Monster) gracz.inventory.get(i);
                                        monster.roar();
                                    } else {
                                        System.out.println("\nIncorrect option. Select one of the provided.");
                                    }
                                } else if (odp.equals("X")) {
                                    break;
                                } else {
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                        } else if (gracz.inventory.size() <= parseInt(odp) && parseInt(odp) < i) {
                            while (true) {
                                i = parseInt(odp) - gracz.inventory.size();
                                System.out.println("Do you wish to equip this rod? (Y/N)");
                                odp = czytaj.nextLine();
                                if (odp.equals("Y")) {
                                    newStats[0] = ownedFishingRods.get(i).getCoreLuck();
                                    newStats[1] = ownedFishingRods.get(i).getCoreFishingSpeed();
                                    newStats[2] = ownedFishingRods.get(i).getCoreHookSpeed();
                                    newStats[3] = ownedFishingRods.get(i).getCoreHookStrength();
                                    newStats[4] = ownedFishingRods.get(i).getCoreLineDurability();
                                    currentStats = gracz.setStats(currentStats, newStats);
                                    System.out.println("Fishing rod equipped.");
                                    break;
                                } else if (odp.equals("N")) {
                                    break;
                                } else {
                                    System.out.println("\nIncorrect option. Select one of the provided.");
                                }
                            }
                        } else {
                            System.out.println("\nIncorrect option. Select one of the provided.");
                        }
                    } else if (odp.equals("X")) {
                        break;
                    } else {
                        System.out.println("\nIncorrect option. Select one of the provided.");
                    }
                }
            }else if(odp.equals("W")){
                if(winCondition){
                    text = "Your superiors reported they received the Dharkov you caught. Your mission is completed. You're going to miss this place. Probably.\n";
                    for(i = 0; i < text.length(); i++){
                        System.out.printf("%c", text.charAt(i));
                        try{
                            Thread.sleep(50);
                        }catch(InterruptedException ex){
                            Thread.currentThread().interrupt();
                        }
                    }
                    text = "You entered the submarine arriving in front of your base. You said goodbye to the base that served as your home.\n";
                    for(i = 0; i < text.length(); i++){
                        System.out.printf("%c", text.charAt(i));
                        try{
                            Thread.sleep(50);
                        }catch(InterruptedException ex){
                            Thread.currentThread().interrupt();
                        }
                    }
                    text = "You arrive safely at the surface and enjoy your freedom. The mission was such a success your company not only paid you and allowed you to keep the money you made while deep underwater.\n";
                    for(i = 0; i < text.length(); i++){
                        System.out.printf("%c", text.charAt(i));
                        try{
                            Thread.sleep(50);
                        }catch(InterruptedException ex){
                            Thread.currentThread().interrupt();
                        }
                    }
                    text = "You also managed to get a long vacation, so you're gonna use it completely and finally chill out after spending so much time down there.\n";
                    for(i = 0; i < text.length(); i++){
                        System.out.printf("%c", text.charAt(i));
                        try{
                            Thread.sleep(50);
                        }catch(InterruptedException ex){
                            Thread.currentThread().interrupt();
                        }
                    }
                    text = "THE END.\n";
                    for(i = 0; i < text.length(); i++){
                        System.out.printf("%c", text.charAt(i));
                        try{
                            Thread.sleep(50);
                        }catch(InterruptedException ex){
                            Thread.currentThread().interrupt();
                        }
                    }
                    break;
                }else{
                    System.out.println("\nIncorrect option. Select one of the provided.");
                }
            }else if(odp.equals("X")){
                break;
            }else{
                System.out.println("\nIncorrect option. Select one of the provided.");
            }
        }


    }

}