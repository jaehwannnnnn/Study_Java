package chapter12.section3.example5;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private String id;
    @NonNull private String name;
    private int age;
}
