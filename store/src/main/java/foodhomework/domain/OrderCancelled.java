package foodhomework.domain;

import foodhomework.domain.*;
import foodhomework.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String foodid;
    private String customerid;
    private String address;
}
