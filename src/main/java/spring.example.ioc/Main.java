package spring.example.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.example.ioc.sources.Car;
import spring.example.ioc.sources.CarAT;

import java.util.Scanner;

public class Main {
    public static String mt = "mt";
    public static String at = "at";
    public static String input;
    public static String exit = "exit";
    public static boolean sWitch = true;

    public static void main(String[] args) {
        Input();
        while (sWitch) {
            try {
                if (input.toLowerCase().matches(mt)) {
                    Mt();
                    Input();
                } else if (input.toLowerCase().matches(at)) {
                    At();
                    Input();
                } else if (input.toLowerCase().matches(exit)) {
                    sWitch = false;
                } else {
                    System.out.println("Wrong command! Please enter at/mt or Exit");
                    Input();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void Mt(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car.getName());
        System.out.println(car.getGearBoxMT());
        System.out.println(car.getCarBody());
        System.out.println(car.getEngine());
        System.out.println(car.getWheel() + "\n");
        context.close();
    }
    public static void At(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTwo.xml");
        CarAT carAT = context.getBean("carAt", CarAT.class);
        System.out.println(carAT + "\n");
        context.close();
    }
    public static void Input(){
        System.out.println("Please choose GearBox AT or MT or Exit: ");
        input = new Scanner(System.in).nextLine();
    }
}
