import java.util.Random;

public class ServerNameGenerator {

        public static String [] nouns = {"Albert", "the stairs", "my dog", "a rat", "Mount Vesuvius", "Disneyland", "DocRob", "my hair", "the floor", "Glasgow"};
        public static String [] adjectives = {"enormous", "doglike", "silly", "yellow", "fun", "fast", "boring", "slow", "smell", "scariest"};


        public static void main(String[] args) {

            System.out.println("Here is your server name: ");
            System.out.println(getRandomElement(adjectives) + "-" + getRandomElement(nouns));

        }

        public static int numberGenerator(int size) {
        return (int) (Math.random() * size);
    }

        public static String getRandomElement(String[] arrayPassed) {
            int randNum = numberGenerator(arrayPassed.length);
            return arrayPassed[randNum];
        }

}
