import java.util.Random;

public class GameCharacter {

        private int characterId;
        private String name;
        private int level;
        private int health;

        private static int totalCharacters = 0;
        private static final Random randomIdGenerator = new Random();

        public GameCharacter(String name, int level, int health) {
            GameCharacter.totalCharacters++;

            this.characterId = randomIdGenerator.nextInt(9000) + 1000;

            this.name = name;
            this.level = level;
            this.health = health;
        }

        public int getCharacterId() {
            return characterId;
        }

        public String getName() {
            return name;
        }

        public int getLevel() {
            return level;
        }

        public int getHealth() {
            return health;
        }

        public static int getTotalCharacters() {
            return totalCharacters;
        }

        public void takeDamage(int damage) {
            if (damage > 0) {
                this.health -= damage;
                if (this.health < 0) {
                    this.health = 0;
                }
            }
        }

        public void heal(int amount) {
            if (amount > 0) {
                this.health += amount;
            }
        }

        public String getInfo() {
            return "Character Info:\n" +
                    "  ID: " + this.characterId + "\n" +
                    "  Name: " + this.name + "\n" +
                    "  Level: " + this.level + "\n" +
                    "  Health: " + this.health;
        }
    }