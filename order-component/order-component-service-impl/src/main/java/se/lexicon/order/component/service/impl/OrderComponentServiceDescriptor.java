package se.lexicon.order.component.service.impl;

import com.so4it.gs.rpc.Component;
import com.so4it.gs.rpc.ServiceBindingType;
import se.lexicon.order.component.service.OrderComponentServiceProvider;

@Component(
        name="checkout",
        serviceProviders={
                OrderComponentServiceProvider.class

},    defaultServiceType=ServiceBindingType.GS_REMOTING

)

public class OrderComponentServiceDescriptor {
}
