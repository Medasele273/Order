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
        using=Orders.Deserialize.class
)
@JsonSerialize(
        using = Orders.Serialize.class
)
public class Orders extends AbstractIterable<Order> {

    private static final long serialVersionUID =1L;

    public Orders(){
        super(Order.class,Orders.class);
    }

    public static Orders valueOf(Order... endpointRegistrations){
        return (Orders) AbstractIterable.valueOf(endpointRegistrations,Order.class,Orders.class);
    }

    public static Orders valueOf(Set<Order> endpointRegistrations){
        return (Orders) AbstractIterable.valueOf(endpointRegistrations,Order.class,Orders.class);
    }

    public static Orders valueOf(Iterable<Order> endpointRegistrations){
        return (Orders) AbstractIterable.valueOf(endpointRegistrations,Order.class,Orders.class);
    }

    public Map<String,Orders> map(Function<Order,String> mapper){return null;}

    public static class Serialize extends AbstractIterableSerializer<Order>{

        protected Serialize(){
            super(Order.class,Orders.class);
        }
    }

    public static class Deserialize extends AbstractIterableDeserializer<Order>{

        protected Deserialize(){
            super(Order.class,Orders.class);
        }
    }
}
