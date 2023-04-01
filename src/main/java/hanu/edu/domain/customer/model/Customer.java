package hanu.edu.domain.customer.model;

import hanu.edu.domain.user.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Customer extends User {
    public Customer(long id, String username, String email, String password, boolean enabled, String role, String name, int age, String address, String avatar, String phone) {
        super(id, username, email, password, enabled, role, name, age, address, avatar, phone);
    }

}
