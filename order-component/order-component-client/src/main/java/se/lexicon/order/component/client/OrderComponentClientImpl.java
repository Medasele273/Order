package se.lexicon.order.component.client;

import com.so4it.common.util.object.Required;
import se.lexicon.order.component.domain.Order;
import se.lexicon.order.component.service.OrderComponentService;

public class OrderComponentClientImpl implements OrderComponentClient {

    private OrderComponentService orderComponentService;

    public OrderComponentClientImpl(OrderComponentService orderComponentService){
        this.orderComponentService= Required.notNull(orderComponentService,"OrderComponentService");
    }

    @Override
    public void placeOrder(Order order) {
     orderComponentService.placeOrder(order);

    }
}
