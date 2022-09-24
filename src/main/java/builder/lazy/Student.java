package builder.lazy;

import lombok.Builder;
import lombok.Data;

@Data //Getter, Setter, ToString, HashCode
@Builder

public class Student {
    private String cnp;
    private String name;
    private String email;
    private String phoneNumber;


}
