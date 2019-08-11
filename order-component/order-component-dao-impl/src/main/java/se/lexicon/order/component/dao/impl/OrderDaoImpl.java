package se.lexicon.order.component.dao.impl;

import com.so4it.component.dao.gs.AbstractSpaceDao;
import org.openspaces.core.GigaSpace;
import se.lexicon.order.component.dao.OrderDao;
import se.lexicon.order.component.entity.OrderEntity;

public class OrderDaoImpl extends AbstractSpaceDao<OrderEntity,String> implements OrderDao {

    public OrderDaoImpl(GigaSpace gigaSpace){
        super(gigaSpace);
    }
}
