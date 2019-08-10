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
        using = OrderBooks.Deserialize.class
)
@JsonSerialize(
        using = OrderBooks.Serialize.class
)
public class OrderBooks extends AbstractIterable<OrderBook> {

    public OrderBooks(){
        super(OrderBook.class,OrderBooks.class);
    }

    public static OrderBooks valueOf(OrderBook... endpointRegistrations){
        return (OrderBooks) AbstractIterable.valueOf(endpointRegistrations,OrderBook.class,OrderBooks.class);
    }

    public static OrderBooks valueOf(Set<OrderBook> endpointRegistrations){
        return (OrderBooks) AbstractIterable.valueOf(endpointRegistrations,OrderBook.class,OrderBooks.class);
    }

    public static OrderBooks valueOf(Iterable<OrderBook> endpointRegistrations){
        return (OrderBooks) AbstractIterable.valueOf(endpointRegistrations,OrderBook.class,OrderBooks.class);
    }

    public Map<String,OrderBooks> map(Function<OrderBook,String> mapper){return null;}

    public static class Deserialize extends AbstractIterableDeserializer<OrderBook>{
        protected Deserialize(){
            super(OrderBook.class,OrderBooks.class);
        }
    }

    public static class Serialize extends AbstractIterableSerializer<OrderBook>{
        protected Serialize(){
            super(OrderBook.class,OrderBooks.class);
        }
    }
}
