package se.lexicon.order.component.entity;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.so4it.component.entity.IdEntity;

@SpaceClass
public class OrderEntity extends IdEntity<String> {

    @Override
    public String getId() {
        return null;
    }
}
