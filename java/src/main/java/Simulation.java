public class Simulation {

    public static void main(String[] args) {
        Dice dice = new Dice(2);

        System.out.println("Testing dice rolls: ");
        for (int i = 0; i < 10; i++) {
            int result = dice.tossAndSum();
            System.out.println("Rolled " + (i+1) + ": " + result);
        }

    }
}
