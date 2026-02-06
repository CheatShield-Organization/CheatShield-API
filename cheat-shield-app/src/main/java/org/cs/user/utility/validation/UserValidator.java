package org.cs.user.configuration;

import org.cs.exception.runtime.UserAlreadyExistException;
import org.cs.exception.runtime.UserNotExistException;
import org.cs.repository.IUserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserValidator {

    private final IUserRepository userRepository;

    public UserValidator(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void ensureUserExistsByEmail(String email){
        if(userRepository.findUserByEmailAddress(email).isEmpty()) {
            throw new UserNotExistException("This user does not exist!");
        }
    }

    public void ensureUserNotExistsByEmail(String email){
        if(userRepository.findUserByEmailAddress(email).isPresent()) {
            throw new UserAlreadyExistException("This user already exist!");
        }
    }

    public void ensureUserExistsById(int id){
        if(userRepository.findUserById(id).isEmpty()) {
            throw new UserNotExistException("This user does not exist!");
        }
    }

    public void ensureUserNotExistsById(int id){
        if(userRepository.findUserById(id).isPresent()) {
            throw new UserAlreadyExistException("This user already exist!");
        }
    }
}
