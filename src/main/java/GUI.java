import java.util.Scanner;

public class GUI {
    public GUI(){
        Calculator Calc = new Calculator();
        String userInput;
        boolean isFinishedDoingMath = false;
        var scanner = new Scanner(System.in);

        while (!isFinishedDoingMath){
            System.out.println("Hello" +"\r\n" +"What would you like to calculate (0-8)?");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "0" -> {
                    System.out.println("area, circle" + "\r\n" + "Radius:");
                    System.out.println("The area is: "
                            + Calc.RoundAnswer(Calc.AreaCircle(scanner.nextDouble())));
                }
                case "1" -> {
                    System.out.println("area, triangle " +"\r\n" +"dimensions:");
                    System.out.println("The area is: "
                            + Calc.RoundAnswer(Calc.AreaTriangle(scanner.nextDouble(),scanner.nextDouble())));
                }
                case "2" -> {
                    System.out.println("area, rectangle" +"\r\n" +"dimensions:");
                    System.out.println("The area is: "
                            + Calc.RoundAnswer(Calc.AreaRectangle(scanner.nextDouble(),scanner.nextDouble())));
                }
                case "3" -> {
                    System.out.println("circumference, circle" +"\r\n" +"Radius:");
                    System.out.println("The circumference is: "
                            + Calc.RoundAnswer(Calc.CircumferenceCircle(scanner.nextDouble())));
                }
                case "4" -> {
                    System.out.println("circumference, triangle" +"\r\n" +"dimensions:");
                    System.out.println("The circumference is: "
                            + Calc.RoundAnswer(Calc.CircumferenceTriangle(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble())));
                }
                case "5" -> {
                    System.out.println("circumference, rectangle" +"\r\n" +"dimensions:");
                    System.out.println("The circumference is: "
                            + Calc.RoundAnswer(Calc.CircumferenceRectangle(scanner.nextDouble(),scanner.nextDouble())));
                }
                case "6" -> {
                    System.out.println("volume, sphere" +"\r\n" +"Radius:");
                    System.out.println("The volume is: "
                            + Calc.RoundAnswer(Calc.VolumeSphere(scanner.nextDouble())));
                }
                case "7" -> {
                    System.out.println("volume, pyramid" +"\r\n" +"dimensions:");
                    System.out.println("The volume is: "
                            + Calc.RoundAnswer(Calc.VolumePyramid(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble())));
                }
                case "8" -> {
                    System.out.println("volume, rectangle" +"\r\n" +"dimensions:");
                    System.out.println("The volume is: "
                            + Calc.RoundAnswer(Calc.VolumeRectangle(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble())));
                }
            }
            if(!userInput.equals("0") && !userInput.equals("1") && !userInput.equals("3") && !userInput.equals("4")
                    && !userInput.equals("5") && !userInput.equals("6") && !userInput.equals("7") && !userInput.equals("8")){
                System.out.println("Incorrect alternative (not 0-8)." + "\r\n");
            }
            else {
                scanner.nextLine();//Consumes '\n' from last scan. The line 'userInput = scanner.nextLine();' is skipped otherwise
                System.out.println("Do more calculations (y or n)?");
                userInput = scanner.nextLine();
                if (userInput.equals("n")){
                    isFinishedDoingMath = true;
                }
            }
        }
    }
}
