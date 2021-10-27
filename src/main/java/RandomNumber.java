import java.util.Random;

public class RandomNumber {
    int min;
    int max;


    public static void main(String[] args) {


        RandomNumber number = new RandomNumber();
        number.draw();
        System.out.println("max: " + number.getMax());
        System.out.println("min: " + number.getMin());
    }

    public void draw() {
        Random rand = new Random();
        for (int i = 0; i <= 5000; ) {
            int randomNumber = rand.nextInt(31);
            i += randomNumber;
            if (randomNumber > max) {
                max = randomNumber;
            }
            if (randomNumber < min) {
                min = randomNumber;
            }
        }
    }

    public int getMax() {
        return max;

    }

    public int getMin() {
        return min;

    }
}
