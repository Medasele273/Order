package se.lexicon.order.component.test.common.entity;

import com.so4it.common.util.object.Required;
import com.so4it.test.domain.AbstractTestBuilder;
import se.lexicon.order.component.domain.Money;
import se.lexicon.order.component.domain.Side;
import se.lexicon.order.component.entity.OrderEntity;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Currency;

public class OrderEntityTestBuilder extends AbstractTestBuilder<OrderEntity> {

     private OrderEntity.Builder builder;

     public OrderEntityTestBuilder(OrderEntity.Builder builder){
         this.builder= Required.notNull(builder,"builder");
         this.builder
                 .withId("1111111")
                 .withSsn("1111111")
                 .withAmount(BigDecimal.TEN)
                 .withSide(Side.BUY)
                 .withInstrument("ABB")
                 .withNoOfItems(100)
                 .withMinMaxValue(Money.builder().withAmount(BigDecimal.valueOf(100d))
                         .withCurrency(Currency.getInstance("SEK")).build())
                 .withInsertionTimestamp(Instant.now())
                 .withNoOfItemsToMatch(100)
                 .withAllItemsMatched(false);
     }

     public OrderEntityTestBuilder withId(String id){
         builder.withId(id);
         return this;
     }
    public OrderEntityTestBuilder withSsn(String ssn){
        builder.withSsn(ssn);
        return this;
    }

    public OrderEntityTestBuilder withAmount(BigDecimal amount){
        builder.withAmount(amount);
        return this;
    }

    public OrderEntityTestBuilder withInstrument(String instrument){
        builder.withInstrument(instrument);
        return this;
    }

    public OrderEntityTestBuilder withMinMaxValue(Money minMaxValue){
        builder.withMinMaxValue(minMaxValue);
        return this;
    }

    public OrderEntityTestBuilder withSide(Side side){
        builder.withSide(side);
        return this;
    }

    public OrderEntityTestBuilder withNoOfItems(Integer noOfItems){
        builder.withNoOfItems(noOfItems);
        return this;
    }

    public OrderEntityTestBuilder withNoOfItemsToMatch(Integer noOfItemsToMatch){
        builder.withNoOfItemsToMatch(noOfItemsToMatch);
        return this;
    }

    public OrderEntityTestBuilder withAllItemsMatched(Boolean allItemsMatched){
        builder.withAllItemsMatched(allItemsMatched);
        return this;
    }

    public static OrderEntityTestBuilder builder(){
         return new OrderEntityTestBuilder(OrderEntity.builder());
    }

    @Override
    public OrderEntity build() {
        return builder.build();
    }
}
