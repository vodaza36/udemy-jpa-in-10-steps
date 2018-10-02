package at.hochbichler.jpa.jpain10steps.service;

import at.hochbichler.jpa.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {
    @PersistenceContext
    private EntityManager entityManager;

    public long insertUser(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}
