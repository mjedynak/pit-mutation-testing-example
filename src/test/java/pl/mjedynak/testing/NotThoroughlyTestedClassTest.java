package pl.mjedynak.testing;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NotThoroughlyTestedClassTest {
    
    private NotThoroughlyTestedClass testedClass = new NotThoroughlyTestedClass();
    
    private int number;
    
    @Test
    public void shouldReturnTrueWhenNumberHigherThanZero() {
        // given
        number = 1;
           
        // when
        boolean result = testedClass.isHigherOrEqualToZero(number);

        // then
        assertThat(result, is(true));
    }


    @Test
    public void shouldReturnFalseWhenNumberLowerThanZero() {
        // given
        number = -1;

        // when
        boolean result = testedClass.isHigherOrEqualToZero(number);

        // then
        assertThat(result, is(false));
    }
}
