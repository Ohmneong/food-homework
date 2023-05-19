package foodhomework.domain;

import foodhomework.domain.*;
import foodhomework.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private String orderid;
    private String status;
    private String foodid;

    public Paid(Payment aggregate) {
        super(aggregate);
    }

    public Paid() {
        super();
    }
}
