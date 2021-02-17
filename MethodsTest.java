import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodsTest {


    @Test
    void testFindLastDigitSquare() {
        int actual1=Methods.findLastDigitSquare(36);
        int expected1=6;
        assertEquals(expected1,actual1);

        int actual2=Methods.findLastDigitSquare(1);
        int expected2=1;
        assertEquals(expected2,actual2);

        int actual3=Methods.findLastDigitSquare(20);
        int expected3=0;
        assertEquals(expected3,actual3);
    }

    @Test
    void testAmountOfDays() throws Exception {
        int actual1=Methods.amountOfDays(12, 2020);
        int expected1=31;
        assertEquals(expected1, actual1);

        int actual2=Methods.amountOfDays(2, 2021);
        int expected2=28;
        assertEquals(expected2, actual2);

        int actual3=Methods.amountOfDays(4, 2019);
        int expected3=30;
        assertEquals(expected3, actual3);
    }

    @Test
    void testInnerSquareArea() throws Exception {
        double actual1=Methods.innerSquareArea(36);
        double expected1=18;
        assertEquals(expected1, actual1);

        double actual2=Methods.innerSquareArea(64);
        double expected2=32;
        assertEquals(expected2, actual2);
    }

    @Test
    void testDifferenceOfAreas() throws Exception {
        int actual1=Methods.differenceOfAreas(36);
        int expected1=2;
        assertEquals(expected1, actual1);

        int actual2=Methods.differenceOfAreas(64);
        int expected2=2;
        assertEquals(expected2, actual2);
    }

    @Test
    void testIfThereAre2Evens() {
        boolean actual1=Methods.ifThereAre2Evens(3, 2, 5, 6);
        boolean expected1=true;
        assertEquals(expected1,actual1);

        boolean actual2=Methods.ifThereAre2Evens(3, 7, 5, 6);
        boolean expected2=false;
        assertEquals(expected2,actual2);

        boolean actual3=Methods.ifThereAre2Evens(10, 4, 9, 6);
        boolean expected3=true;
        assertEquals(expected3,actual3);
    }

    @Test
    void testIsPerfect() {
        boolean actual1=Methods.isPerfect(6);
        boolean expected1=true;
        assertEquals(expected1, actual1);

        boolean actual2=Methods.isPerfect(3);
        boolean expected2=false;
        assertEquals(expected2, actual2);

        boolean actual3=Methods.isPerfect(28);
        boolean expected3=true;
        assertEquals(expected3, actual3);
    }

    @Test
    void testHoursMinutesSeconds() throws Exception {
        int [] expected1=Methods.hoursMinutesSeconds(59);
        int [] actual1=new int []{0, 0, 59};
        assertArrayEquals(expected1, actual1);

        int [] expected2=Methods.hoursMinutesSeconds(254);
        int [] actual2={0, 4, 14};
        assertArrayEquals(expected2, actual2);

        int [] expected3=Methods.hoursMinutesSeconds(3601);
        int [] actual3={1, 0, 1};
        assertArrayEquals(expected3, actual3);
    }

    @Test
    void testWhichIsCloserTo00() {
        String actual1=Methods.whichIsCloserTo00(1,1,5,6);
        String expected1="точка А";
        assertEquals(expected1, actual1);

        String actual2=Methods.whichIsCloserTo00(6, 9, 3,2);
        String expected2="точка B";
        assertEquals(expected2, actual2);

        String actual3=Methods.whichIsCloserTo00(0, 0, 4,1);
        String expected3="точка А";
        assertEquals(expected3, actual3);
    }

    @Test
    void testFunction() {
        double actual1=Methods.function(6);
        double expected1=-9;
        assertEquals(expected1, actual1);

        double actual2=Methods.function(0);
        double expected2=-1.0/6;
        assertEquals(expected2, actual2);
    }

    @Test
    void testCircumference() throws Exception {
        double actual1=Methods.circumference(2);
        double expected1=4*Math.PI;
        assertEquals(actual1,expected1);

        double actual2=Methods.circumference(13);
        double expected2=26*Math.PI;
        assertEquals(actual2,expected2);

        double actual3=Methods.circumference(5.5);
        double expected3=11*Math.PI;
        assertEquals(actual3,expected3);
    }

    @Test
    void testSquare() throws Exception {
        double actual1=Methods.square(2);
        double expected1=4*Math.PI;
        assertEquals(actual1,expected1);

        double actual2=Methods.square(13);
        double expected2=169*Math.PI;
        assertEquals(actual2,expected2);

        double actual3=Methods.square(5.5);
        double expected3=30.25*Math.PI;
        assertEquals(actual3,expected3);
    }

    @Test
    void testTang() {
        Map<Double, Double> actual1=Methods.tang(1, 2, 0.5);
        Map<Double, Double> expected1=new HashMap<Double, Double>(){{
            put(1.0, 0.0174550649);
            put(1.5, 0.026185921569);
            put(2.0, 0.034920769492);
        }};
    }
}