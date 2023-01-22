package spring_boot_security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot_security.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
    Role getRoleByName(String name);
}
