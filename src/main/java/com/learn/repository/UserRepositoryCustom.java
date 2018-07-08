package com.learn.repository;

import com.learn.entities.User;
import org.springframework.stereotype.Repository;

/**
 * Created by farhans on 6/18/18.
 */
@Repository
public interface UserRepositoryCustom {
    User findByEmailUsingJpql(String email);
    User findByEmailUsingJpqlTypedQuery(String email);
    User findByEmailUsingNativeQuery(String email);
    User findByEmailUsingNamedQuery(String email);
    User findByEmailUsingCriteriaQuery(String email);
}
