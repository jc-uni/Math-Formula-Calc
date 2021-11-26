import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator Calc = new Calculator();

    @Test
    void areaTriangleIntResult() {
        double expected = 15;
        double actual = Calc.AreaTriangle(5,6);
        assertEquals(expected,actual);
    }

    @Test
    void areaTriangleFloatResult() {
        double expected = 18.5365;
        double actual = Calc.AreaTriangle(5.66,6.55);
        actual = Calc.RoundAnswer(actual);
        assertEquals(expected,actual);
    }

    @Test
    void areaRectangleIntResult() {
        double expected = 12;
        double actual = Calc.AreaRectangle(3,4);
        assertEquals(expected,actual);
    }

    @Test
    void areaRectangleFloatResult() {
        double expected = 53.1187;
        double actual = Calc.AreaRectangle(6.47,8.21);
        actual = Calc.RoundAnswer(actual);
        assertEquals(expected,actual);
    }

    @Test
    void areaCircle() {
        double expected = 153.93791;
        double actual = Calc.AreaCircle(7);
        assertEquals(expected,actual);
    }

    @Test
    void circumferenceTriangleIntResult() {
        double expected = 23;
        double actual = Calc.CircumferenceTriangle(7,4,12);
        assertEquals(expected,actual);
    }

    @Test
    void circumferenceTriangleFloatResult() {
        double expected = 17.62;
        double actual = Calc.CircumferenceTriangle(2.74,3.28,11.6);
        actual = Calc.RoundAnswer(actual);
        assertEquals(expected,actual);
    }

    @Test
    void circumferenceRectangleIntResult() {
        double expected = 34;
        double actual = Calc.CircumferenceRectangle(8,9);
        assertEquals(expected,actual);
    }

    @Test
    void circumferenceRectangleFloatResult() {
        double expected = 21.88;
        double actual = Calc.CircumferenceRectangle(4.23,6.71);
        actual = Calc.RoundAnswer(actual);
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
        double expected = 2227.5;
        double actual = Calc.VolumePyramid(15,15,30);
        assertEquals(expected,actual);
    }

    @Test
    void volumeRectangleIntResult() {
        double expected = 1944;
        double actual = Calc.VolumeRectangle(4,9,54);
        assertEquals(expected,actual);
    }

    @Test
    void volumeRectangleFloatResult() {
        double expected = 89.5437;
        double actual = Calc.VolumeRectangle(2.97,4.61,6.54);
        actual = Calc.RoundAnswer(actual);
        assertEquals(expected,actual);
    }

    @Test
    void volumeSphere() {
        double expected = 28659.0605;
        double actual = Calc.VolumeSphere(19);
        actual = Calc.RoundAnswer(actual);
        assertEquals(expected,actual);
    }
}