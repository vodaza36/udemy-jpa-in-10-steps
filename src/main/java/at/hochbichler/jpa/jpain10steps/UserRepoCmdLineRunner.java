package at.hochbichler.jpa.jpain10steps;

import at.hochbichler.jpa.jpain10steps.entity.User;
import at.hochbichler.jpa.jpain10steps.service.UserDAOService;
import at.hochbichler.jpa.jpain10steps.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepoCmdLineRunner implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRepoCmdLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Thomas", "admin");
        userRepository.save(user);

        LOGGER.info("Add user with id {}", user.getId());
    }
}
