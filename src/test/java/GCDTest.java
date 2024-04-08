import org.junit.Test;
import org.junit.Assert;

import java.time.Duration;
import java.time.Instant;


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

    @Test
    public void testTime(){
        //given
        Instant start = Instant.now();
        GCD.gcd(233123,2);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        //when
        Instant start2 = Instant.now();
        GCD.gcd2(233123,2);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();

        //then
        Assert.assertEquals(false, timeElapsed > timeElapsed2);
        System.out.println(timeElapsed);
        System.out.println(timeElapsed2);
    }
}
