public class Calculator implements Area, Circumference, Volume{

    static double PI = 3.14159;

    public Calculator(){}

    @Override
    public double AreaTriangle(double length, double width) {return (length * width) / 2.0;}

    @Override
    public double AreaRectangle(double length, double width) {return length * width;}

    @Override
    public double AreaCircle(double radius) {return PI * radius * radius;}

    @Override
    public double CircumferenceTriangle(double length, double width, double hypotenuse) {return length + width + hypotenuse;}

    @Override
    public double CircumferenceRectangle(double length, double width) {return 2 * length + 2 * width;}

    @Override
    public double CircumferenceCircle(double radius) {return 2 * PI * radius;}

    @Override
    public double VolumePyramid(double length, double width, double height) {return (1.0/3.0) * length * width * height;}

    @Override
    public double VolumeRectangle(double length, double width, double height) {return length * width * height;}

    @Override
    public double VolumeSphere(double radius) {return (4.0/3.0) * PI * radius * radius * radius;}
}
