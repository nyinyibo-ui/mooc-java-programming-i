
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(1);
        counter.increase(2);
        counter.increase();
        counter.increase();
        System.out.println(counter.value());
        
        counter.decrease(2);
        counter.decrease();
        counter.decrease();
        System.out.println(counter.value());
    }
}
