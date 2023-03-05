package cz.fel.cvut.ts1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Proj1Test {
    @Test
    public void factorialTest() {
        Proj1 proj = new Proj1();
        long expResult = 6;
        int num = 3;

        long result = proj.factorial(num);
        Assertions.assertEquals(expResult, result);
    }
}
