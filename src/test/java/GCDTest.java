import org.junit.Test;
import org.junit.Assert;

public class GCDTest {
    @Test
    public void testGCDTwentyFour(){
        //given
        Integer expected = 24;

        //when
        Integer actual = GCD.gcd(1440, 408);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCDSix(){
        //given
        Integer expected = 6;

        //when
        Integer actual = GCD.gcd(12,6);

        //then
        Assert.assertEquals(expected, actual);
    }

}
