package se.lexicon.order.component.test.common.domain;

import com.so4it.common.util.object.Required;
import com.so4it.test.domain.AbstractTestBuilder;
import se.lexicon.order.component.domain.Money;
import se.lexicon.order.component.domain.Order;
import se.lexicon.order.component.domain.Side;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Currency;

public class OrderTestBuilder extends AbstractTestBuilder<Order> {

    private Order.Builder builder;

    public OrderTestBuilder(Order.Builder builder){
        this.builder= Required.notNull(builder,"builder");
        this.builder
                  .withId("11111111")
                  .withSsn("11111111")
                  .withAmount(BigDecimal.TEN)
                  .withInstrument("ABB")
                .withNoOfItems(100)
                .withSide(Side.BUY)
                .withInsertionTimestamp(Instant.now())
                .withMinMaxValue(Money.builder()
                .withAmount(BigDecimal.valueOf(500d))
                .withCurrency(Currency.getInstance("SEK")))
                .build().build();

    }

    public OrderTestBuilder withId(String id){
        builder.withId(id);
        return this;
    }

    public OrderTestBuilder withSsn(String ssn){
        builder.withSsn(ssn);
        return this;
    }

    public OrderTestBuilder withAmount(BigDecimal amount){
        builder.withAmount(amount);
        return this;
    }

    public OrderTestBuilder withInstrument(String instrument){
        builder.withInstrument(instrument);
        return this;
    }
    public OrderTestBuilder withNoOfItems(Integer noOfItems){
        builder.withNoOfItems(noOfItems);
        return this;
    }

    public OrderTestBuilder withSide(Side side){
        builder.withSide(side);
        return this;
    }

    public OrderTestBuilder withInsertionTimestamp(Instant insertionTimestamp){
        builder.withInsertionTimestamp(insertionTimestamp);
        return this;
    }


    @Override
    public Order build() {
        return builder.build();
    }
}
