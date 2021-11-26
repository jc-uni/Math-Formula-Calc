import java.util.Scanner;

public class GUI {
    public GUI(){
        Calculator Calc = new Calculator();
        String input;
        var scanner = new Scanner(System.in);

        System.out.println("Hello" +"\r\n" +"What would you like to calculate (0-8)?");
        input = scanner.nextLine();

        switch (input) {
            case "0" -> {
                System.out.println("area, circle" + "\r\n" + "Radius:");
                System.out.println("The area is: " + Calc.RoundAnswer(Calc.AreaCircle(scanner.nextDouble())));
            }
            case "1" -> {
                System.out.println("area, triangle " +"\r\n" +"dimensions:");
                System.out.println();
            }
            case "2" -> {
                System.out.println("area, rectangle" +"\r\n" +"dimensions:");
            }
            case "3" -> {
                System.out.println("circumference, circle" +"\r\n" +"Radius:");
            }
            case "4" -> {
                System.out.println("circumference, triangle" +"\r\n" +"dimensions:");
            }
            case "5" -> {
                System.out.println("circumference, rectangle" +"\r\n" +"dimensions:");
            }
            case "6" -> {
                System.out.println("volume, sphere" +"\r\n" +"Radius:");
            }
            case "7" -> {
                System.out.println("volume, pyramid" +"\r\n" +"dimensions:");
            }
            case "8" -> {
                System.out.println("volume, rectangle" +"\r\n" +"dimensions:");
            }
        }
    }
}
