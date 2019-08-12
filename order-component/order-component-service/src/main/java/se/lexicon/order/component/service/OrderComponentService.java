package se.lexicon.order.component.service;

import com.so4it.gs.rpc.Routing;
import se.lexicon.order.component.domain.Order;

public interface OrderComponentService {

    void placeOrder(@Routing("getInstrument") Order Order);


}
