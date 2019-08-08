import org.junit.Assert;
import org.junit.Test;

public class TestSumOfNatural {

    @Test
    public void testNatural_10_success(){
        long expected = 23;
        long actual = NaturalNumber.sumOfNatural(10);
        Assert.assertEquals(expected, actual );
    }

    @Test
    public void testNatural_1000_success(){
        long expected = 233168;
        long actual = NaturalNumber.sumOfNatural(1000);
        Assert.assertEquals(expected, actual );
    }

    @Test
    public void testNatural_0_success(){
        long expected = 0;
        long actual = NaturalNumber.sumOfNatural(0);
        Assert.assertEquals(expected, actual );
    }

    @Test
    public void testNatural_Negative_success(){
        long expected = 0; //natural number is only positives,so checking if returns 0
        long actual = NaturalNumber.sumOfNatural(-10);
        Assert.assertEquals(expected, actual );
    }

    @Test
    public void testNatural_IntOverflowtoLong_success(){
        long expected = 1076060070465310994L; //natural number is only positives,so checking if returns 0
        long actual = NaturalNumber.sumOfNatural(Integer.MAX_VALUE);
        Assert.assertEquals(expected, actual );
    }

}
