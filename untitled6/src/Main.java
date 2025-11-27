public class Main {

        public static void main(String[] args) {

            GameCharacter hero = new GameCharacter("Player1", 10, 100);
            GameCharacter villain = new GameCharacter("Player2", 5, 50);

            System.out.println("--- Initial State ---");
            System.out.println(hero.getInfo());
            System.out.println("--------------------");
            System.out.println(villain.getInfo());
            System.out.println("--------------------");
            System.out.println("Total Characters Created: " + GameCharacter.getTotalCharacters());
            System.out.println("\n");


            System.out.println("--- Battle Simulation ---");

            System.out.println(hero.getName() + " takes 30 damage.");
            hero.takeDamage(30);
            System.out.println(hero.getName() + "'s new health: " + hero.getHealth());

            System.out.println(villain.getName() + " heals for 15.");
            villain.heal(15);
            System.out.println(villain.getName() + "'s new health: " + villain.getHealth());

            System.out.println(hero.getName() + " takes massive 150 damage.");
            hero.takeDamage(150);
            System.out.println(hero.getName() + "'s new health (should be 0): " + hero.getHealth());

            System.out.println("\n--- Final State ---");
            System.out.println(hero.getInfo());
        }
    }