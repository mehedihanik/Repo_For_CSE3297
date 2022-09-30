import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void TestcheckForPrime() {
        PrimeNumberProgram primeNumberProgram = new PrimeNumberProgram();
        boolean results = PrimeNumberProgram.checkForPrime(7);
        assertEquals(true, results);
    }

    @org.junit.Test
    public void TestcheckLeapYear() {
        LeapYear leapYear = new LeapYear();
        boolean rslt = LeapYear.checkLeapYear(2001);
        assertEquals(false, rslt);
    }

    @org.junit.Test
    public void Testcalculatesum() {
        Sum sum = new Sum();
        double rslts = Sum.calculatesum(4.00, 12.00);
        assertEquals(2.40, rslts, 2);
    }

}
