package se.lexicon.order.component.domain;

import com.so4it.common.domain.DomainClass;
import com.so4it.common.util.object.Required;
import com.so4it.common.util.object.ValueObject;

import java.io.Serializable;
import java.math.BigDecimal;

@DomainClass
public class Order extends ValueObject implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String ssn;
    private BigDecimal amount;

    private Order(){

    }

    private Order(Builder builder){
        this.id= Required.notNull(builder.id,"id");
        this.ssn= Required.notNull(builder.ssn,"ssn");
        this.amount= Required.notNull(builder.amount,"amount");
    }



    public String getId(){
        return id;
    }

    private String getSsn(){
        return ssn;
    }

    private BigDecimal getAmount(){
        return amount;

    }

    @Override
    protected Object[] getIdFields() {
        return new Object[]{id,ssn,amount};
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder implements com.so4it.common.builder.Builder<Order>{

        private String id;

        private String ssn;

        private BigDecimal amount;

        public Builder withId(String id){
            this.id=id;
            return this;
        }

        public Builder withSsn(String ssn){
            this.ssn=ssn;
            return this;
        }

        public Builder withAmount(BigDecimal amount){
            this.amount=amount;
            return this;
        }

        @Override
        public Order build(){
            return new Order(this);
        }
    }

}
