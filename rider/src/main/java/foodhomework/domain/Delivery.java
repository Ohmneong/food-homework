package foodhomework.domain;

import foodhomework.RiderApplication;
import foodhomework.domain.Delivered;
import foodhomework.domain.Picked;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Delivery_table")
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String adress;

    private String orderid;

    private String status;

    private String customerid;

    @PostPersist
    public void onPostPersist() {
        Picked picked = new Picked(this);
        picked.publishAfterCommit();

        Delivered delivered = new Delivered(this);
        delivered.publishAfterCommit();
    }

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = RiderApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }

    public static void updateStatus(CookFinished cookFinished) {
        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookFinished.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

    }
}
