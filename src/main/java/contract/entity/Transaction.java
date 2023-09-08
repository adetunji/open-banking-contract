package contract.entity;
import lombok.Data;

import java.util.Date;

@Data
public class Transaction {
    private String type;
    private Date date;
    private String accountNumber;
    private String merchantName;
    private String merchantLogo;

}
