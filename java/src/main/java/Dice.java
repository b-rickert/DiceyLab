import java.util.Random;

public class Dice {
int numberOfDice = 2;
int min = 1;
int max = 6;
private Random random;


    public Dice(int numberOfDice) {
    random = new Random();
    this.numberOfDice = numberOfDice; //class variable -> value passed in
    }

    public int RandomInt(int min, int max) {
    return random.nextInt(max - min + 1) + min;
    }

    public int tossAndSum() {
    int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
        sum += RandomInt(1, 6);
        }
        return sum;
    }
}
