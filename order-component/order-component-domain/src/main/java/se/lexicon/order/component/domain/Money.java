package se.lexicon.order.component.domain;

import com.so4it.common.util.object.ValueObject;

import java.io.Serializable;

public class Money extends ValueObject implements Serializable {
    @Override
    protected Object[] getIdFields() {
        return new Object[0];
    }
}
