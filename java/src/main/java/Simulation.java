public class Simulation {
    private Dice dice;
    private Bins bins;
    private int numOfTosses;

    public Simulation(int numberOfDice, int numOfTosses) {
        this.dice = new Dice(numberOfDice);
        this.bins = new Bins(numberOfDice, numberOfDice * 6);
        this.numOfTosses = numOfTosses;
    }

    public void runSimulation() {
        for (int i = 0; i < numOfTosses; i++) {
            int result = dice.tossAndSum(); // rolls the dice
            bins.incrementBin(result); // records our result
        }
    }

    public void printResults() {
        System.out.println("***");
        System.out.println("Simulation of 2 dice tossed 1000000 times");
        System.out.println("***");

        for (int i = 2; i <= 12; i++) {
            int count = bins.getBin(i); 
            double percentage = (double) count / numOfTosses;
            System.out.printf("%2d : %8d: %.2f\n" , i, count, percentage);
            

        }
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }
}