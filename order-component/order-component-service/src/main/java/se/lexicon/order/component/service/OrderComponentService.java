package se.lexicon.order.component.service;

import com.so4it.gs.rpc.Routing;
import se.lexicon.order.component.domain.Order;

public interface OrderComponentService {

    String DEFAULT_BEAN_NAME="orderComponentService";

    void placeOrder(@Routing("getInstrument") Order Order);


}
