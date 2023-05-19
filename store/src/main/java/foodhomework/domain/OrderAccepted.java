package foodhomework.domain;

import foodhomework.domain.*;
import foodhomework.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String status;
    private String food;
    private String customerid;
    private String orderid;

    public OrderAccepted(Cook aggregate) {
        super(aggregate);
    }

    public OrderAccepted() {
        super();
    }
}
