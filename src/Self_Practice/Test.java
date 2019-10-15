package Self_Practice;
import Self_Practice.Car;

public class Test {

    public static void main(String[] args) throws Exception {
        Car c= (Car) Class.forName("Car").newInstance();
        System.out.println(c.getName());
    }
}