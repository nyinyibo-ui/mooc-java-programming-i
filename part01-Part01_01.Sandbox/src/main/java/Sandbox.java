
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Person Nyi=new  Person("NYI NYI BO ",2023);
        System.out.println("Before time travel: "+Nyi);
        TimeTravel jarvis=new TimeTravel(Nyi);
        jarvis.travelInTime(-4);
        System.out.println(Nyi);
    }

}
