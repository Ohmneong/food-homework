package foodhomework.domain;

import foodhomework.domain.*;
import foodhomework.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String status;
    private String food;
    private String customerid;
    private String orderid;

    public OrderRejected(Cook aggregate) {
        super(aggregate);
    }

    public OrderRejected() {
        super();
    }
}
