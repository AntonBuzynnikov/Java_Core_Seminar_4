package Market.models;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Customer {
    private String name;
    private int age;
    private String phone;
    private Gender gender;
}
