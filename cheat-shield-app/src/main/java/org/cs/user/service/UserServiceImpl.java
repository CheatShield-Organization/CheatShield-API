package org.cs.user.service;

import org.cs.entity.User;
import org.cs.repository.UserRepository;
import org.cs.user.utility.validation.UserValidator;
import org.cs.user.dto.request.ChangeUserPasswordRequest;
import org.cs.user.dto.request.CreateUserRequest;
import org.cs.user.dto.response.RetrieveUserResponse;
import org.cs.user.service.abstraction.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;
    private UserValidator userValidator;

    public UserService(UserRepository userRepository, UserValidator userValidator) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
    }


    @Override
    public void createUser(CreateUserRequest userRequest){

        userValidator.ensureUserNotExistsByEmail(userRequest.emailAddress());

        User user = new User();

        user.setUsername(userRequest.username());
        user.setEmailAddress(userRequest.emailAddress());
        user.setPassword(String.valueOf(userRequest.password().hashCode()));
        user.setRole(userRequest.role());

        userRepository.save(user);
    }

    @Transactional
    @Override
    public void updateUserPassword(ChangeUserPasswordRequest passwordRequest) {

        userValidator.ensureUserExistsByEmail(passwordRequest.emailAddress());

        User user = userRepository.findUserByEmailAddress(passwordRequest.emailAddress()).get();

        user.setPassword(String.valueOf(passwordRequest.newPassword().hashCode()));

        userRepository.save(user);

    }

    @Transactional
    @Override
    public void deleteUserByEmailAddress(String emailAddress) {

        userValidator.ensureUserExistsByEmail(emailAddress);

        userRepository.deleteUserByEmailAddress(emailAddress);
    }

    @Transactional
    @Override
    public void deleteUserById(int id) {

        userValidator.ensureUserExistsById(id);

        userRepository.deleteUserById(id);
    }

    @Override
    public Optional<RetrieveUserResponse> selectUserByEmailAddress(String emailAddress) {

        userValidator.ensureUserExistsByEmail(emailAddress);

        User user = userRepository.findUserByEmailAddress(emailAddress).get();

        return Optional.of(new RetrieveUserResponse(user.getUsername(), user.getEmailAddress(), user.getRole()));

    }

    @Override
    public Optional<RetrieveUserResponse> selectUserById(int id) {

        userValidator.ensureUserExistsById(id);

        User user = userRepository.findUserById(id).get();

        return Optional.of(new RetrieveUserResponse(user.getUsername(), user.getEmailAddress(), user.getRole()));

    }
}
