package se.lexicon.order.component.service.impl;

import com.so4it.common.util.object.Required;
import com.so4it.gs.rpc.Routing;
import se.lexicon.order.component.dao.OrderDao;
import se.lexicon.order.component.domain.Order;
import se.lexicon.order.component.entity.OrderEntity;
import se.lexicon.order.component.service.OrderComponentService;

public class OrderComponentServiceImpl implements OrderComponentService {

     private OrderDao  orderDao;

     public OrderComponentServiceImpl(OrderDao orderDao){
         this.orderDao = Required.notNull(orderDao,"orderDao");
     }

     @Override
    public  void placeOrder(Order order) {
         OrderEntity orderEntity = OrderEntity.builder()
                 .withId(order.getId())
                 .withSsn(order.getSsn())
                 .withAmount(order.getAmount())
                 .withInstrument(order.getInstrument())
                 .withSide(order.getSide())
                 .withNoOfItemsToMatch(order.getNoOfItems())
                 .withNoOfItems(order.getNoOfItems())
                 .withInsertionTimestamp(order.getInsertionTimestamp())
                 .withMinMaxValue(order.getMinMaxValue())
                 .withAllItemsMatched(false)
                 .build();
         orderDao.insert(orderEntity);

     }
}
