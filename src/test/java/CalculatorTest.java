import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator Calc = new Calculator();

    @Test
    void areaTriangleInt() {
        double expected = 15;
        double actual = Calc.AreaTriangle(5,6);
        assertEquals(expected,actual);
    }

    @Test
    void areaTriangleFloat() {
        double expected = 18.5365;
        double actual = Calc.AreaTriangle(5.66,6.55);
        assertEquals(expected,actual);
    }

    @Test
    void areaRectangle() {
        double expected = 12;
        double actual = Calc.AreaRectangle(3,4);
        assertEquals(expected,actual);
    }

    @Test
    void areaCircle() {
        double expected = 153.93791;
        double actual = Calc.AreaCircle(7);
        assertEquals(expected,actual);
    }

    @Test
    void circumferenceTriangle() {
        double expected = 23;
        double actual = Calc.CircumferenceTriangle(7,4,12);
        assertEquals(expected,actual);
    }

    @Test
    void circumferenceRectangle() {
        double expected = 34;
        double actual = Calc.CircumferenceRectangle(8,9);
        assertEquals(expected,actual);
    }

    @Test
    void circumferenceCircle() {
        double expected = 43.98226;
        double actual = Calc.CircumferenceCircle(7);
        assertEquals(expected,actual);
    }

    @Test
    void volumePyramid() {
        double expected = 2217.6;
        double actual = Calc.VolumePyramid(14,16,30);
        assertEquals(expected,actual);
    }

    @Test
    void volumeRectangle() {
        double expected = 1944;
        double actual = Calc.VolumeRectangle(4,9,54);
        assertEquals(expected,actual);
    }

    @Test
    void volumeSphere() {
        double expected = 28659.0605273;
        double actual = Calc.VolumeSphere(19);
        assertEquals(expected,actual);
    }
}