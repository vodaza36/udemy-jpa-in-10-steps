package at.hochbichler.jpa.jpain10steps.service;

import at.hochbichler.jpa.jpain10steps.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
