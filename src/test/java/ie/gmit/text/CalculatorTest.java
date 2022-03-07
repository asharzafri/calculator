package ie.gmit.text;

import ie.gmit.Lab1b.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
        Calculator calc = new Calculator();

        @Test
        void justAnExample() {
        }
        @Test
        void testSubtract() {
                assertEquals(7,calc.sub(17, 10));
        }

        @Test
        void testadd(){
                assertEquals(15,calc.add(10,5));

        }


        @Test
        void testdiv(){
                assertEquals(5,calc.add(10,2));

        }


}
