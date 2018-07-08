package com.learn.repository;

import com.learn.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by farhans on 6/15/18.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{

    Role findByRole(String role);
}
