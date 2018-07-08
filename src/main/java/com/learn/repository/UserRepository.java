package com.learn.repository;

import com.learn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by farhans on 6/15/18.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>,UserRepositoryCustom{

    User findByEmail(String email);

}
