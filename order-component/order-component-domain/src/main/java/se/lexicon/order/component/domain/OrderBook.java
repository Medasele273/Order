package se.lexicon.order.component.domain;

import com.so4it.annotation.Allowed;
import com.so4it.common.domain.DomainClass;
import com.so4it.common.util.object.Required;
import com.so4it.common.util.object.ValueObject;

import java.io.Serializable;

@DomainClass
public class OrderBook extends ValueObject implements Serializable {

     @Allowed(types = {Allowed.Type.NULLABLE})
     private String id;
     private Integer noOfItems;
     private Money maxMinValue;
     private String instrument;
     private Side side;
     private Phase phase;

     private OrderBook(){

     }

     private OrderBook(Builder builder){
         this.id=builder.id;
         this.noOfItems= Required.notNull(builder.noOfItems,"noOfItems");
         this.maxMinValue= Required.notNull(builder.minMaxValue,"minMaxValue");
         this.instrument= Required.notNull(builder.instrument,"instrument");
         this.side= Required.notNull(builder.side,"side");
         this.phase= Required.notNull(builder.phase,"phase");
     }

     public String getId(){
         return id;
     }

     public Integer getNoOfItems(){
         return noOfItems;
     }

     public Money getMaxMinValue(){
         return maxMinValue;
     }

     public String getInstrument(){
         return instrument;
     }

     public Side getSide(){
         return side;
     }

     public Phase getPhase(){
         return phase;
     }

    @Override
    protected Object[] getIdFields() {
        return new Object[]{id,noOfItems,maxMinValue,instrument,side,phase};
    }

    public static Builder builder(){
         return new Builder();
    }

    public static class Builder  implements com.so4it.common.builder.Builder<OrderBook>{

         private String id;
         private String instrument;
         private Integer noOfItems;
         private Money minMaxValue;
         private Side side;
         private Phase phase;

         public Builder withId(String id){
             this.id=id;
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

         public Builder withPhase(Phase phase){
             this.phase=phase;
             return this;
         }

        @Override
        public OrderBook build() {
            return new OrderBook(this);
        }
    }
}
