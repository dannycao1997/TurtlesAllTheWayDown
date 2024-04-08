import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorialFive(){
        // given
        Integer expected = 120;

        //when
        Integer actual = Factorial.factorial(5);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialZero(){
        //given
        Integer expected = 1;

        //when
        Integer actual = Factorial.factorial(0);

        //then
        Assert.assertEquals(expected, actual);
    }
}
