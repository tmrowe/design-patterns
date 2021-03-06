package tmr.design.pattern.strategy.movie.price;

import org.joda.money.Money;
import org.junit.Assert;
import org.junit.Test;

public class TestRegularPrice {

    @Test
    public void testGetPriceDaysRentedLessThan2() {
        RegularPrice pricing = new RegularPrice();
        Money result = pricing.getPrice(0);
        Money expected = Money.parse("USD 2");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetPriceDaysRentedGreaterThan2() {
        RegularPrice pricing = new RegularPrice();
        Money result = pricing.getPrice(5);
        Money expected = Money.parse("USD 6.5");
        Assert.assertEquals(expected, result);
    }

}
