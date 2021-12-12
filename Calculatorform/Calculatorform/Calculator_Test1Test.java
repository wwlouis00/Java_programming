import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Calculator_Test1Test {

        static Calculator_Test1 calc = new Calculator_Test1();

        @ Test
        public void testAddSub() {
            try {
                calc.testClick("CLEAR");
                calc.testClick("1");
                calc.testClick("+");
                calc.testClick("2");
                calc.testClick("=");
            }
            catch (Exception e) {
                System.out.println(e.getMessage()); }
            double result = calc.getResult();
            assertEquals(3, result, 0);
        }

        public static void main(String[] args) {
            calc.showWindow();
            Result result = JUnitCore.runClasses(Calculator_Test1Test.class);
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
            System.out.println(result.wasSuccessful());
        }
    }