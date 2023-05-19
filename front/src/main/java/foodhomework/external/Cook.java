package foodhomework.external;

import java.util.Date;
import lombok.Data;

@Data
public class Cook {

    private Long id;
    private String status;
    private String food;
    private String customerid;
    private String orderid;
}
