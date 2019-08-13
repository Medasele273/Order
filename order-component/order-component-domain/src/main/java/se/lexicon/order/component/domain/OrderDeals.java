package se.lexicon.order.component.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.so4it.common.domain.AbstractIterable;
import com.so4it.common.domain.AbstractIterableDeserializer;
import com.so4it.common.domain.AbstractIterableSerializer;
import com.so4it.common.domain.DomainClass;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;

@DomainClass
@JsonDeserialize(
        using = OrderDeals.Deserializer.class
)
@JsonSerialize(
        using = OrderDeals.Serializer.class
)
public class OrderDeals extends AbstractIterable<OrderDeal> {

    private static final long serialVersionUID = 1l;

    public OrderDeals(){
        super(OrderDeal.class,OrderDeals.class);
    }

    public static OrderDeals valueOf(OrderDeal... endpointRegistrations){
        return (OrderDeals) AbstractIterable.valueOf(endpointRegistrations,OrderDeal.class,OrderDeals.class);
    }

    public static OrderDeals valueOf(Set<OrderDeal> endpointRegistrations){
        return (OrderDeals) AbstractIterable.valueOf(endpointRegistrations,OrderDeal.class,OrderDeals.class);
    }

    public static OrderDeals valuerOf(Iterable<OrderDeal> endpointRegistrations){
        return (OrderDeals) AbstractIterable.valueOf(endpointRegistrations,OrderDeal.class,OrderDeals.class);
    }

    public Map<String,OrderDeal> map(Function<OrderDeals,String> mapper){return null;}

    public static class Deserializer extends AbstractIterableDeserializer<OrderDeal>{

        protected Deserializer (){
            super(OrderDeal.class,OrderDeals.class);
        }
    }

    public static class Serializer extends AbstractIterableSerializer<OrderDeal> {

        protected Serializer(){
            super(OrderDeal.class,OrderDeals.class);
        }
    }
}
