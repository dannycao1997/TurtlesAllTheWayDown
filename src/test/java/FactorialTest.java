import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorialFive(){
        // given
        long expected = 120;

        //when
        long actual = Factorial.factorial(5);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialZero(){
        //given
        long expected = 1;

        //when
        long actual = Factorial.factorial(0);

        //then
        Assert.assertEquals(expected, actual);
    }
}
