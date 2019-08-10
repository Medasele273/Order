package se.lexicon.order.component.domain;

import com.so4it.common.domain.DomainClass;
import com.so4it.common.util.object.Required;
import com.so4it.common.util.object.ValueObject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;

@DomainClass
public class Money extends ValueObject implements Serializable {
    private static final long serialVersionUID=1l;

    private BigDecimal amount;
    private Currency currency;

    private Money(){

    }

    private Money(Builder builder){
        this.amount= Required.notNull(builder.amount,"amount");
        this.currency= Required.notNull(builder.currency,"currency");
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public Currency getCurrency(){
        return currency;
    }


    @Override
    protected Object[] getIdFields() {
        return new Object[]{amount,currency};
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder implements com.so4it.common.builder.Builder<Money>{

        private BigDecimal amount;
        private Currency currency;

        public Builder withAmount(BigDecimal amount){
            this.amount=amount;
            return this;
        }

        public Builder withCurrency(Currency currency){
            this.currency=currency;
            return this;
        }

        @Override
        public  Money build(){
            return new Money(this);
        }
    }
}
