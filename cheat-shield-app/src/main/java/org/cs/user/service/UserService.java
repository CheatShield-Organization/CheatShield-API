package org.cs.user.service.abstraction;

import lombok.SneakyThrows;
import org.cs.entity.User;
import org.cs.repository.IUserRepository;
import org.cs.user.dto.request.ChangePasswordRequest;
import org.cs.user.dto.request.CreateUserRequest;
import org.cs.user.exception.UserAlreadyExistException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    private IUserRepository userRepository;

    private User user;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @SneakyThrows
    @Override
    public void createUser(CreateUserRequest userRequest) {

        if(selectUserByEmailAddress(userRequest.emailAddress()) == null) {
            throw new UserAlreadyExistException("This user already exist!");
        }

        user = new User();

        user.setUsername(userRequest.username());
        user.setEmailAddress(userRequest.emailAddress());
        user.setPassword(String.valueOf(userRequest.password().hashCode()));
        user.setRole(userRequest.role());

        userRepository.save(user);
    }

    @Override
    public void updateUserPassword(ChangePasswordRequest passwordRequest) {



    }

    @Override
    public void deleteUserByEmailAddress(String emailAddress) {

    }

    @Override
    public void deleteUserById(int id) {

    }

    @Override
    public User selectUserByEmailAddress(String emailAddress) {
        return null;
    }

    @Override
    public User selectUserById(int id) {
        return null;
    }
}
