
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;

    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (count == 0) {
            return 0;
        } else {
            return (1.0 * this.sum / count);

        }
    }

    public int getCount() {
        return this.count;
    }
}
