package org.cs.user.service.abstraction;

import org.cs.user.dto.request.ChangeUserPasswordRequest;
import org.cs.user.dto.request.CreateUserRequest;
import org.cs.user.dto.response.RetrieveUserResponse;

import java.util.Optional;

public interface IUserService {

    void createUser(CreateUserRequest userRequest);

    void updateUserPassword(ChangeUserPasswordRequest passwordRequest);

    void deleteUserByEmailAddress(String emailAddress);

    void deleteUserById(int id);

    Optional<RetrieveUserResponse> selectUserByEmailAddress(String emailAddress);

    Optional<RetrieveUserResponse> selectUserById(int id);

}
