package org.cs.repository;

import org.cs.entity.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {

    Optional<User> findUserByEmailAddress(String emailAddress);

    Optional<User> findUserById(int id);

    void deleteUserByEmailAddress(String emailAddress);

    void deleteUserById(int id);
}
