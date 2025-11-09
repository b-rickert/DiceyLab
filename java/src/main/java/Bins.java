
// Bins array to hold counts for every possible total between min and max rolls

public class Bins {
    private int[] bins;
    private int minRoll;
    private int maxRoll;

    public Bins(int minRoll, int maxRoll) {
        this.minRoll = minRoll;
        this.maxRoll = maxRoll;
        this.bins = new int[maxRoll - minRoll + 1];
    }

    public void incrementBin(int binNum) {
        int index = binNum - minRoll;  // tells where in the array bin belongs
        bins[index]++; // Takes current stored bin and adds 1 and re-stores it back
    }

    public int getBin(int binNum) {
        int index = binNum - minRoll;
        return bins[index];
    }
}
