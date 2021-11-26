import java.util.Scanner;

public class GUI {
    public GUI(){
        Calculator Calc = new Calculator();
        String input;
        var scanner = new Scanner(System.in);

        System.out.println("Hello" +"\r\n" +"What would you like to calculate?");
        input = scanner.nextLine();

        switch (input){
            case "0" -> System.out.println("area, circle");
            case "1" -> System.out.println("area, triangle");
            case "2" -> System.out.println("area, rectangle");
            case "3" -> System.out.println("circumference, circle");
            case "4" -> System.out.println("circumference, triangle");
            case "5" -> System.out.println("circumference, rectangle");
            case "6" -> System.out.println("volume, sphere");
            case "7" -> System.out.println("volume, pyramid");
            case "8" -> System.out.println("volume, rectangle");
        }
    }



}
