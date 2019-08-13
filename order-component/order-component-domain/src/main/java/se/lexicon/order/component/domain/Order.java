package se.lexicon.order.component.domain;

import com.so4it.annotation.Allowed;
import com.so4it.common.domain.DomainClass;
import com.so4it.common.util.object.Required;
import com.so4it.common.util.object.ValueObject;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@DomainClass
public class Order extends ValueObject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Allowed(types={Allowed.Type.NULLABLE})
    private String id;

    private String ssn;

    private BigDecimal amount;

    private Instant insertionTimestamp;

    private String instrument;

    private Integer noOfItems;

    private Money minMaxValue;

    private Side side;

    private OrderPriceType orderPriceType;

    @Allowed(types = {Allowed.Type.NULLABLE})
    private String  orderBookId;

    @Allowed(types = {Allowed.Type.NULLABLE})
    private OrderDeals orderDeals;

    private Order(){

    }

    private Order(Builder builder){
        this.id= builder.id;
        this.ssn= Required.notNull(builder.ssn,"ssn");
        this.amount= Required.notNull(builder.amount,"amount");
        this.insertionTimestamp=Required.notNull(builder.insertionTimestamp,"insertionTimestamp");
        this.instrument=Required.notNull(builder.instrument,"instrument");
        this.noOfItems=Required.notNull(builder.noOfItems,"noOfItems");
        this.minMaxValue=Required.notNull(builder.minMaxValue,"minMaxValue");
        this.side=Required.notNull(builder.side,"side");
        this.orderBookId=builder.orderBookId;
        this.orderPriceType=Required.notNull(builder.orderPriceType,"orderPriceType");
    }



    public String getId(){
        return id;
    }

    public String getSsn(){
        return ssn;
    }

    public BigDecimal getAmount(){
        return amount;

    }

    public Instant getInsertionTimestamp(){
        return insertionTimestamp;
    }

    public String getInstrument(){
        return instrument;
    }

    public Integer getNoOfItems(){
        return noOfItems;
    }

    public Money getMinMaxValue(){
        return minMaxValue;
    }

    public Side getSide(){
        return side;
    }

    public String getOrderBookId(){
        return orderBookId;
    }



    @Override
    protected Object[] getIdFields() {
        return new Object[]{id,ssn,amount,insertionTimestamp,instrument,noOfItems,minMaxValue,orderPriceType,orderBookId,orderPriceType,side};
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder implements com.so4it.common.builder.Builder<Order>{


        private String id;

        private String ssn;

        private BigDecimal amount;

        private String instrument;

        private Instant insertionTimestamp;

        private Money minMaxValue;

        private Side side;

        private OrderPriceType orderPriceType;

        private String orderBookId;

        private Integer noOfItems;



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

        public Builder withInstrument(String instrument){
            this.instrument=instrument;
            return this;
        }

        public Builder withNoOfItems(Integer noOfItems){
            this.noOfItems=noOfItems;
            return this;
        }

        public Builder withMinMaxValue(Money minMaxValue){
            this.minMaxValue=minMaxValue;
            return this;
        }

        public Builder withSide(Side side){
            this.side=side;
            return this;
        }


        public Builder withInsertionTimestamp(Instant insertionTimestamp){
            this.insertionTimestamp=insertionTimestamp;
            return this;
        }

        public Builder withOrderPriceType(OrderPriceType orderPriceType){
            this.orderPriceType=orderPriceType;
            return this;
        }

        public Builder withOrderBookId(String orderBookId){
            this.orderBookId=orderBookId;
            return this;
        }




        @Override
        public Order build(){
            return new Order(this);
        }
    }

}
