package spring_boot_security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot_security.model.User;

public interface UserDao extends JpaRepository<User, Long> {

    User getUserByUsername(String username);
}
