package enemies;



import locations_places_npc.Adventure;
import java.util.Objects;
import java.util.Random;


public class DrawEnemy {

    public static void chooseOpponent() {
        boolean drawEnemy = true;
        while (drawEnemy) {

            String chosenOpponent;
            chosenOpponent = String.valueOf(generateRandomEnemy());
            System.out.println(chosenOpponent);
            System.out.println(Objects.equals(chosenOpponent, Adventure.typeOfEnemy));
            if (Objects.equals(chosenOpponent, "Forrest")) {
                System.out.println("im form forrest");
            } else {
                System.out.println("im not from forrest");
            }
            drawEnemy = false;
            ;
        }
    }

    public static EnemyType generateRandomEnemy() {
        EnemyType[] values = EnemyType.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }

    public static String getValueOfEnumEnemy(EnemyType et) {
        System.out.println(et.env);
        return et.env;
    }


    public static void oldMineEnemy() {

        String[] listOfOldMineEnemy = {"Goblin", "Slime", "Troll", "Golem"};

        switch (listOfOldMineEnemy[getRandomNumber(0, listOfOldMineEnemy.length)]) {
            case "Goblin":
                System.out.println("its a Goblin");
                break;
            case "Slime":
                System.out.println("its a Slime");
                break;
            case "Troll":
                System.out.println("its a Troll");
                break;
            case "Golem":
                System.out.println("its a Golem");
                break;
            default:
                System.out.println("poza listą");

        }
    }

    public static void oldRuinsEnemy() {

        String[] listOfOldRuinsEnemy = {"Skeleton", "Zombie", "Ghoul", "Demon"};

        switch (listOfOldRuinsEnemy[getRandomNumber(0, listOfOldRuinsEnemy.length)]) {
            case "Skeleton":
                System.out.println("its a Skeleton");
                break;
            case "Zombie":
                System.out.println("its a Zombie");
                break;
            case "Ghoul":
                System.out.println("its a Ghoul");
                break;
            case "Demon":
                System.out.println("its a Demon");
                break;
            default:
                System.out.println("poza listą");

        }
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);

    }
}

