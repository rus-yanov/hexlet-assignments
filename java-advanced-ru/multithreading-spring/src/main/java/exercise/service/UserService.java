package exercise.service;

import exercise.model.User;
import exercise.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    // BEGIN
    public Mono<User> create(User user) {
        return userRepository.save(user);
    }

    public Mono<User> findById(Long userId) {
        return userRepository.findById(userId);
    }

    public Mono<User> update(User user, Long userId) {
        return userRepository.findById(userId)
                .flatMap(sourceUser ->
                {
                    sourceUser.setFirstName(user.getFirstName());
                    sourceUser.setLastName(user.getLastName());
                    sourceUser.setEmail(user.getEmail());
                    return userRepository.save(sourceUser);
                });
    }

    public Mono<Void> delete(Long userId) {
        return userRepository.deleteById(userId);
    }
    // END
}
