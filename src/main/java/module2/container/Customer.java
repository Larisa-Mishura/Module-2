package module2.container;

import lombok.Getter;
import java.util.UUID;

@Getter
public class Customer {
    private final String id;
    private String email;
    private int age;

    public Customer(String email, int age) {
        this.id = UUID.randomUUID().toString();
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
